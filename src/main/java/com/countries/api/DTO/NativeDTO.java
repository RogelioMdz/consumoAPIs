package com.countries.api.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import sun.print.PSPrinterJob;

import java.util.Map;

@Data
public class NativeDTO {
    @JsonProperty("spa")
    private Map<String, String> spa;
}
