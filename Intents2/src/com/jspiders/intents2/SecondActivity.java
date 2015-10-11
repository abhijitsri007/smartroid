package com.jspiders.intents2;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends Activity {

	TextView outtextview,msgtextview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
outtextview=(TextView)findViewById(R.id.outtextview);
msgtextview=(TextView)findViewById(R.id.msgtextview);

		Intent intent=getIntent();
		String s1=intent.getStringExtra("key3");
		String s2=intent.getStringExtra("key4");
		
		if("square".equals(s1))
		{
			Bundle b1=intent.getExtras();
			double g1=b1.getDouble("key1");
			double w1=g1*g1;
			outtextview.setText(""+g1+"x"+g1+"="+w1);
			
			Bundle b3=intent.getExtras();
			String s3=b3.getString("key2");
			msgtextview.setText(s3+" "+"square of a no is:");
			
		}
		else if("cube".equals(s2))
		{
			Bundle b1=intent.getExtras();
			Double g1=b1.getDouble("key1");
			Double w1=g1*g1*g1;
			outtextview.setText(g1+"x"+g1+"x"+g1+"="+w1);
			
			Bundle b3=intent.getExtras();
			String s3=b3.getString("key2");
			msgtextview.setText(s3+" "+"cube of a no is:");
			
		}
		else
		{
			Bundle b3=intent.getExtras();
			String s3=b3.getString("key2");
			msgtextview.setText(s3+" "+"there is no inputs");
		}
	
	}



}
