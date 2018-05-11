package android.daren.com.coolweather.gson;

import android.widget.ListView;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by liuhongwei on 2018/5/11.
 */

public class Weather {
    public String status;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
