package com.sabari.demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button signInBt,logInBt;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signInBt=(Button) findViewById(R.id.signInBt);
        logInBt=(Button) findViewById(R.id.logInBt);
        signInBt.setOnClickListener(new View.OnClickListener()
       {
			
			@Override
			public void onClick(View v) {
				Intent signIntent = new Intent(getBaseContext(),SignIn.class);
				startActivity(signIntent);
				
			}
			
		});
        logInBt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent logIntent = new Intent(getBaseContext(),LogIn.class);
				startActivity(logIntent);
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
