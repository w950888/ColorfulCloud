package com.wy.colorfulcloud.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author Luke
 * @version 1.0.0
 * @time 2020/4/26 下午 4:15
 * @description 网络请求工具
 */
public class HttpUtil {
    private static final String TAG = HttpUtil.class.getSimpleName();

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        Log.d(TAG, "sendOkHttpRequest: address:" + address);
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }
}
