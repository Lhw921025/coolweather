package android.daren.com.coolweather.util;

import android.daren.com.coolweather.db.City;
import android.daren.com.coolweather.db.Country;
import android.daren.com.coolweather.db.Province;
import android.os.Handler;
import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by liuhongwei on 2018/5/10.
 */

public class Utility {
    /*
    *解析和处理服务器返回的省级数据
    */
    public static boolean handleProvinceResponse(String response){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i=0;i<allProvinces.length();i++){
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
    /*
    *解析和处理服务器返回的市级数据
    */
    public static boolean handleCityResponse(String response,int provinceId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i=0;i<allProvinces.length();i++){
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    City province = new City();
                    province.setCityName(provinceObject.getString("name"));
                    province.setCityCode(provinceObject.getInt("id"));
                    province.setProvinceId(provinceId);
                    province.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
    /*
    *解析和处理服务器返回的县级数据
    */
    public static boolean handleCountryResponse(String response,int cityId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i=0;i<allProvinces.length();i++){
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Country province = new Country();
                    province.setCountryName(provinceObject.getString("name"));
                    province.setWeatherId(provinceObject.getString("weather_id"));
                    province.setCityId(cityId);
                    province.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
}
