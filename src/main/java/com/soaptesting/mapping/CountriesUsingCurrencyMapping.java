package com.soaptesting.mapping;

import com.soaptesting.model.CountriesUsingCurrencyRequest;

public class CountriesUsingCurrencyMapping {

    public static String mapRequest(CountriesUsingCurrencyRequest countriesUsingCurrencyRequest){
        return countriesUsingCurrencyRequest.getIsoCurrencyCode();
    }
}
