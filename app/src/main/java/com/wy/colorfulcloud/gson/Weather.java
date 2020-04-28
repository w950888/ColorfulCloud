package com.wy.colorfulcloud.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Luke
 * @version 1.0.0
 * @time 2020/4/27 下午 4:06
 * @description
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    @Override
    public String toString() {
        return "Weather{" +
                "status='" + status + '\'' +
                ", basic=" + basic +
                ", aqi=" + aqi +
                ", now=" + now +
                ", suggestion=" + suggestion +
                ", forecastList=" + forecastList +
                '}';
    }
}
