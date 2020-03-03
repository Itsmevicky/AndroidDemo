package com.example.funapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class WebviewActivity extends AppCompatActivity {

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        wv = findViewById(R.id.wv);
    }

    public void search(View view) {
        //wv.loadUrl("file:///android_asset/index.html");
        String data = "<html><body><h1> This is my first web page</h1></body></html>";
        wv.loadData(data, "text/html","UTF-8");
    }
}
