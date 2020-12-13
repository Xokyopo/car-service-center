package ru.expoforum.carservicecenter.web.screens.carservicecenter;

import com.haulmont.cuba.gui.screen.*;
import ru.expoforum.carservicecenter.entity.CarServiceCenter;

@UiController("carservicecenter_CarServiceCenter.browse")
@UiDescriptor("car-service-center-browse.xml")
@LookupComponent("carServiceCentersTable")
@LoadDataBeforeShow
public class CarServiceCenterBrowse extends StandardLookup<CarServiceCenter> {
}