package com.example.whk.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pcdn on 2018/11/7.
 *
 * 当前的天气信息
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
