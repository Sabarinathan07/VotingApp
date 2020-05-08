package com.sabari.demo;

import java.util.ArrayList;

import com.sabari.demo.MainActivity;
import com.sabari.demo.R;
import com.sabari.demo.EventName;
import com.sabari.demo.MyAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class LastActivity extends Activity implements ListListener{
	ListView listview;
	ArrayList<EventName> list = new ArrayList<EventName>();
	MyAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_last);
		 listview=(ListView) findViewById(R.id.lv);
	        list.add(new EventName("Sabari",0));
	        list.add(new EventName("Deepi",0));
	        list.add(new EventName("Divi",0));
	        list.add(new EventName("Angel",0));
	        list.add(new EventName("Keerthi",0));
	        list.add(new EventName("Suji",0));
	        list.add(new EventName("Swetha",0));
	        list.add(new EventName("Siva",0));
	        list.add(new EventName("Roshini",0));
	        list.add(new EventName("Madhi",0));
	        list.add(new EventName("Sandy",0));
	        list.add(new EventName("Moni",0));
	        
	        adapter=new MyAdapter(LastActivity.this,list,this);
	        listview.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.last, menu);
		return true;
	}

	@Override
	public void onItemClicked(int pos) {
		// TODO Auto-generated method stub
		EventName name=list.get(pos);
		name.setLikes(name.getLikes()+1);
		adapter.notifyDataSetChanged();
	}

}
