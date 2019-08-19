package com.bht.pim.fragment.children.employee;

import com.bht.pim.configuration.AppConfiguration;
import lombok.extern.log4j.Log4j;
import org.jacpfx.api.annotations.fragment.Fragment;
import org.jacpfx.api.fragment.Scope;
import org.springframework.stereotype.Controller;

@Log4j
@Controller
@Fragment(id = AppConfiguration.FRAGMENT_EMPLOYEE_LIST_TABLE,
        resourceBundleLocation = AppConfiguration.LANGUAGE_BUNDLES_LOCATION,
        scope = Scope.PROTOTYPE,
        viewLocation = "/com/bht/pim/fragment/children/employee/EmployeeListTable.fxml")
public class EmployeeListTable {
}
