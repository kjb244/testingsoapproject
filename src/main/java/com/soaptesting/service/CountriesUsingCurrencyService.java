package com.soaptesting.service;

import com.soaptesting.mapping.CountriesUsingCurrencyMapping;
import com.soaptesting.model.CountriesUsingCurrencyRequest;

import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;
import org.oorsprong.websamples.TCountryCodeAndName;

import java.util.List;

public class CountriesUsingCurrencyService {

    public List<TCountryCodeAndName> getCountriesUsingCurrencyService(CountriesUsingCurrencyRequest countriesUsingCurrencyRequest){
        String request = CountriesUsingCurrencyMapping.mapRequest(countriesUsingCurrencyRequest);
        CountryInfoService service = new CountryInfoService();
        CountryInfoServiceSoapType serviceSoapType =  service.getCountryInfoServiceSoap();
        return serviceSoapType.countriesUsingCurrency(request).getTCountryCodeAndName();

    }


}
