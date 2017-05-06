package com.example.ycw.coolweather.gson;

/**
 * Created by ycw on 2017/5/6.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
