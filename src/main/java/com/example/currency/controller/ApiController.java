package com.example.currency.controller;

import com.example.currency.model.ConvertRes;
import com.example.currency.service.ApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class ApiController {
    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    ApiService apiService;

    @GetMapping("/symbol")
    public ResponseEntity<List<String>> getCurrencySymbols() {
        List<String> data = apiService.getSymbols();
        if (data != null) {
            return new ResponseEntity<>(data, HttpStatus.OK);
        }
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/convert")
    public ResponseEntity<ConvertRes> convertCurrency(@RequestParam String from, @RequestParam String to, @RequestParam String amount) {
        ConvertRes data = apiService.getCurrencyConverted(from, to, amount);
        if (data != null && data.getTargetAmount() != null) {
            return new ResponseEntity<>(data, HttpStatus.OK);
        }
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }

}