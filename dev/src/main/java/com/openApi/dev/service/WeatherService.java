package com.openApi.dev.service;

import com.openApi.dev.dto.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
@Service
public class WeatherService {
    private final RestClient restClient;

    @Value("${api.openweathermap.key}")
    private String apiKey;

    public WeatherService(RestClient.Builder builder, @Value("${api.openweathermap.url}") String baseUrl) {
        this.restClient = builder.baseUrl(baseUrl).build();
    }
    @Cacheable(value = "clima", key = "#p0")
    public Weather.WeatherResponse buscarClima(String cidade) {
        return restClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("q", cidade)
                        .queryParam("appid", apiKey)
                        .queryParam("units", "metric")
                        .queryParam("lang", "pt_br")
                        .build())
                .retrieve()
                .body(Weather.WeatherResponse.class);
    }
}
