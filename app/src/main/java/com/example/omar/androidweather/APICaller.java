package com.example.omar.androidweather;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class APICaller {
    private static String URL = "";

    public APICaller(String URL){
        this.URL = URL;
    }

    public Object callAPI(){
        OkHttpClient client = new OkHttpClient();
        Response response = null;
        Request request = new Request.Builder()
                .url(URL)
                .build();

        // attempt to call API
        try{
            response = client.newCall(request).execute();
            return response.body().string();
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
