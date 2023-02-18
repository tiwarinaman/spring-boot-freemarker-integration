package com.naman.freemarkerintegration.service.impl;

import com.naman.freemarkerintegration.domain.City;
import com.naman.freemarkerintegration.repository.CityRepository;
import com.naman.freemarkerintegration.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

}
