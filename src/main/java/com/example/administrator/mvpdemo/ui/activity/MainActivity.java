package com.example.administrator.mvpdemo.ui.activity;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.mvpdemo.R;
import com.example.administrator.mvpdemo.service.RetrofitService;
import com.example.administrator.mvpdemo.service.entity.Book;
import com.example.administrator.mvpdemo.service.model.adapter.MyAdapter;
import com.example.administrator.mvpdemo.service.presenter.BookPresenter;
import com.example.administrator.mvpdemo.service.view.BookView;
import com.google.gson.GsonBuilder;
import com.jcodecraeer.xrecyclerview.ProgressStyle;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements BookView{


    //view 中初始化presenter对象
    private List<Book.NewslistBean> bookList;
    private XRecyclerView xRecyclerView;
    private Button button;

    private MyAdapter adapter;
    private int num=20;
    private int page=1;
    private BookPresenter mBookPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBookPresenter = new BookPresenter(this);
        xRecyclerView = (XRecyclerView) findViewById(R.id.xRecycleView);
        //设置属性
        xRecyclerView.setPullRefreshEnabled(true);
        xRecyclerView.setLoadingMoreEnabled(true);
        xRecyclerView.setRefreshProgressStyle(ProgressStyle.BallSpinFadeLoader);
        xRecyclerView.setLoadingMoreProgressStyle(ProgressStyle.Pacman);

        xRecyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            //刷新机制

            /**
             * 清空集合数据
             * 请求现在刷新得数据
             * 刷新Xreylerview
             */
            @Override
            public void onRefresh() {
                getData(num);

               xRecyclerView.refreshComplete();
               //要判断
               bookList.clear();

            }

            @Override
            public void onLoadMore() {
                num++;
                getData(num);

                xRecyclerView.refreshComplete();


            }
        });
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mBookPresenter.getSearchBooks(20);
            }
        });
//        mBookPresenter.onCreate();
    }

    private void getData(int num) {
        mBookPresenter.getSearchBooks(20);
    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
        mBookPresenter.onStop();
    }



    /**
     * 重写的方法
     * @param mBook
     */
    @Override
    public void onSuccess(Book mBook) {
        bookList = mBook.getNewslist();
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                adapter = new MyAdapter(MainActivity.this,bookList);
                xRecyclerView.setAdapter(adapter);
                xRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false));
                adapter.setOnItemClick(new MyAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                      Toast.makeText(MainActivity.this,"您点击了准备跳转",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    @Override
    public void onError(String result) {
        Toast.makeText(MainActivity.this,result, Toast.LENGTH_SHORT).show();

    }
}
