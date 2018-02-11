package com.example.administrator.mvpdemo.service.manager;

import android.content.Context;


import com.example.administrator.mvpdemo.service.RetrofitService;
import com.example.administrator.mvpdemo.service.RetrofitHelper;
import com.example.administrator.mvpdemo.service.entity.Book;

import rx.Observable;

/**
 * Created by win764-1 on 2016/12/12.
 */

public class DataManager {
    private RetrofitService mRetrofitService;
    //构造器里获取RetrofitService
    public DataManager(Context context){
        this.mRetrofitService = RetrofitHelper.getInstance(context).getServer();
    }
    //网络请求方法getSearchBooks
    public  Observable<Book> getSearchBooks(int num){

        return mRetrofitService.getSearchBooks(num);
    }
}
