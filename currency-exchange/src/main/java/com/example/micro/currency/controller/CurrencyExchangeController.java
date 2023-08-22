package com.example.micro.currency.controller;

import com.example.micro.currency.model.CurrencyExchange;
import com.example.micro.currency.repository.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {
@Autowired
  Environment env;

@Autowired
CurrencyExchangeRepository currencyExchangeRepository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange getCurrencyExchangeValue(@PathVariable String from, @PathVariable String to){
        return currencyExchangeRepository.findByFromAndTo(from, to);

    }
}
