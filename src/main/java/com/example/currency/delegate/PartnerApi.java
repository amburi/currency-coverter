package com.example.currency.delegate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Configuration
@PropertySource("application.properties")
public class PartnerApi {
    private static final Logger logger = LoggerFactory.getLogger(PartnerApi.class);
    static RestTemplate restTemplate = new RestTemplate();

    @Value("${currency.baseUrl}")
    private String BASE_URL;
    @Value("${currency.path.symbol}")
    private String GET_ALL_CURRENCY_SYMBOL_PATH;
    @Value("${currency.path.convert}")
    private String GET_CURRENCY_CONVERSION_PATH;
    @Value("${currency.accesssKey}")
    private String API_KEY;

    /**
     * Partner API: Get Currency Data
     *
     * @return
     */
    public Object callExchangeLatest() {
        String params = String.format("?access_key=%s", API_KEY);
        String URL = BASE_URL + GET_ALL_CURRENCY_SYMBOL_PATH + params;
        Object data = restTemplate.getForObject(URL, Object.class);
        return data;
    }

    /**
     * Partner API: Get Currency Conversion Data
     *
     * @param from
     * @param to
     * @param amount
     * @return
     */
    public Object callExchangeConvert(String from, String to, String amount) {
        String params = String.format("?access_key=%s&from=%s&to=%s&amount=%s", API_KEY, from, to, amount);
        String URL = BASE_URL + GET_CURRENCY_CONVERSION_PATH + params;
        Object data = restTemplate.getForObject(URL, Object.class);
        return data;
    }

}
