package com.asgar.uiwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebView1 extends AppCompatActivity {
    WebView webview_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view1);

        webview_one = findViewById(R.id.webview_one); //id get krwana...

        //for progress bar in web_view
        ProgressDialog progressDialog = new ProgressDialog(WebView1.this);
        progressDialog.setTitle("Page Loading");
        progressDialog.setMessage("Page is loading please wait...!!");
        progressDialog.setCancelable(false);
        //////////////////////////////////


        //Depending on your requirement you can get WebView setting but its optional.
        webview_one.getSettings().setPluginState(WebSettings.PluginState.ON);
        webview_one.getSettings().setJavaScriptEnabled(true);
        webview_one.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        webview_one.getSettings().setSupportMultipleWindows(true);

        //for zoom control in web_view
        webview_one.getSettings().setSupportZoom(true);
        webview_one.getSettings().setBuiltInZoomControls(true);
        //////////////////////////////////////////////////////

        webview_one.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(WebView1.this, "Error : "+description, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                progressDialog.show();
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                progressDialog.dismiss();
            }
        });

        webview_one.loadUrl("https://www.iul.ac.in/");
    }
}