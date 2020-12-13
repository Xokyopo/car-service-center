package ru.expoforum.carservicecenter.web.screens.company;

import com.haulmont.cuba.gui.screen.*;
import ru.expoforum.carservicecenter.entity.Company;

@UiController("carservicecenter_Company.edit")
@UiDescriptor("company-edit.xml")
@EditedEntityContainer("companyDc")
@LoadDataBeforeShow
public class CompanyEdit extends StandardEditor<Company> {
}