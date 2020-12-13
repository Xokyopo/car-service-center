package ru.expoforum.carservicecenter.web.screens.individual;

import com.haulmont.cuba.gui.screen.*;
import ru.expoforum.carservicecenter.entity.Individual;

@UiController("carservicecenter_Individual.edit")
@UiDescriptor("individual-edit.xml")
@EditedEntityContainer("individualDc")
@LoadDataBeforeShow
public class IndividualEdit extends StandardEditor<Individual> {
}