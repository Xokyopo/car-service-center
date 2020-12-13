package ru.expoforum.carservicecenter.web.screens.city;

import com.haulmont.cuba.gui.screen.*;
import ru.expoforum.carservicecenter.entity.City;

@UiController("carservicecenter_City.edit")
@UiDescriptor("city-edit.xml")
@EditedEntityContainer("cityDc")
@LoadDataBeforeShow
public class CityEdit extends StandardEditor<City> {
}