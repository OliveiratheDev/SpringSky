package com.openApi.dev.controller;

import com.openApi.dev.dto.Weather;
import com.openApi.dev.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/clima")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{cidade}")
    public ResponseEntity<?> obterClima(@PathVariable String cidade) {
        try {
            Weather.WeatherResponse clima = weatherService.buscarClima(cidade);
            return ResponseEntity.ok(clima);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erro detalhado:" + e.getMessage());
        }
    }
}
