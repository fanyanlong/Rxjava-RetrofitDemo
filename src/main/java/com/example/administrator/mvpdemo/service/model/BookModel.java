package com.example.administrator.mvpdemo.service.model;

import android.content.Context;
import android.util.Log;

import com.example.administrator.mvpdemo.service.entity.Book;
import com.example.administrator.mvpdemo.service.manager.DataManager;
import com.example.administrator.mvpdemo.service.presenter.Presenter;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Administrator on 2018/1/30,0030.
 */

public class BookModel  {

    private Presenter presenter;

    private DataManager manager;
    //处理订阅事件
    private CompositeSubscription mCompositeSubscription;
    private Context mContext;

    public BookModel(final Presenter presenter) {
        this.presenter = presenter;

        //获取网络请求
        manager = new DataManager(mContext);
        mCompositeSubscription = new CompositeSubscription();

    }
    public void getSearchBooks(int num){
        mCompositeSubscription.add(

                //observerble 被观察者
                manager.getSearchBooks(num)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        //订阅         //观察者
                        .subscribe(new Observer<Book>() {
                            @Override
                            public void onCompleted() {

                            }

                            @Override
                            public void onError(Throwable e) {

                            }

                            @Override
                            public void onNext(Book book) {
                                presenter.onSuccess(book);
                                String alt_title = book.getNewslist().get(0).getTitle();
                                Log.i("-----",alt_title);

                            }
                        })
        );
    }

    public void onDestroy(){
        //获取订阅关系
        if (mCompositeSubscription.hasSubscriptions()){
            //取消订阅
            mCompositeSubscription.unsubscribe();
        }
    }
}
