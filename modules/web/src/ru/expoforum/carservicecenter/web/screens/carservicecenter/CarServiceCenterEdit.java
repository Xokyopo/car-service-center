package ru.expoforum.carservicecenter.web.screens.carservicecenter;

import com.haulmont.cuba.gui.screen.*;
import ru.expoforum.carservicecenter.entity.CarServiceCenter;
import ru.expoforum.carservicecenter.entity.City;
import ru.expoforum.carservicecenter.service.CityService;

import javax.inject.Inject;

@UiController("carservicecenter_CarServiceCenter.edit")
@UiDescriptor("car-service-center-edit.xml")
@EditedEntityContainer("carServiceCenterDc")
@LoadDataBeforeShow
public class CarServiceCenterEdit extends StandardEditor<CarServiceCenter> {
    @Inject
    private CityService cityService;

    @Subscribe
    public void onInitEntity(InitEntityEvent<CarServiceCenter> event) {
        City city = cityService.getDefaultCity();
        if (city != null) {
            event.getEntity().setCity(city);
        }
    }
}