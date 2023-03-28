package com.countries.api.DAO;

import com.countries.api.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesDAO extends JpaRepository<Countries, Long> {
}
