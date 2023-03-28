package com.countries.api.DTO;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CountriesDTO {
    @JsonProperty("name")
    private NameDTO name;
    @JsonProperty("capital")
    private List<String> capital;
    @JsonProperty("region")
    private String region;

}
