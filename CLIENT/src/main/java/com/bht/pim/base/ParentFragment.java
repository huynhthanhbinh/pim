package com.bht.pim.base;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.jacpfx.rcp.componentLayout.FXComponentLayout;

import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import javafx.util.Pair;
import lombok.Getter;

/**
 * @author bht
 */
public abstract class ParentFragment extends VBox { // is-parent-fragment, scope SINGLETON !!!

    // logger using for logging purposes
    protected static final Logger LOGGER = Logger.getLogger(ParentFragment.class);

    // list of children fragment of this parent fragment
    @Getter
    private List<ChildFragment> childFragments;

    // main window width
    private ReadOnlyDoubleProperty windowWidthProperty;

    // initialize parent fragment
    protected abstract void onCreated();

    // this method will be invoked when switching
    // from previous fragment to this fragment
    final void onSwitchToThisFragment() {
        childFragments.forEach(ChildFragment::onSwitchToThisFragment);
    }

    // this method will be invoked when switching
    // from this fragment to new fragment
    final void preSwitchToAnotherFragment() {
        childFragments.forEach(ChildFragment::preSwitchToAnotherFragment);
    }

    // init parent fragment
    // after created in component
    final void initialize(FXComponentLayout layout) {
        configureLayout(layout);
        onCreated();
    }

    // add all Children fragments of the parent fragments
    public final <T extends ChildFragment> void addAllChildren(List<Pair<T, Node>> children) {
        determineChildren(children);
        getChildrenFragments(childFragments);
        initializeEachChildFragment();
        configureEachChildFragment();
        bindChildrenFragments();
    }

    private void configureLayout(FXComponentLayout layout) {
        setSpacing(5.0);
        setAlignment(Pos.TOP_CENTER);
        setPrefHeight(600.0);
        windowWidthProperty = layout.getGlassPane().widthProperty();
        prefWidthProperty().bind(windowWidthProperty.subtract(220));
    }

    private <T extends ChildFragment> void determineChildren(List<Pair<T, Node>> children) {
        children.stream()
                .map(Pair::getValue)
                .forEach(getChildren()::add);

        childFragments = children.stream()
                .map(Pair::getKey)
                .collect(Collectors.toList());
    }

    private void initializeEachChildFragment() {
        childFragments.forEach(childFragment -> {
            childFragment.setParentFragment(this);
            childFragment.onCreated();
            childFragment.getLayout().prefWidthProperty()
                    .bind(windowWidthProperty.subtract(220));
        });
    }

    protected abstract void getChildrenFragments(List<ChildFragment> children);

    protected abstract void configureEachChildFragment();

    protected abstract void bindChildrenFragments();
}