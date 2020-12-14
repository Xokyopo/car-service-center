package ru.expoforum.carservicecenter.web.screens.city;

import com.haulmont.cuba.gui.screen.*;
import ru.expoforum.carservicecenter.entity.City;
import ru.expoforum.carservicecenter.service.CityService;

import javax.inject.Inject;

@UiController("carservicecenter_City.edit")
@UiDescriptor("city-edit.xml")
@EditedEntityContainer("cityDc")
@LoadDataBeforeShow
public class CityEdit extends StandardEditor<City> {
    @Inject
    private CityService cityService;

    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        if (getEditedEntity().getDefaultCity()) {
            this.cityService.dropAllDefaultCity();
            //TODO update screen after apply;
        }
    }
}