package com.wujie.fireworks;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        webView = (WebView) findViewById(R.id.webView);

        WebSettings wSet = webView.getSettings();
        //调用WebView关联的WebSettings中setJavaScriptEnable(true)方法。
        wSet.setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/web/index.html");
    }
}
