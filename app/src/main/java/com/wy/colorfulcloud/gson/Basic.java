package com.wy.colorfulcloud.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Luke
 * @version 1.0.0
 * @time 2020/4/27 下午 3:42
 * @description 天气基础信息类
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
