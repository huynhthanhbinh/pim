package com.bht.pim.fragment.project;

import com.bht.pim.configuration.AppConfiguration;
import com.bht.pim.dto.ProjectDto;
import com.bht.pim.message.impl.FragmentSwitching;
import com.bht.pim.message.impl.MainLabelUpdating;
import com.bht.pim.notification.NotificationStyle;
import com.bht.pim.service.ProjectService;
import com.bht.pim.util.NotificationUtil;
import com.bht.pim.util.ProjectUtil;
import com.sun.javafx.scene.control.skin.TableHeaderRow;
import com.sun.javafx.scene.control.skin.TableViewSkinBase;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import lombok.extern.log4j.Log4j;
import org.jacpfx.api.annotations.Resource;
import org.jacpfx.api.annotations.fragment.Fragment;
import org.jacpfx.api.fragment.Scope;
import org.jacpfx.rcp.context.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.Objects;
import java.util.ResourceBundle;

@Log4j
@Controller
@Fragment(id = AppConfiguration.FRAGMENT_PROJECT_LIST,
        resourceBundleLocation = AppConfiguration.LANGUAGE_BUNDLES,
        scope = Scope.PROTOTYPE,
        viewLocation = "/com/bht/pim/fragment/project/ProjectList.fxml")
public class ProjectList implements Initializable {

    private final Image delete = getImage("delete");
    private final Image edit = getImage("edit");
    private final Image delete_inverse = getImage("delete_inverse");
    private final Image edit_inverse = getImage("edit_inverse");


    @Autowired
    private ProjectService projectService;
    @Autowired
    private ProjectUtil projectUtil;


    @Resource
    private Context context;
    @Resource
    private ResourceBundle bundle;
    @FXML
    private VBox mainPane;
    @FXML
    private Button bDelete;
    @FXML
    private Button bNew;
    @FXML
    private TableView<ProjectDto> table;
    @FXML
    private TableColumn<ProjectDto, ProjectDto> cSelect;
    @FXML
    private TableColumn<ProjectDto, Long> cNumber;
    @FXML
    private TableColumn<ProjectDto, ProjectDto> cName;
    @FXML
    private TableColumn<ProjectDto, String> cCustomer;
    @FXML
    private TableColumn<ProjectDto, String> cStatus;
    @FXML
    private TableColumn<ProjectDto, LocalDate> cStart;
    @FXML
    private TableColumn<ProjectDto, ProjectDto> cManagement;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // Init this scene code go here
        log.info("[Project List] On init scene ");

        MainLabelUpdating mainLabelUpdating = new MainLabelUpdating(
                AppConfiguration.FRAGMENT_PROJECT_LIST,
                AppConfiguration.LABEL_PROJECT_LIST);

        context.send(AppConfiguration.COMPONENT_MAIN, mainLabelUpdating);

        Pane main = context.getComponentLayout().getGlassPane();
        mainPane.prefWidthProperty().bind(main.widthProperty().subtract(227));
        mainPane.prefHeightProperty().bind(main.heightProperty().subtract(100));


        // Get all necessary data from server
        getNecessaryData();

        // Init all inputs
        initAllFields();

