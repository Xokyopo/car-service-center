package ru.expoforum.carservicecenter.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import ru.expoforum.carservicecenter.entity.Customer;

@UiController("carservicecenter_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}