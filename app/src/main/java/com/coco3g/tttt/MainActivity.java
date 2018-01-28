package com.coco3g.tttt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private WebView mWebView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

// App Logo
//        toolbar.setLogo(R.drawable.ic_launcher);
// Title
//        toolbar.setTitle("My Title");
// Sub Title
//        toolbar.setSubtitle("Sub title");

        setSupportActionBar(toolbar);

//       ActionBar actionBar =  getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);
//        actionBar.setHomeAsUpIndicator(R.mipmap.palette);


// Navigation Icon 要設定在 setSupoortActionBar 才有作用
// 否則會出現 back button
//        toolbar.setNavigationIcon(R.drawable.ab_android);






        CollapsingToolbarLayout st = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
       ImageView iv = (ImageView) findViewById(R.id.iv);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "蜗牛", Toast.LENGTH_SHORT).show();
//
//           finish();
            }
        });
               st.setTitle("我爱你笨笨");






//        mToolbar = (Toolbar) findViewById(R.id.toolbar);
//        mWebView = (WebView) findViewById(R.id.webview);
//        mWebView.loadUrl("http://baidu.com");
//
//        mWebView.setWebViewClient(new WebViewClient(){
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                view.loadUrl(url);
//                return true;
//            }
//
//
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.action_edit:
            Toast.makeText(MainActivity.this, "条目1", Toast.LENGTH_SHORT).show();
            break;
        case R.id.action_share:
            Toast.makeText(MainActivity.this, "条目2", Toast.LENGTH_SHORT).show();
            break;

    }

        return true;
    }
}
