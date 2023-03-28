package com.countries.api.controller;

import com.countries.api.DTO.RickyMortyDTO;
import com.countries.api.service.RickyMortyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/character")
public class RickyMortyController {
    @Autowired
    private RickyMortyService rickyMortyService;

    @GetMapping("/{id}")
    public RickyMortyDTO getCharacterById(@PathVariable int id){
        return rickyMortyService.getCharacter(id);
    }
}
