package com.something.andy.premierleagueapp_officalteamsites2018_2019;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Southampton extends Activity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.southampton);

        webView = (WebView) findViewById(R.id.southamptonWebView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://southamptonfc.com/");

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