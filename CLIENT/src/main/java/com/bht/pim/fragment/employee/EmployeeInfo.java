package com.bht.pim.fragment.employee;

import com.bht.pim.configuration.AppConfiguration;
import lombok.extern.log4j.Log4j;
import org.jacpfx.api.annotations.fragment.Fragment;
import org.jacpfx.api.fragment.Scope;

@Log4j
@Fragment(id = AppConfiguration.FRAGMENT_EMPLOYEE_INFO,
        resourceBundleLocation = "bundles.languageBundle",
        scope = Scope.PROTOTYPE,
        viewLocation = "/com/bht/pim/fragment/employee/EmployeeInfo.fxml")
public class EmployeeInfo {
}
