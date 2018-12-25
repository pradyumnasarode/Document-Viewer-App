package com.example.harshjain.document_viewer;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.webView1);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        String pdf = "http://www.pc-hardware.hu/PDF/konfig.pdf";
        String doc="<iframe src='http://docs.google.com/gview?embedded=true&url=http://www.pc-hardware.hu/PDF/konfig.pdf' width='100%' height='100%' style='border: none;'></iframe>";
//        webView = (WebView)findViewById(R.id.)
        webView.getSettings().setJavaScriptEnabled(true);

        webView.getSettings().setAllowFileAccess(true);
        webView.loadData( doc , "text/html", "UTF-8");
//            webView.loadUrl(doc);
    }
    }

