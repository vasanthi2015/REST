package com.example.micro.currency.repository;

import com.example.micro.currency.model.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {
    public CurrencyExchange findByFromAndTo(String from, String to);
}
