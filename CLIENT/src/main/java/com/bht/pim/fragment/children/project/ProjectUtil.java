package com.bht.pim.fragment.children.project;

import com.bht.pim.configuration.AppConfiguration;
import com.bht.pim.fragment.children.ParentOwning;
import com.bht.pim.fragment.parent.project.ProjectCreate;
import com.bht.pim.fragment.parent.project.ProjectList;
import com.bht.pim.message.impl.FragmentSwitching;
import com.bht.pim.util.LanguageUtil;
import com.bht.pim.util.PimUtil;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import lombok.extern.log4j.Log4j;
import org.jacpfx.api.annotations.Resource;
import org.jacpfx.api.annotations.fragment.Fragment;
import org.jacpfx.api.fragment.Scope;
import org.jacpfx.rcp.context.Context;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Log4j
@Controller
@Fragment(id = AppConfiguration.FRAGMENT_PROJECT_UTIL,
        resourceBundleLocation = AppConfiguration.LANGUAGE_BUNDLES,
        scope = Scope.PROTOTYPE,
        viewLocation = "/com/bht/pim/fragment/children/project/ProjectUtil.fxml")
public class ProjectUtil implements Initializable, ParentOwning {

    @Resource
    private Context context;

    @FXML
    private AnchorPane utilPane;
    @FXML
    private TextField searchBox;
    @FXML
    private ComboBox<String> comboBoxStatus;
    @FXML
    private Label lNumberOfProjects;
    @FXML
    private Label lSelected;
    @FXML
    private Button bDeleteAll;
    @FXML
    private Button bSearch;
    @FXML
    private Button bReset;
    @FXML
    private Button bNew;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        LanguageUtil.initLabel(searchBox.promptTextProperty(), "label.project.util.searchbox");
        LanguageUtil.initLabel(comboBoxStatus.promptTextProperty(), "label.project.util.status");
        LanguageUtil.initLabel(lSelected.textProperty(), "label.project.util.selected");
        LanguageUtil.initLabel(bDeleteAll.textProperty(), "label.project.util.deleteall");

        ImageView iSearch = new ImageView(PimUtil.getImage("search"));
        ImageView iReset = new ImageView(PimUtil.getImage("reset"));
        ImageView iDelete = new ImageView(PimUtil.getImage("delete"));
        ImageView iNew = new ImageView(PimUtil.getImage("add"));

        iReset.setFitWidth(110);
        iReset.setFitHeight(110);
        iReset.setPreserveRatio(true);

        iSearch.setFitWidth(30);
        iSearch.setFitHeight(30);

        bSearch.setGraphic(iSearch);
        bReset.setGraphic(iReset);
        bNew.setGraphic(iNew);
        bDeleteAll.setGraphic(iDelete);

        comboBoxStatus.getItems().addAll(
                "New", "Planned", "In progress", "Finished");

        bNew.setOnMouseClicked(event -> {
            log.info("[NEW] on mouse clicked");

            FragmentSwitching switching = new FragmentSwitching(
                    ProjectList.class,
                    ProjectCreate.class);

            context.send(AppConfiguration.COMPONENT_MAIN, switching);
        });

        bSearch.setOnMouseClicked(event -> {
            log.info("[SEARCH] on mouse clicked");
        });

        bDeleteAll.setOnMouseClicked(event -> {
            log.info("[DELETE ALL] on mouse clicked");
        });

        bReset.setOnMouseClicked(event -> {
            log.info("[RESET] on mouse clicked");
        });
    }

    @Override
    public void onSwitchParentFragment() {

    }
}
