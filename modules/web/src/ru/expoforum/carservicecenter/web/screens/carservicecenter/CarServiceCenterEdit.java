package ru.expoforum.carservicecenter.web.screens.carservicecenter;

import com.haulmont.cuba.gui.screen.*;
import ru.expoforum.carservicecenter.entity.CarServiceCenter;

@UiController("carservicecenter_CarServiceCenter.edit")
@UiDescriptor("car-service-center-edit.xml")
@EditedEntityContainer("carServiceCenterDc")
@LoadDataBeforeShow
public class CarServiceCenterEdit extends StandardEditor<CarServiceCenter> {
}