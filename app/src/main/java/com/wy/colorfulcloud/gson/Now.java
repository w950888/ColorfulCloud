package com.wy.colorfulcloud.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Luke
 * @version 1.0.0
 * @time 2020/4/27 下午 3:52
 * @description
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
