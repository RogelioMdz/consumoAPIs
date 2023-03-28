package com.countries.api.controller;

import com.countries.api.DTO.CountriesDTO;
import com.countries.api.entity.Countries;
import com.countries.api.service.CountrieService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/country")
public class CountriesController {
    @Autowired
    private CountrieService countrieService;

    @Autowired
    private ModelMapper mapper;

    @PostMapping("/{name}")
    public ResponseEntity<?> getCountryByName(@PathVariable String name){
        CountriesDTO country = countrieService.getCountryByName(name);
        Countries countries = mapper.map(country, Countries.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(countrieService.save(countries));
    }
}
