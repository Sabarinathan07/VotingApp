package com.sabari.demo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends Activity {
EditText name,email,pass;
Button signIn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_in);
		name=(EditText) findViewById(R.id.name);
		email=(EditText) findViewById(R.id.email);
		pass=(EditText) findViewById(R.id.pass);
		signIn=(Button) findViewById(R.id.button1);
		signIn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent signIn=new Intent(getApplicationContext(),LastActivity.class);
				startActivity(signIn);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sign_in, menu);
		return true;
	}

}
