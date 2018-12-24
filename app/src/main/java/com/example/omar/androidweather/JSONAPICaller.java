package com.example.omar.androidweather;

import android.os.AsyncTask;
import android.view.View;
import android.widget.TextView;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.w3c.dom.Text;

import java.io.IOException;

public class JSONAPICaller {
    private String URL;

    public JSONAPICaller(String URL){
        this.URL = URL;
    }

    public void execute(final TextView textView){
        AsyncTask asyncTask = new AsyncTask() {
            @Override
            protected Object doInBackground(Object[] objects) {
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

            @Override
            protected void onPostExecute(Object o) {
                textView.setText(o.toString());
            }
        }.execute();
    }
}
