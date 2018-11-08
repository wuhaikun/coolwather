package com.example.whk.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pcdn on 2018/11/7.
 *
 * 包含城市的一些基本信息
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
