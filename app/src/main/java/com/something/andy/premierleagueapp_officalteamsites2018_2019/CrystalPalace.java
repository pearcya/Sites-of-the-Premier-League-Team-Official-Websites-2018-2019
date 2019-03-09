package com.something.andy.premierleagueapp_officalteamsites2018_2019;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CrystalPalace extends Activity{

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crystalpalace);

        webView = (WebView) findViewById(R.id.crystalpalaceWebView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.cpfc.co.uk/");

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
