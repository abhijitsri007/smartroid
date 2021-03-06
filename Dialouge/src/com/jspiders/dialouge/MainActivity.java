package com.jspiders.dialouge;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button alertbutton,loginbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        alertbutton=(Button)findViewById(R.id.button1);
        loginbutton=(Button)findViewById(R.id.button2);
    }
public void alertdlg(View v) {
	
	String[] color={"RED","GREEN","YELLOW"};
	AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
	
	builder.setTitle("choose ur color");
	
	builder.setMultiChoiceItems(color, null, new OnMultiChoiceClickListener() {
		
		@Override
		public void onClick(DialogInterface arg0, int id, boolean arg2) {
			
			ArrayList<Integer> list=new ArrayList<Integer>();
			if(arg2==true)
			{
				list.add(id);
			}
			else if(list.contains(id))
			{
				list.remove(id);
			}
		}
	});
	AlertDialog dialog=builder.create();
	dialog.show();
	
}
@Override
public boolean onKeyDown(int keyCode, KeyEvent event) {
	if(keyCode==KeyEvent.KEYCODE_BACK)
	{
		AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
		builder.setTitle("This is Alert!!!");
		builder.setMessage("do you want to exit?");
		builder.setPositiveButton("yes", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				
				finish();
			}
		});
		builder.setNegativeButton("No",	 new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				
				arg0.dismiss();
			}
		});
		
		
		AlertDialog dialog=builder.create();
		dialog.show();
		
	}
	return true;
}
public void login(View v)
{
	AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
	
	View view;
	
	LayoutInflater inflater = getLayoutInflater();
	view = inflater.inflate(R.layout.dialogs,null);
	builder.setTitle("Login to APP");
	builder.setView(view);
	builder.setPositiveButton("Login",new OnClickListener() {
		
		@Override
		public void onClick(DialogInterface arg0, int arg1) {
			// TODO Auto-generated method stub
			
		}
	});
	
	
	AlertDialog d1 = builder.create();
	d1.show();
	}
    
}
