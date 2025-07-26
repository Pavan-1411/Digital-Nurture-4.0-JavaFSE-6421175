package com.cognizant.spring_learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.entity.Country;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    @Qualifier("countryList")
    List<Country> countryList;

    public void addCountry(Country c){
        countryList.add(c);
    }

    public Country getCountry(String code){
        return countryList.stream().filter(c-> c.getCode().equals(code)).findFirst().get();
    }
}
