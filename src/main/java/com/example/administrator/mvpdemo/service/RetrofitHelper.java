package com.example.administrator.mvpdemo.service;

import android.content.Context;

import com.google.gson.GsonBuilder;



import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by win764-1 on 2016/12/12.
 */

public class RetrofitHelper {

    private Context mCntext;
   //初始化
    OkHttpClient client = new OkHttpClient();
    //gson工厂
    GsonConverterFactory factory = GsonConverterFactory.create(new GsonBuilder().create());
    private static RetrofitHelper instance = null;
    private Retrofit mRetrofit = null;
    //单例模式
    public static RetrofitHelper getInstance(Context context){
        if (instance == null){
            instance = new RetrofitHelper(context);
        }
        return instance;
    }
    private RetrofitHelper(Context mContext){
        mCntext = mContext;
        init();
    }

    private void init() {
        resetApp();
    }

    private void resetApp() {
        //初始化retrofit
        //  //http://api.tianapi.com/huabian/?key=71e58b5b2f930eaf1f937407acde08fe&num=20
        mRetrofit = new Retrofit.Builder()
                .baseUrl("http://api.tianapi.com/huabian/")
                .client(client)
                .addConverterFactory(factory)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }
    public RetrofitService getServer(){
        return mRetrofit.create(RetrofitService.class);
    }
}
