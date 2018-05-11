package android.daren.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liuhongwei on 2018/5/11.
 */

public class Forecast {
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
