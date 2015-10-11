package com.example.brewclock;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button startButton;
	Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        Toast.makeText(this,"Hello Amit",Toast.LENGTH_SHORT).show();
        startButton = (Button) findViewById(R.id.brew_start);
        startButton.setOnClickListener(new View.OnClickListener() {
			int a=1;
			@Override
			public void onClick(View v) {
				Toast.makeText(context, "Value of a=" + a, Toast.LENGTH_LONG).show();
				a++;
			}
		});
    }
    
    /*class MyOnClickListener implements View.OnClickListener {

		@Override
		public void onClick(View v) {
			Toast.makeText(context, "Button clicked", Toast.LENGTH_LONG).show();
			
		}
    	
    }*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
