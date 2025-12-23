package com.example.livetv;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView w = findViewById(R.id.web);

        WebSettings s = w.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setMediaPlaybackRequiresUserGesture(false);

        w.setWebViewClient(new WebViewClient());

        w.loadUrl("https://USERNAME.github.io/live-tv/");
    }

    @Override
    public void onBackPressed() {
        WebView w = findViewById(R.id.web);
        if (w.canGoBack()) {
            w.goBack();
        } else {
            super.onBackPressed();
        }
    }
}