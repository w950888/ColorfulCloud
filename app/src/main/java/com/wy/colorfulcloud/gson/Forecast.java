package com.wy.colorfulcloud.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Luke
 * @version 1.0.0
 * @time 2020/4/27 下午 4:01
 * @description 天气预报
 */
public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "data='" + date + '\'' +
                ", temperature=" + temperature.max +
                ", more=" + more.info +
                '}';
    }
}
