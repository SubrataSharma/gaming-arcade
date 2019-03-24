package com.example.subrata.funtime;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web = (WebView)findViewById(R.id.web);
        web.loadUrl("file:///android_res/raw/web.html");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(MainActivity.this,ArenaActivity.class);
                startActivity(in);
                finish();
            }
        },4000);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
