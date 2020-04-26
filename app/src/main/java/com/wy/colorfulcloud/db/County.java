package com.wy.colorfulcloud.db;

import org.litepal.crud.DataSupport;

/**
 * @author Luke
 * @version 1.0.0
 * @time 2020/4/26 下午 4:05
 * @description
 */
public class County extends DataSupport {
    private int id;
    private String countryName;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
