package com.example.myfirstapp.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myfirstapp.R;

import java.util.List;

public class NewsAdapter extends BaseAdapter {
    private List<News> mData;
    private Context mContext;

    public NewsAdapter(List<News> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.news_item, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.txt_item_title = (TextView) view.findViewById(R.id.txt_item_title);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.txt_item_title.setText(mData.get(i).getNew_title());
        return view;
    }

    private class ViewHolder {
        TextView txt_item_title;
    }
}
