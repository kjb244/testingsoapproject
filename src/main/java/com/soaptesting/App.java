package com.soaptesting;

import com.soaptesting.model.CountriesUsingCurrencyRequest;
import com.soaptesting.service.CountriesUsingCurrencyService;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        CountriesUsingCurrencyService countriesUsingCurrencyService= new CountriesUsingCurrencyService();
        CountriesUsingCurrencyRequest countriesUsingCurrencyRequest = new CountriesUsingCurrencyRequest();
        countriesUsingCurrencyRequest.setIsoCurrencyCode("USD");
        countriesUsingCurrencyService.getCountriesUsingCurrencyService(countriesUsingCurrencyRequest)
                .stream()
                .forEach(e -> System.out.println(e.getSName() + " " + e.getSISOCode()));





    }
}
