package com.cognizant.spring_learn.entity;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Country {
    private static final Logger logger = LoggerFactory.getLogger(Country.class);
    private String name;
    private String code;

    public String getName() {
        logger.debug("Inside getName Method");
        return name;
    }

    public void setName(String name) {
        logger.debug("Inside setName Method");
        this.name = name;
    }

    public String getCode() {
        logger.debug("Inside getCode Method");
        return code;
    }

    public void setCode(String code) {
        logger.debug("Inside setCode Method");
        this.code = code;
    }

    public Country() {
        logger.debug("Inside default constructor");
    }

    @Override
    public String toString() {
        logger.debug("Inside toString Method");
        return "Country{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
