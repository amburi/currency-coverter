package com.example.currency.controller;

import com.example.currency.service.ApiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ApiController.class)
public class ApiControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ApiService service;

    // success scenario testing
    @Test
    public void test_getCurrencySymbols() throws Exception {
        mvc.perform(get("/symbol")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is2xxSuccessful());
    }

    // error scenario testing
    @Test
    public void test_convertCurrency() throws Exception {
        mvc.perform(get("/convert")
                .param("from", "EUR")
                .param("to", "INR")
                .param("amount", "wwww")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError());
    }

}