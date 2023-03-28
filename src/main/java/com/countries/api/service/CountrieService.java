package com.countries.api.service;

import com.countries.api.DTO.CountriesDTO;
import com.countries.api.entity.Countries;


public interface CountrieService {

    CountriesDTO getCountryByName(String name);

    Countries save(Countries data);

}
