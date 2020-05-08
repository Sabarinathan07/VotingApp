package com.sabari.demo;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.sabari.demo.EventName;
import com.sabari.demo.R;
import com.sabari.demo.ListListener;

public class MyAdapter extends BaseAdapter {
	Context context;
	ArrayList list;
	LayoutInflater inflater;
	ListListener listener;

	public MyAdapter(Context c, ArrayList<EventName> list,ListListener listener){
			 
		this.context=c;
		this.list=list;
		inflater=LayoutInflater.from(c);
		this.listener=listener;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(final int pos, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		View v=inflater.inflate(R.layout.item,arg2,false);

        TextView name,likes;
        ImageButton add;
        add=(ImageButton) v.findViewById(R.id.add);
        name=(TextView) v.findViewById(R.id.name);
        likes=(TextView) v.findViewById(R.id.likes);
        EventName eventName = (EventName) list.get(pos);
        name.setText(eventName.getNames());
        likes.setText("likes"+eventName.getLikes()+"");
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
					listener.onItemClicked(pos);
			}
		});
		return v;
	}

}
