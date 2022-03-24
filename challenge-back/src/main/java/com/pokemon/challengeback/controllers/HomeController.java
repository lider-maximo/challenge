package com.pokemon.challengeback.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/cityTemperature")
    public Long getCityTemperature(@RequestParam("cityName")
                                                   String cityName) {
//        OkHttpClient client = new OkHttpClient();
//
//        Request request = new Request.Builder()
//                .url("https://community-open-weather-map.p.rapidapi.com/weather?q=London%252Cuk")
//                .get()
//                .addHeader("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
//                .addHeader("x-rapidapi-key", "[your rapidapi key]")
//                .build();
//
//        Response response = client.newCall(request).execute();
        int temperature = 5;
        if (temperature < 5) {

        } else if (temperature >= 5 && temperature < 10) {

        } else if (temperature >= 10 && temperature < 15) {

        } else if (temperature >= 15 && temperature < 21) {

        } else if (temperature >= 23 && temperature < 27) {

        } else if (temperature >= 27 && temperature < 33) {

        } else {

        }
        return null;
    }

}
