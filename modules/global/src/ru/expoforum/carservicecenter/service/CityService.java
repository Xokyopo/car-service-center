package ru.expoforum.carservicecenter.service;

import ru.expoforum.carservicecenter.entity.City;

public interface CityService {
    String NAME = "carservicecenter_CityService";

    City getDefaultCity();

    void dropAllDefaultCity();
}