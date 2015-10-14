package com.jspiders.menus1;

import android.os.Bundle;
import android.os.Message;
import android.app.Activity;
import android.content.ClipData.Item;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends Activity {
EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText) findViewById(R.id.editText1);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        
    }
    @Override
    	public boolean onOptionsItemSelected(MenuItem item) {
    		// TODO Auto-generated method stub
    		
    		if(item.getItemId()==R.id.share)
            {
            	String inputmsg=editText1.getText().toString();
            	Intent shareintent=new Intent(Intent.ACTION_SEND);
            	shareintent.setType("text/plain");
            	shareintent.putExtra(Intent.EXTRA_TEXT, inputmsg);
            	startActivity(Intent.createChooser(shareintent, "share via"));
            }
            return super.onOptionsItemSelected(item);
    	}
    
}
