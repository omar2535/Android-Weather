package com.example.omar.androidweather;

import org.json.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;

public class JSONAPICallerTest {
    private static APICaller testCaller = null;

    @BeforeClass
    public static void testConstructor(){
        testCaller = new APICaller("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22");
    }

    @Test
    public void testHasObjects(){
        try {
            JSONObject jsonObject = new JSONObject(testCaller.toString());
            assertEquals(jsonObject.getString("name"), "Cairns");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
