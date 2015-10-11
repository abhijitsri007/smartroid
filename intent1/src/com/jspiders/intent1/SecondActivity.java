package com.jspiders.intent1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity {

	EditText textview2;
	Button button1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		button1=(Button)findViewById(R.id.button1);
		textview2=(EditText)findViewById(R.id.textview2);
		
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String s1=textview2.getText().toString();
				Intent intent=new Intent();
				intent.putExtra("key1", s1);
				setResult(RESULT_OK, intent);
				finish();
				
			}
		});
	}

	
}
