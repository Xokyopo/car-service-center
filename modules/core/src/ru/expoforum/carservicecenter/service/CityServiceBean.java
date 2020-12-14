package ru.expoforum.carservicecenter.service;

import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.expoforum.carservicecenter.entity.City;

import javax.inject.Inject;

@Service(CityService.NAME)
public class CityServiceBean implements CityService {
    @Inject
    private DataManager dataManager;

    @Inject
    private Persistence persistence;

    @Override
    public City getDefaultCity() {
        return dataManager.loadValue("SELECT c FROM carservicecenter_City c WHERE c.defaultCity = true", City.class).optional().orElse(null);
    }

    @Transactional
    public void dropAllDefaultCity() {
        persistence.getEntityManager()
                .createNativeQuery("UPDATE CARSERVICECENTER_CITY SET DEFAULT_CITY = false WHERE DEFAULT_CITY = true")
                .executeUpdate();
    }
}