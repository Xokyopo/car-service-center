package ru.expoforum.carservicecenter.web.screens.company;

import com.haulmont.cuba.gui.screen.*;
import ru.expoforum.carservicecenter.entity.Company;

@UiController("carservicecenter_Company.browse")
@UiDescriptor("company-browse.xml")
@LookupComponent("companiesTable")
@LoadDataBeforeShow
public class CompanyBrowse extends StandardLookup<Company> {
}