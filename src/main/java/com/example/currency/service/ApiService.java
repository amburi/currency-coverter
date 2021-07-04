package com.example.currency.service;

import com.example.currency.model.ConvertRes;

import java.util.List;

public interface ApiService {
    List<String> getSymbols();

    ConvertRes getCurrencyConverted(String from, String to, String amount);
}
