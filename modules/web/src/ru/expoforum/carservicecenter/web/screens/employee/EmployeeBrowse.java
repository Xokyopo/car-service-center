package ru.expoforum.carservicecenter.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import ru.expoforum.carservicecenter.entity.Employee;

@UiController("carservicecenter_Employee.browse")
@UiDescriptor("employee-browse.xml")
@LookupComponent("employeesTable")
@LoadDataBeforeShow
public class EmployeeBrowse extends StandardLookup<Employee> {
}