package com.jspiders.androidlayout;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
	
	RelativeLayout relativelayout;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        relativelayout=(RelativeLayout)findViewById(R.layout.activity_main);
        Button b1=new Button(MainActivity.this);
        
        
    }


    
}
