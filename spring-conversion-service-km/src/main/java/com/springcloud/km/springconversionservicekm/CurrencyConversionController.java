package com.springcloud.km.springconversionservicekm;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyConversionController {

    @Autowired
    Environment environment;

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion covertCurrency(@PathVariable String from,
                                             @PathVariable String to,
                                             @PathVariable BigDecimal quantity){
        Map<String,String> pathVariables = new HashMap<>();
        pathVariables.put("from",from);
        pathVariables.put("to",to);
        ResponseEntity<CurrencyConversion>  responseEntity=new RestTemplate()
                .getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",
                        CurrencyConversion.class,pathVariables);
        CurrencyConversion currencyConversion= responseEntity.getBody();
        currencyConversion.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        currencyConversion.setTotalCalculatedAmount(quantity.multiply(currencyConversion.getConversionMultiple()));
        return currencyConversion;
    }
}
