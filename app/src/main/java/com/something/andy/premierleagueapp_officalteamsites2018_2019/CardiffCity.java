package com.something.andy.premierleagueapp_officalteamsites2018_2019;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CardiffCity extends Activity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardiffcity);

        webView = (WebView) findViewById(R.id.cardiffcityWebView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.cardiffcityfc.co.uk/");

    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();

        } else {
            super.onBackPressed();
        }

    }
}


