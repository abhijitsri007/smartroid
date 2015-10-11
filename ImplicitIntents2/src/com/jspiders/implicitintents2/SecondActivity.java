package com.jspiders.implicitintents2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.ImageView;

public class SecondActivity extends Activity {
	ImageView imageView1;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		imageView1=(ImageView)findViewById(R.id.imageView1);
		
		
		Intent intent=getIntent();
		Bitmap bmp=(Bitmap)intent.getParcelableExtra("key1");
		imageView1.setImageBitmap(bmp);
		   
		   
	}


}
