package com.example.administrator.mvpdemo.service.model.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.mvpdemo.R;
import com.example.administrator.mvpdemo.service.entity.Book;
import com.example.administrator.mvpdemo.ui.activity.WebActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;

/**
 * Created by Administrator on 2018/1/30,0030.
 */

public class MyAdapter extends XRecyclerView.Adapter<MyAdapter.ViewHolder>{
    private List<Book.NewslistBean> list;
    private Context context;
    private OnItemClickListener onItemClick;

    public MyAdapter(Context context, List<Book.NewslistBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context,R.layout.adapter_item,null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, final int position) {
        holder.textView1.setText(list.get(position).getTitle());
//        holder.textView2.setText(list.get(position).getDescription());
      holder.image.setImageURI(list.get(position).getPicUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,WebActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView1;
//        TextView textView2;
        SimpleDraweeView image;


        public ViewHolder(View itemView) {
            super(itemView);
            textView1 = (TextView) itemView.findViewById(R.id.adapter_text1);
//            textView2 = (TextView) itemView.findViewById(R.id.adapter_text2);
            image = itemView.findViewById(R.id.simpledrwee);
        }
    }

    /**
     * 自定义接口
     */
    public interface OnItemClickListener{
        void onItemClick(View view,int position);
    }

    public void setOnItemClick(OnItemClickListener onItemClick){
        this.onItemClick = onItemClick;
    }
}
