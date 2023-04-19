package com.in28minutes.springboot.learnspringboot.currencyConfig;
import com.in28minutes.springboot.learnspringboot.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


//http://localhost:8080/courses
@RestController//for rest
    public class CurrencyConfigController {

        @Autowired
        private CurrencyServiceConfiguration configuration;

        @RequestMapping("/currency-config")
        public CurrencyServiceConfiguration retrieveCurrencyConfiguration() {
            return configuration;
        }
    }

