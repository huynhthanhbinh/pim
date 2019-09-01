package com.bht.pim.base;

import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.Logger;

/**
 * @author bht
 */
public abstract class ChildFragment { // is-children-fragment, scope PROTOTYPE

    protected static final Logger LOGGER = Logger.getLogger(ChildFragment.class);

    @Getter
    @Setter
    private ParentFragment parentFragment;

    public abstract void onCreated();

    public abstract void onSwitchParentFragment();
}