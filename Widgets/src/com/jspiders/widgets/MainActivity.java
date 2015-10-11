package com.jspiders.widgets;

import android.os.Bundle;
import android.app.Activity;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends Activity implements android.widget.RadioGroup.OnCheckedChangeListener{

    
	RadioButton radioButtonoption1;
    RadioGroup radioGroup1;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	
        radioButtonoption1=(RadioButton)findViewById(R.id.radioButtonoption1);
        radioGroup1=(RadioGroup)findViewById(R.id.radioGroup1);
        
        radioGroup1.setOnCheckedChangeListener(this);
        
        radioButtonoption1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
        		
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state) 
			{
				
				if(state==true)
				{
					Toast.makeText(MainActivity.this, "you selected option1", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
	@Override
	
	public void onCheckedChanged(RadioGroup arg0, int id) {
		switch (id) {
		case R.id.radio0:
			Toast.makeText(MainActivity.this, "you selected select 1", Toast.LENGTH_SHORT).show();
			break;
		case R.id.radio1:
			Toast.makeText(MainActivity.this, "you selected select 2", Toast.LENGTH_SHORT).show();
			break;
		case R.id.radio2:
			Toast.makeText(MainActivity.this, "you selected select 3", Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
		
	}
}
