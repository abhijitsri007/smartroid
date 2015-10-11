package com.jspiders.intents2;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends Activity {

	EditText edittextnos,edittextmsg;
    Spinner spinner1;
    Button start;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
    final String[] conv={"square","cube"};
    edittextnos=(EditText)findViewById(R.id.edittextnos);
    edittextmsg=(EditText)findViewById(R.id.edittextmsg);
    start=(Button)findViewById(R.id.start);
    
    
    spinner1=(Spinner)findViewById(R.id.spinner1);
    ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,conv);
    spinner1.setAdapter(adapter);
    spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> arg0, View arg1, final int pos,
				long arg3) {
			
			 start.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						double i1=Double.parseDouble(edittextnos.getText().toString());
						Intent intent=new Intent(MainActivity.this, SecondActivity.class);
						intent.putExtra("key1",i1);
						String i2=edittextmsg.getText().toString();
						intent.putExtra("key2",i2);
						
			switch (pos) {
			case 0:
				String s1="square";
				intent.putExtra("key3",s1);
				startActivity(intent);
				
				break;
			case 1:
				String s2="cube";
				intent.putExtra("key4",s2);
				startActivity(intent);
				
				break;	
			default:
				startActivity(intent);
				break;
			}
			
		
			 }
		});
		}
    
		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			
			Toast.makeText(MainActivity.this, "pls make your selection", Toast.LENGTH_SHORT).show();
			
		}
	});

   
    }
}
