package com.example.omar.androidweather;

import android.os.AsyncTask;
import android.view.View;
import android.widget.TextView;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.IOException;

public class AsyncModifyTextViewAndAPICaller {
    private String URL;

    public AsyncModifyTextViewAndAPICaller(String URL){
        this.URL = URL;
    }

    public void execute(final TextView textView){
        AsyncTask asyncTask = new AsyncTask() {
            @Override
            protected Object doInBackground(Object[] objects) {
                APICaller myCaller = new APICaller(URL);
                return myCaller.callAPI();
            }

            @Override
            protected void onPostExecute(Object o) {
                TextViewModifier tvf = new TextViewModifier();
                tvf.modifyTextView(textView, o);
            }
        }.execute();
    }
}
