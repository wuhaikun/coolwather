package com.example.whk.coolweather.gson;

/**
 * Created by pcdn on 2018/11/7.
 *
 * 当前空气质量的情况
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
