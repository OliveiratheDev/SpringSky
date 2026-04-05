package com.openApi.dev.dto;

import java.util.List;

public class Weather {

    public record WeatherResponse(
            String name,
            MainData main,
            List<WeatherDescription> weather
    ) {}

    public record MainData(
            double temp,
            double feels_like,
            int humidity
    ) {}

    public record WeatherDescription(
            String description
    ) {}
}
