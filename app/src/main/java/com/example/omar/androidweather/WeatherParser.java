package com.example.omar.androidweather;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherParser {
    private static JSONObject weatherJSONData = null;

    // contructor, initialize with JSON object
    public WeatherParser(JSONObject inputJSON){
        this.weatherJSONData = inputJSON;
    }

    public String getWeatherData(){
        try {
            JSONArray dataArray = this.weatherJSONData.getJSONArray("list");
            JSONObject data = dataArray.getJSONObject(0);
            JSONObject weather = data.getJSONArray("weather").getJSONObject(0);
            String weatherDescription = weather.getString("description");
            Double temperature = (data.getJSONObject("main").getDouble("temp"));
            return temperature.toString() + " Kelvin" + ", " + weatherDescription;
        }catch(JSONException e){
            e.printStackTrace();
        }
        return "failed";
    }
}
