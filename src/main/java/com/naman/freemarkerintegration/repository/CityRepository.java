package com.naman.freemarkerintegration.repository;

import com.naman.freemarkerintegration.domain.City;

import java.util.List;

public interface CityRepository {

    List<City> findAll();

}
