package com.example.administrator.mvpdemo.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import com.example.administrator.mvpdemo.R;


public class WebActivity extends AppCompatActivity implements View.OnClickListener {

    WebView webView;//浏览器
    EditText edtttUri;//地址栏
    Button btnGo;//打开网页按钮

    Button btnRefresh;//刷新按钮



    private Button button;
    private String strUriHome = "http://www.baidu.com";//默认首页
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

          //获取控件
        webView = (WebView)findViewById(R.id.wbvw);
        edtttUri = (EditText)findViewById(R.id.edtttUri);
        btnGo = (Button)findViewById(R.id.btnGo);

        btnRefresh = (Button)findViewById(R.id.btnRefresh);
        //让浏览器支持javascript
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onLoadResource(WebView view, String url) {
                edtttUri.setText(view.getUrl());
                super.onLoadResource(view, url);
            }
        });  //当跳转网页时，仍在WebView中打开。
        webView.loadUrl(strUriHome);
        btnGo.setOnClickListener(this);
        btnRefresh.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //转到
            case R.id.btnGo:
                try {
                    String strUri = uriHttpFirst(edtttUri.getText().toString());//网址协议判断
                    webView.loadUrl(strUri);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            //刷新
            case R.id.btnRefresh:
                try {
                    webView.reload();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }

    }
    //地址HTTP协议判断，无HTTP打头的，增加http://，并返回。
    private String uriHttpFirst(String strUri){

        if(strUri.indexOf("http://",0) != 0 && strUri.indexOf("https://",0) != 0 ){
            strUri = "http://" + strUri;
        }

        return strUri;
    }


}
