package ru.expoforum.carservicecenter.web.screens.individual;

import com.haulmont.cuba.gui.screen.*;
import ru.expoforum.carservicecenter.entity.Individual;

@UiController("carservicecenter_Individual.browse")
@UiDescriptor("individual-browse.xml")
@LookupComponent("individualsTable")
@LoadDataBeforeShow
public class IndividualBrowse extends StandardLookup<Individual> {
}