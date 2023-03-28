package com.countries.api.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "Countries")
public class Countries implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String capital;
    private String region;
}
