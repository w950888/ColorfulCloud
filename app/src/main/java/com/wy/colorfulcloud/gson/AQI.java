package com.wy.colorfulcloud.gson;

/**
 * @author Luke
 * @version 1.0.0
 * @time 2020/4/27 下午 3:50
 * @description
 */
public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
