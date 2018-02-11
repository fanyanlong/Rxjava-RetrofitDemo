package com.example.administrator.mvpdemo.service.presenter;

import android.content.Intent;

import com.example.administrator.mvpdemo.service.entity.Book;
import com.example.administrator.mvpdemo.service.model.BookModel;
import com.example.administrator.mvpdemo.service.view.BookView;
import com.example.administrator.mvpdemo.service.view.View;

public class BookPresenter implements Presenter {
    private BookView bookView;
    private final BookModel bookModel;

    public BookPresenter (BookView bookView){
        this.bookView = bookView;

        bookModel = new BookModel(this);
    }
    @Override
    public void onCreate() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {
        bookModel.onDestroy();
    }

    @Override
    public void pause() {

    }

    @Override
    public void attachView(View view) {
//        bookView = (BookView)view;
    }

    @Override
    public void attachIncomingIntent(Intent intetn) {

    }

    @Override
    public void onSuccess(Book book) {
        bookView.onSuccess(book);
    }

    public void getSearchBooks(int num){
        bookModel.getSearchBooks(num);
    }

}
