package com.jspiders.intents;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity {
	TextView outputtextview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		outputtextview=(TextView)findViewById(R.id.outputtextview);
		
		Intent intent=getIntent();
		Bundle b1=intent.getExtras();
		String s1=b1.getString("key2");
		outputtextview.setText(s1);
		
	}



}
