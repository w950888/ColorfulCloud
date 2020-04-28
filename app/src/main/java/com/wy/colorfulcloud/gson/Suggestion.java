package com.wy.colorfulcloud.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Luke
 * @version 1.0.0
 * @time 2020/4/27 下午 3:54
 * @description
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;


    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
