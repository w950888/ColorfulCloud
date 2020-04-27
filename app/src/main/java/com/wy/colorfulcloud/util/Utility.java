package com.wy.colorfulcloud.util;

import android.text.TextUtils;

import com.wy.colorfulcloud.db.City;
import com.wy.colorfulcloud.db.County;
import com.wy.colorfulcloud.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * @author Luke
 * @version 1.0.0
 * @time 2020/4/26 下午 4:22
 * @description
 */
public class Utility {

    /**
     * 获取解析省级数据 http://guolin.tech/api/china
     *
     * @param response
     * @return
     */
    public static boolean handleProvincesResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvince = new JSONArray(response);
                for (int i = 0; i < allProvince.length(); i++) {
                    JSONObject provinceObject = allProvince.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.setProvinceName(provinceObject.getString("name"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 获取解析市级数据 http://guolin.tech/api/china/(provinceId)
     *
     * @param response
     * @return
     */
    public static boolean handleCitiesResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityCode(cityObject.getInt("id"));
                    city.setCityName(cityObject.getString("name"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 获取解析市级数据 http://guolin.tech/api/china/(cityId)
     *
     * @param response
     * @return
     */
    public static boolean handleCountryResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i = 0; i < allCounties.length(); i++) {
                    JSONObject countryObject = allCounties.getJSONObject(i);
                    County county = new County();
                    //county.setId(countryObject.getInt("id"));
                    county.setCountryName(countryObject.getString("name"));
                    county.setCityId(cityId);
                    county.setWeatherId(countryObject.getString("weather_id"));
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

}
