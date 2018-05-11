package android.daren.com.coolweather.gson;

import java.sql.DataTruncation;

/**
 * Created by liuhongwei on 2018/5/11.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
