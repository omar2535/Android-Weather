package com.example.omar.androidweather;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        final TextView textview = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://api.openweathermap.org/data/2.5/forecast?q=Houston,us&appid=d467190d6456028713a3780775d82dc4";
                AsyncModifyTextViewAndAPICaller mycaller = new AsyncModifyTextViewAndAPICaller(url);
                mycaller.execute(textview);
            }
        });
    }
}
