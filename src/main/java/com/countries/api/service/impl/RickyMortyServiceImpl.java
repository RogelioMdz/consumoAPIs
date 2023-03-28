package com.countries.api.service.impl;

import com.countries.api.DTO.RickyMortyDTO;
import com.countries.api.service.RickyMortyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RickyMortyServiceImpl implements RickyMortyService {
    @Autowired
    private RestTemplate restTemplate;

    private static final String BASE_URL_RICKY = "https://rickandmortyapi.com/api/character";

    @Override
    public RickyMortyDTO getCharacter(int id) {
        String url = String.format("%s/%d", BASE_URL_RICKY, id);
        ResponseEntity<RickyMortyDTO> response = restTemplate.getForEntity(url, RickyMortyDTO.class);
        return response.getBody();
    }
}

