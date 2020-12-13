package ru.expoforum.carservicecenter.web.screens.city;

import com.haulmont.cuba.gui.screen.*;
import ru.expoforum.carservicecenter.entity.City;

@UiController("carservicecenter_City.browse")
@UiDescriptor("city-browse.xml")
@LookupComponent("citiesTable")
@LoadDataBeforeShow
public class CityBrowse extends StandardLookup<City> {
}