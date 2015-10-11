package com.jspiders.activitylifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	TextView statetextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        statetextview=(TextView)findViewById(R.id.textViewstate);
        statetextview.setText("Inside Onstart()");
        Toast.makeText(MainActivity.this, "inside Oncreate()", Toast.LENGTH_SHORT).show();
        
    }
    @Override
    protected void onStart() {
    	super.onStart();
    	statetextview.setText("Inside Onstart()");
        Toast.makeText(MainActivity.this, "inside Onstart()", Toast.LENGTH_SHORT).show();

    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    	statetextview.setText("Inside Onresume()");
        Toast.makeText(MainActivity.this, "inside Onresume()", Toast.LENGTH_SHORT).show();

    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    	statetextview.setText("Inside Onpause()");
        Toast.makeText(MainActivity.this, "inside Onpause()", Toast.LENGTH_SHORT).show();

    }
    
    @Override
    protected void onStop() {
    	super.onStop();
    	statetextview.setText("Inside Onstop()");
        Toast.makeText(MainActivity.this, "inside Onstop()", Toast.LENGTH_SHORT).show();

    }
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	statetextview.setText("Inside Ondestroy()");
        Toast.makeText(MainActivity.this, "inside Ondestroy()", Toast.LENGTH_SHORT).show();

    }
  
}
