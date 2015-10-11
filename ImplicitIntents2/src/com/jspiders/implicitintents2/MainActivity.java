package com.jspiders.implicitintents2;


import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button buttonclick;
	ImageView imageview;
	private static final int CAMERA=1313;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        buttonclick=(Button)findViewById(R.id.buttonclick);
        imageview=(ImageView)findViewById(R.id.imageview);
        
        buttonclick.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(intent, CAMERA);
				
				 
			}
		});

    }

@Override
protected void onActivityResult(int requestCode, int resultCode, final Intent data) {
	// TODO Auto-generated method stub
	super.onActivityResult(requestCode, resultCode, data);
	if(requestCode==CAMERA)
	{
		if(resultCode==RESULT_OK)
		{
			final Bitmap bm=(Bitmap)data.getExtras().get("data");
			imageview.setImageBitmap(bm);
			imageview.setOnClickListener(new OnClickListener() {
					
				@Override
				public void onClick(View arg0) {
					Intent intent = new Intent(MainActivity.this, SecondActivity.class); 
					intent.putExtra("key1",bm); 
					startActivity(intent); 
					}
				});
			
		}
		else if(resultCode==RESULT_CANCELED)
		{
			Toast.makeText(MainActivity.this, "Error with camera so no img to snd to next activity", Toast.LENGTH_SHORT).show();
			
		}
	
	}
}
}


   
  
