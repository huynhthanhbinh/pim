package com.bht.pim.fragment.parent.project;

import java.util.List;

import org.jacpfx.api.annotations.Resource;
import org.jacpfx.api.annotations.fragment.Fragment;
import org.jacpfx.api.fragment.Scope;
import org.jacpfx.rcp.components.managedFragment.ManagedFragmentHandler;
import org.jacpfx.rcp.context.Context;
import org.springframework.stereotype.Controller;

import com.bht.pim.base.BaseComponentFragment;
import com.bht.pim.configuration.AppConfiguration;
import com.bht.pim.fragment.children.confirm.ConfirmFragment;
import com.bht.pim.fragment.children.label.MainLabelFragment;
import com.bht.pim.fragment.children.project.ProjectEditFormFragment;
import com.bht.pim.fragment.parent.IdentifierNeeding;

/**
 * @author bht
 */
@Controller
@Fragment(id = ProjectUpdateFragment.ID, scope = Scope.SINGLETON,
        resourceBundleLocation = AppConfiguration.LANGUAGE_BUNDLES)
public final class ProjectUpdateFragment extends BaseComponentFragment implements IdentifierNeeding {

    static final String ID = "idfPUpdate";
    static final String LABEL = "label.project.update";

    private ManagedFragmentHandler<MainLabelFragment> mainLabelFragment;
    private ManagedFragmentHandler<ProjectEditFormFragment> projectEditFormFragment;
    private ManagedFragmentHandler<ConfirmFragment> confirmFragment;

    @Resource
    private Context context;

    @Override
    public boolean getObjectWithIdentifier(long id) {
        return projectEditFormFragment.getController().getProjectById(id);
    }

    @Override
    protected void onCreated() {
        LOGGER.info("[INIT] FXParentFragment : " + ProjectUpdateFragment.ID);
        mainLabelFragment = registerNewFragment(MainLabelFragment.class);
        projectEditFormFragment = registerNewFragment(ProjectEditFormFragment.class);
        confirmFragment = registerNewFragment(ConfirmFragment.class);
    }

    @Override
    protected void configLayout() {

    }

    @Override
    protected void onSwitch() {

    }

    @Override
    protected void preLeft() {

    }

    @Override
    protected void bindChildren() {

    }

    @Override
    protected void getChildrenFragments(List<ChildFragment> children) {
        mainLabelFragment = (MainLabelFragment) children.get(0);
        projectEditFormFragment = (ProjectEditFormFragment) children.get(1);
        confirmFragment = (ConfirmFragment) children.get(2);
    }

    @Override
    protected void configureEachChildFragment() {
        // Create Project : false
        // Update Project : true
        projectEditFormFragment.setIsUpdateState(true);
        mainLabelFragment.setLabelText(LABEL);
        confirmFragment.setLabelConfirm(ConfirmFragment.LABEL_CONFIRM_UPDATE);
        confirmFragment.setLabelCancel(ConfirmFragment.LABEL_CONFIRM_CANCEL);
    }

    @Override
    protected void bindChildrenFragments() {
        confirmFragment.setOnSubmit(projectEditFormFragment::onSubmit);
        confirmFragment.setOnCancel(projectEditFormFragment::onCancel);
    }
}