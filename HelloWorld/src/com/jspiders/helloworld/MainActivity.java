package com.jspiders.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener
{
	
	Button loginbutton,cancelbutton,signupbutton;
	EditText usernameeditText,passwordEditText;
	String Stusername="user1";
	String Stpassword="1234";
	String entUsername;
	String entPassword;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
     
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//activity gives UI for interaction
            
        loginbutton=(Button)findViewById(R.id.loginbutton);
        cancelbutton=(Button)findViewById(R.id.cancelbutton);
        signupbutton=(Button)findViewById(R.id.signupbutton);
        usernameeditText=(EditText)findViewById(R.id.usernameeditText1);
        passwordEditText=(EditText)findViewById(R.id.passwordeditText);
        
        loginbutton.setOnClickListener(this);
        signupbutton.setOnClickListener(this);
        signupbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Log.d("[DEBUG]","signupbutton clicked");
       		}
       	});
    } 
		  			
   	
    @Override
	public void onClick(View v) {
		Toast.makeText(this, "login button pressed", Toast.LENGTH_SHORT).show();
		
	}
	public void login(View v1)
   	{
   		entUsername = usernameeditText.getText().toString();
   		entPassword = passwordEditText.getText().toString();
    			
   		if(Stusername.equalsIgnoreCase(entUsername)&& Stpassword.equals(entPassword))
   		{
   			Log.d("[DEBUG]","Successfully Login");
    		Toast.makeText(this, "login succesfully" , Toast.LENGTH_SHORT).show();
   		}
   		else
   		{
   			Log.d("[DEBUG]","Login Fail");
   			Toast.makeText(this, "login failed" , Toast.LENGTH_SHORT).show();
   		}
   	}
}

	


