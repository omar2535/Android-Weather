package com.example.omar.androidweather;

import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

public class TextViewModifier {
    public void modifyTextView(TextView textView, Object o){
        String resultString = o.toString();
        try {
            JSONObject results = new JSONObject(resultString);
            WeatherParser weatherParser = new WeatherParser(results);
            textView.setText(weatherParser.getWeatherData());
        }catch(JSONException e){
            e.printStackTrace();
        }
    }
}
