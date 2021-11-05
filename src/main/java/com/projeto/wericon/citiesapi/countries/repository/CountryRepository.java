package com.projeto.wericon.citiesapi.countries.repository;

import com.projeto.wericon.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
