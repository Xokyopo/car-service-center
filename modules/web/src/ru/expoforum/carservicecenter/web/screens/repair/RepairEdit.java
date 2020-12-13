package ru.expoforum.carservicecenter.web.screens.repair;

import com.haulmont.cuba.gui.screen.*;
import ru.expoforum.carservicecenter.entity.Repair;

@UiController("carservicecenter_Repair.edit")
@UiDescriptor("repair-edit.xml")
@EditedEntityContainer("repairDc")
@LoadDataBeforeShow
public class RepairEdit extends StandardEditor<Repair> {
}