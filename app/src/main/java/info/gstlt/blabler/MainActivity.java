package info.gstlt.blabler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview = new WebView(this);

        webview.setWebViewClient(new WebViewClient());

        // Enable Javascript
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // enable webview
        setContentView(webview);

        // load URL
        webview.loadUrl("http://blabler.pl");
    }

        // catch back button
        @Override
        public void onBackPressed() {
            if(webview.canGoBack()) {
                webview.goBack();
            } else {
                super.onBackPressed();
            }
        }

}
