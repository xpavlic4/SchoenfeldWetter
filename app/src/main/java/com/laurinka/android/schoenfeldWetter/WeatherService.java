package com.laurinka.android.schoenfeldWetter;


import java.net.MalformedURLException;
import java.net.URL;

public class WeatherService {
    String base;
    WeatherService() {
        base = "http://api.openweathermap.org/data/2.5/forecast/daily?mode=json&units=metric&cnt=7&";
    }
    WeatherService withPostcode(String s) {
        base += "q=" +s;
        return this;
    }
    WeatherService withLat(String lat) {
        base += "lat=" + lat + "&";
        return this;
    }
    WeatherService withLon(String lon) {
        base += "lon=" + lon;
        return this;
    }
    URL build() throws MalformedURLException {
        return new URL(base);
    }
}
