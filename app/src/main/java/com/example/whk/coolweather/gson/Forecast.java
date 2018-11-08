package com.example.whk.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pcdn on 2018/11/7.
 *
 * 未来几天的天气信息
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
