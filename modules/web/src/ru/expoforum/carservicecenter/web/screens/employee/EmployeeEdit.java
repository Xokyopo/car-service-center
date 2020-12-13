package ru.expoforum.carservicecenter.web.screens.employee;

import com.haulmont.cuba.gui.screen.*;
import ru.expoforum.carservicecenter.entity.Employee;

@UiController("carservicecenter_Employee.edit")
@UiDescriptor("employee-edit.xml")
@EditedEntityContainer("employeeDc")
@LoadDataBeforeShow
public class EmployeeEdit extends StandardEditor<Employee> {
}