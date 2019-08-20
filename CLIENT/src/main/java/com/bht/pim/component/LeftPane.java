package com.bht.pim.component;

import com.bht.pim.configuration.AppConfiguration;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import lombok.extern.log4j.Log4j;
import org.jacpfx.api.annotations.Resource;
import org.jacpfx.api.annotations.component.DeclarativeView;
import org.jacpfx.api.annotations.lifecycle.OnHide;
import org.jacpfx.api.annotations.lifecycle.OnShow;
import org.jacpfx.api.annotations.lifecycle.PostConstruct;
import org.jacpfx.api.annotations.lifecycle.PreDestroy;
import org.jacpfx.api.message.Message;
import org.jacpfx.rcp.component.FXComponent;
import org.jacpfx.rcp.componentLayout.FXComponentLayout;
import org.jacpfx.rcp.context.Context;

import java.util.ResourceBundle;

@Log4j
@DeclarativeView(id = AppConfiguration.COMPONENT_LEFT, name = "LeftPane",
        resourceBundleLocation = AppConfiguration.LANGUAGE_BUNDLES,
        initialTargetLayoutId = AppConfiguration.TARGET_CONTAINER_LEFT,
        viewLocation = "/com/bht/pim/component/LeftPane.fxml")
public class LeftPane implements FXComponent {

    @FXML
    private Label lProjectList;
    @FXML
    private Label lGroupList;
    @FXML
    private Label lEmployeeList;

    @FXML
    public AnchorPane leftPane;
    @Resource
    private Context context;
    @Resource
    private ResourceBundle bundle;

    @Override
    public Node handle(Message<Event, Object> message) {
        return null;
    }

    @Override
    public Node postHandle(Node node, Message<Event, Object> message) {
        return null;
    }

    @PostConstruct
    public void onStartComponent(final FXComponentLayout arg0,
                                 final ResourceBundle resourceBundle) {

        lProjectList.getStyleClass().add("clickable");
        lGroupList.getStyleClass().add("clickable");
        lEmployeeList.getStyleClass().add("clickable");

        lProjectList.getStyleClass().add("active");

        lProjectList.setOnMouseClicked(event -> {

            log.info("[LeftPane] Clicked Project List");

            if (lProjectList.getStyleClass().contains("active")) {
                event.consume();
                return;
            }

            lGroupList.getStyleClass().remove("active");
            lEmployeeList.getStyleClass().remove("active");
            lProjectList.getStyleClass().add("active");
        });

        lGroupList.setOnMouseClicked(event -> {

            log.info("[LeftPane] Clicked Group List");

            if (lGroupList.getStyleClass().contains("active")) {
                event.consume();
                return;
            }

            lProjectList.getStyleClass().remove("active");
            lEmployeeList.getStyleClass().remove("active");
            lGroupList.getStyleClass().add("active");
        });

        lEmployeeList.setOnMouseClicked(event -> {

            log.info("[LeftPane] Clicked Employee List");

            if (lEmployeeList.getStyleClass().contains("active")) {
                event.consume();
                return;
            }

            lGroupList.getStyleClass().remove("active");
            lProjectList.getStyleClass().remove("active");
            lEmployeeList.getStyleClass().add("active");
        });
    }

    @PreDestroy
    public void onTearDownComponent(final FXComponentLayout componentLayout) {
        log.info("[DESTROY] FXComponentLayout: " + context.getId());
    }

    @OnShow
    public void onShowComponent(final FXComponentLayout componentLayout) {
        log.info("[SHOW] FXComponentLayout: " + context.getId());
    }

    @OnHide
    public void onHide(final FXComponentLayout componentLayout) {
        log.info("[HIDE] FXComponentLayout: " + context.getId());
    }
}
