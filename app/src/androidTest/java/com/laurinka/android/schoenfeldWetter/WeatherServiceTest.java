package com.laurinka.android.schoenfeldWetter;

//import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class WeatherServiceTest {
//    @Test
    public void testURLBuilder() throws MalformedURLException {
        WeatherService ws  = new WeatherService();
        URL u = ws.withPostcode("23").build();
        System.out.println(u);
    }
}