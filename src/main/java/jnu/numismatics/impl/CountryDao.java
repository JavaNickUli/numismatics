package jnu.numismatics.impl;

import jnu.numismatics.entity.Country;

import java.util.List;

public interface CountryDao {

    int createCountry(Country country);

    String readCountry(int id);

    int readCountry(Country country);

    List<String> readAllCountry();

    void updateCountry(int id, Country country);

    void deleteCountry(Country country);
}
