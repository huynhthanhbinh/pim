package com.bht.pim.fragment.parent.project;

import com.bht.pim.configuration.AppConfiguration;
import com.bht.pim.fragment.children.confirm.Confirm;
import com.bht.pim.fragment.children.confirm.ConfirmBoxContaining;
import com.bht.pim.fragment.children.label.MainLabel;
import com.bht.pim.fragment.children.label.MainLabelContaining;
import com.bht.pim.fragment.children.project.ProjectEditableForm;
import com.bht.pim.fragment.parent.ChildrenContainer;
import com.bht.pim.fragment.parent.ChildrenContaining;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import lombok.extern.log4j.Log4j;
import org.jacpfx.api.annotations.Resource;
import org.jacpfx.api.annotations.fragment.Fragment;
import org.jacpfx.api.fragment.Scope;
import org.jacpfx.rcp.components.managedFragment.ManagedFragmentHandler;
import org.jacpfx.rcp.context.Context;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Log4j
@Controller
@Fragment(id = AppConfiguration.FRAGMENT_PROJECT_CREATE,
        resourceBundleLocation = AppConfiguration.LANGUAGE_BUNDLES_LOCATION,
        scope = Scope.PROTOTYPE,
        viewLocation = "/com/bht/pim/fragment/parent/project/ProjectCreate.fxml")
public class ProjectCreate implements Initializable, ConfirmBoxContaining, MainLabelContaining, ChildrenContaining {

    @Resource
    private Context context;
    @Resource
    private ResourceBundle bundle;
    @FXML
    private VBox mainPane;
    @FXML
    private GridPane gridPane;

    private ManagedFragmentHandler<MainLabel> mainLabelFragment;
    private ManagedFragmentHandler<ProjectEditableForm> projectEditableFormFragment;
    private ManagedFragmentHandler<Confirm> confirmFragment;


    @FXML
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @Override
    public String getConfirmLabel() {
        return "CREATE";
    }

    @Override
    public void setConfirmLabel(String confirmLabel) {
        confirmFragment.getController().setConfirmLabelText(confirmLabel);
    }

    @Override
    public ManagedFragmentHandler getConfirmBox() {
        return confirmFragment;
    }

    @Override
    public ManagedFragmentHandler getConfirmForm() {
        return projectEditableFormFragment;
    }

    @Override
    public void setMainLabelText(String mainLabelText) {
        log.info(mainLabelFragment);
        mainLabelFragment.getController().setLabelText(mainLabelText);
    }

    @Override
    public void configureChildrenFragments(ChildrenContainer container) {
        mainLabelFragment = container.getMainLabelFragment();
        projectEditableFormFragment = container.getProjectEditableFormFragment();
        confirmFragment = container.getConfirmFragment();

        mainPane.getChildren().addAll(
                mainLabelFragment.getFragmentNode(),
                projectEditableFormFragment.getFragmentNode(),
                confirmFragment.getFragmentNode());

        mainPane.getChildren().forEach(log::info);

        mainPane.getChildren().forEach(node -> VBox.setVgrow(node, Priority.ALWAYS));
    }

    @Override
    public void removeAllChilrenFragments() {
        ObservableList<Node> nodes = mainPane.getChildren();
        for (int i = nodes.size() - 1; i >= 0; i--) {
            nodes.remove(nodes.get(i));
        }
    }
}