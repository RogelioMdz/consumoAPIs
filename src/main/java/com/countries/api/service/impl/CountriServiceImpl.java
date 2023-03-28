package com.countries.api.service.impl;

import com.countries.api.DAO.CountriesDAO;
import com.countries.api.DTO.CountriesDTO;
import com.countries.api.entity.Countries;
import com.countries.api.service.CountrieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountriServiceImpl implements CountrieService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CountriesDAO countriesDAO;

    private static final String BASE_URL = "https://restcountries.com/v3.1";

    @Override
    public CountriesDTO getCountryByName(String name){
        String url = String.format("%s/name/%s", BASE_URL, name);
        ResponseEntity<CountriesDTO[]> response = restTemplate.getForEntity(url, CountriesDTO[].class);
        return response.getBody()[0];
    }

    @Override
    public Countries save(Countries data) {
        return countriesDAO.save(data);
    }

}
