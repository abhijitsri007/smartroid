package com.jspiders.implicitintents;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button buttoncall,buttonbrowse,buttoncamera;
	ImageView imageViewcaptured;
	private static final int CAMERA=1313; 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewcaptured=(ImageView)findViewById(R.id.imageViewcaptured);
        buttoncamera=(Button)findViewById(R.id.buttoncamera);
        buttonbrowse=(Button)findViewById(R.id.buttonbrowse);
        buttoncall=(Button)findViewById(R.id.buttoncall);
        buttoncall.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				//Intent intent=new Intent(Intent.ACTION_CALL);
				Intent intent=new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:"+"8431562232"));
				startActivity(intent);
				
				
				
			}
		});
        buttonbrowse.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.google.com"));
				startActivity(intent);
				
				
			}
		});
        buttoncamera.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				//startActivity(intent);
				startActivityForResult(intent,CAMERA);
			}
		});
        imageViewcaptured.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(intent,CAMERA);
			}
		});
    }

@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	// TODO Auto-generated method stub
	super.onActivityResult(requestCode, resultCode, data);
	if(requestCode==CAMERA)
	{
		if(resultCode==RESULT_OK)
		{
			Bitmap bm=(Bitmap)data.getExtras().get("data");
			imageViewcaptured.setImageBitmap(bm);
			
		}
		else if(resultCode==RESULT_CANCELED)
		{
			Toast.makeText(MainActivity.this, "Error with camera", Toast.LENGTH_SHORT).show();
			
		}
	
	}
}
   
    
}
