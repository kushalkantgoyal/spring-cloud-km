package com.springcloud.km.limitsservicekm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("limits")
public class LimitsController {

    @Autowired
    Configuration configuration;

    @GetMapping
    LimitsConfiguration getLimits(){
        return new LimitsConfiguration(configuration.getMinimum(), configuration.getMaximum());
    }
}