        // Add all event-listener
        addAllEventListener();
    }


    // Get all necessary data
    private void getNecessaryData() {
        table.setItems(projectService.getAllProjects());
    }

    // Init all table fields
    private void initAllFields() {
        cSelect.prefWidthProperty().bind(table.widthProperty().subtract(18).multiply(0.05));
        cSelect.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        cSelect.setCellFactory(this::select);
        cSelect.setResizable(false);

        cNumber.prefWidthProperty().bind(table.widthProperty().subtract(18).multiply(0.1));
        cNumber.setCellValueFactory(new PropertyValueFactory<>("number"));
        cNumber.setResizable(false);

        cName.prefWidthProperty().bind(table.widthProperty().subtract(18).multiply(0.3));
        cName.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        cName.setCellFactory(this::name);
        cName.setResizable(false);

        cCustomer.prefWidthProperty().bind(table.widthProperty().subtract(18).multiply(0.25));
        cCustomer.setCellValueFactory(new PropertyValueFactory<>("customer"));
        cCustomer.setResizable(false);

        cStatus.prefWidthProperty().bind(table.widthProperty().subtract(18).multiply(0.1));
        cStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        cStatus.setResizable(false);

        cStart.prefWidthProperty().bind(table.widthProperty().subtract(18).multiply(0.1));
        cStart.setCellValueFactory(new PropertyValueFactory<>("start"));
        cStart.setCellFactory(projectUtil::dateFormat);
        cStart.setResizable(false);

        cManagement.prefWidthProperty().bind(table.widthProperty().subtract(18).multiply(0.1));
        cManagement.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        cManagement.setCellFactory(this::management);
        cManagement.setResizable(false);
    }

    // Add all event-listener
    private void addAllEventListener() {
        table.skinProperty().addListener((observable, oldSkin, newSkin) -> {
            TableHeaderRow header = ((TableViewSkinBase) newSkin).getTableHeaderRow();
            header.reorderingProperty().addListener((observable0, oldValue, newValue) ->
                    header.setReordering(false));
        });

        bNew.setOnMouseClicked(event -> {
            log.info("[NEW] on mouse clicked");

            FragmentSwitching switching = new FragmentSwitching(
                    AppConfiguration.FRAGMENT_PROJECT_LIST,
                    AppConfiguration.FRAGMENT_PROJECT_CREATE);

            context.send(AppConfiguration.COMPONENT_MAIN, switching);
        });
    }

    // Button delete on table row
    private TableCell<ProjectDto, ProjectDto> management(TableColumn<ProjectDto, ProjectDto> param) {
        return new TableCell<ProjectDto, ProjectDto>() {

            private Button bRemove = new Button();
            private Button bEdit = new Button();

            private ImageView iRemove = new ImageView();
            private ImageView iEdit = new ImageView();

            @Override
            protected void updateItem(ProjectDto projectDto, boolean empty) {
                if (projectDto == null || empty) {
                    setGraphic(null);
                    return;
                }

                bRemove.setGraphic(iRemove);
                bEdit.setGraphic(iEdit);

                iRemove.imageProperty().bind(
                        Bindings.when(getTableRow().selectedProperty())
                                .then(delete_inverse)
                                .otherwise(delete));

                iEdit.imageProperty().bind(
                        Bindings.when(getTableRow().selectedProperty())
                                .then(edit_inverse)
                                .otherwise(edit));

                HBox hBox = new HBox();
                hBox.getChildren().addAll(bEdit, bRemove);
                setGraphic(hBox);

                bRemove.setOnAction(event -> {
                    if (!projectDto.getStatus().equals("New")) {
                        NotificationUtil.showNotification(
                                NotificationStyle.ERROR,
                                Pos.CENTER,
                                "Cannot delete project which status is not \"New\"!");
                        return;
                    }
                    log.info("Delete project id = " + projectDto.getId());

                    if (projectService.deleteProject(projectDto.getId())) {
                        NotificationUtil.showNotification(
                                NotificationStyle.SUCCESS,
                                Pos.CENTER,
                                "Successfully delete project !");
                        table.getItems().remove(projectDto);
                    } else {
                        NotificationUtil.showNotification(
                                NotificationStyle.WARNING,
                                Pos.CENTER,
                                "Failed to delete project !");
                    }
                });

                bEdit.setOnAction(event -> {
                    log.info("Edit project id = " + projectDto.getId());
                });
            }
        };
    }

    // Name label - clickable
    private TableCell<ProjectDto, ProjectDto> name(TableColumn<ProjectDto, ProjectDto> param) {
        return new TableCell<ProjectDto, ProjectDto>() {

            private Label lName = new Label();

            @Override
            protected void updateItem(ProjectDto project, boolean empty) {
                if (project == null || empty) {
                    setGraphic(null);
                    return;
                }

                lName.setText(project.getName());
                lName.getStyleClass().add("clickable");
                lName.setPickOnBounds(false);
                lName.setOnMouseClicked(event -> {
                    log.info("view info of project id = " + project.getId());
                });

                setGraphic(lName);
            }
        };
    }

    // Checkbox Select
    private TableCell<ProjectDto, ProjectDto> select(TableColumn<ProjectDto, ProjectDto> param) {
        return new TableCell<ProjectDto, ProjectDto>() {

            @Override
            protected void updateItem(ProjectDto project, boolean empty) {
                if (project == null || empty) {
                    setGraphic(null);
                    return;
                }

                CheckBox checkBox = new CheckBox();
                setGraphic(checkBox);

                checkBox.selectedProperty().addListener(
                        (observable, oldValue, newValue) -> {

                        });
            }
        };
    }

    private Image getImage(String path) {
        return new Image(Objects.requireNonNull(getClass().getClassLoader()
                .getResourceAsStream("pictures/" + path + ".png")));
    }
}
