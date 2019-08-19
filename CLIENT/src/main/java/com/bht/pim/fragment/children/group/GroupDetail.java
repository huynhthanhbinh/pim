package com.bht.pim.fragment.group;

import com.bht.pim.configuration.AppConfiguration;
import lombok.extern.log4j.Log4j;
import org.jacpfx.api.annotations.fragment.Fragment;
import org.jacpfx.api.fragment.Scope;
import org.springframework.stereotype.Controller;

@Log4j
@Controller
@Fragment(id = AppConfiguration.FRAGMENT_GROUP_INFO,
        resourceBundleLocation = AppConfiguration.LANGUAGE_BUNDLES,
        scope = Scope.PROTOTYPE,
        viewLocation = "/com/bht/pim/fragment/group/GroupInfo.fxml")
public class GroupInfo {
}
