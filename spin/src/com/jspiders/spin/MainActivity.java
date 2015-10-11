package com.jspiders.spin;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputFilter.LengthFilter;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Spinner spinnerdropdown;
	TextView textviewselect1,textviewselect2;
	Button selectbutton;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final String[] conv={"length","temperature","currency"};
        textviewselect1=(TextView)findViewById(R.id.textbox1);
        textviewselect2=(TextView)findViewById(R.id.textbox2);
        selectbutton=(Button)findViewById(R.id.convert);
        spinnerdropdown=(Spinner)findViewById(R.id.spinnerdropdown);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,conv);
        spinnerdropdown.setAdapter(adapter);
        spinnerdropdown.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int pos, long arg3) {
				switch (pos) {
				case 0:
						textviewselect1.setHint("meter");
						textviewselect2.setHint("kilometer");
						selectbutton.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View arg0) {
								if(textviewselect1.length()!=0)
								{
									double i= Integer.parseInt(textviewselect1.getText().toString());
									double j=i/1000;
									textviewselect2.setText(Double.toString(j));
								}
								else if(textviewselect2.length()!=0)
								{
									double i= Double.parseDouble(textviewselect2.getText().toString());
									double j=i*1000;
									textviewselect1.setText(Double.toString(j));

								}
								else
								{
									Toast.makeText(MainActivity.this,"pls enter the value ", Toast.LENGTH_SHORT).show();
									
								}
							}
						});
					break;
				case 1:
					textviewselect1.setHint("celsious");
					textviewselect2.setHint("farenhite");
					selectbutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							if(textviewselect1.length()!=0)
							{
								double c= Integer.parseInt(textviewselect1.getText().toString());
								double f=(((c-32)*5)/9);
								textviewselect2.setText(Double.toString(f));
							}
							else if(textviewselect2.length()!=0)
							{
								double f= Double.parseDouble(textviewselect2.getText().toString());
								double c=(5.0/9.0)*(f-32);
								textviewselect1.setText(Double.toString(c));

							}
							else
							{
								Toast.makeText(MainActivity.this,"pls enter the value ", Toast.LENGTH_SHORT).show();
								
							}
							
						}
					});
					break;
				case 2:
					textviewselect1.setHint("Rs");
					textviewselect2.setHint("$");
					selectbutton.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							if(textviewselect1.length()!=0)
							{
								double r= Integer.parseInt(textviewselect1.getText().toString());
								double d=r*62;
								textviewselect2.setText(Double.toString(d));
							}
							else if(textviewselect2.length()!=0)
							{
								double d= Double.parseDouble(textviewselect2.getText().toString());
								double r=d/62;
								textviewselect1.setText(Double.toString(r));

							}
							else
							{
								Toast.makeText(MainActivity.this,"pls enter the value ", Toast.LENGTH_SHORT).show();
								
							}
						}
					});
					break;
				default:
					break;
				}				
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				
				
			}
        	
		});
        
    }


   
    
}
