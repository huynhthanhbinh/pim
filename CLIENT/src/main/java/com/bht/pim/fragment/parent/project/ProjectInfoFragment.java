package com.bht.pim.fragment.parent.project;

import java.util.List;

import org.jacpfx.api.annotations.Resource;
import org.jacpfx.api.annotations.fragment.Fragment;
import org.jacpfx.api.fragment.Scope;
import org.jacpfx.rcp.context.Context;
import org.springframework.stereotype.Controller;

import com.bht.pim.base.BaseComponentFragment;
import com.bht.pim.configuration.AppConfiguration;
import com.bht.pim.fragment.children.confirm.ConfirmFragment;
import com.bht.pim.fragment.children.label.MainLabelFragment;
import com.bht.pim.fragment.children.project.ProjectDetailFragment;
import com.bht.pim.fragment.parent.IdentifierNeeding;

/**
 * @author bht
 */
@Controller
@Fragment(id = ProjectInfoFragment.ID, scope = Scope.SINGLETON,
        resourceBundleLocation = AppConfiguration.LANGUAGE_BUNDLES)
public final class ProjectInfoFragment extends BaseComponentFragment implements IdentifierNeeding {

    static final String ID = "idfPInfo";
    static final String LABEL = "label.project.info";

    private MainLabelFragment mainLabelFragment;
    private ProjectDetailFragment projectDetailFragment;
    private ConfirmFragment confirmFragment;

    @Resource
    private Context context;

    @Override
    protected void onCreated() {
        LOGGER.info("[INIT] FXParentFragment : " + ProjectInfoFragment.ID);
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
        projectDetailFragment = (ProjectDetailFragment) children.get(1);
        confirmFragment = (ConfirmFragment) children.get(2);
    }

    @Override
    protected void configureEachChildFragment() {
        mainLabelFragment.setLabelText(LABEL);
        confirmFragment.setLabelConfirm(ConfirmFragment.LABEL_CONFIRM_MODIFY);
        confirmFragment.setLabelCancel(ConfirmFragment.LABEL_CONFIRM_RETURN);
    }

    @Override
    protected void bindChildrenFragments() {
        confirmFragment.setOnSubmit(projectDetailFragment::onModify);
        confirmFragment.setOnCancel(projectDetailFragment::onReturn);
    }

    @Override
    public boolean getObjectWithIdentifier(long id) {
        return projectDetailFragment.getProjectById(id);
    }
}