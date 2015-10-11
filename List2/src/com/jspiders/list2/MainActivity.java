package com.jspiders.list2;



import java.util.HashMap;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {

	ListView phoneslistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] phones={"POLICE","FIRE","HOSPITAL","MOM","DAD","BROTHER","FRIEND","CUSIONS"};
        final HashMap<String, Integer> hm=new HashMap<String, Integer>();
        
        phoneslistview=(ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,phones);
        		phoneslistview.setAdapter(adapter);
        phoneslistview.setOnItemClickListener(new OnItemClickListener() {
        	
/*
 * Author :
 * parms :
 * doc :
 * dom :
 * 
 * @see android.widget.AdapterView.OnItemClickListener#onItemClick(android.widget.AdapterView, android.view.View, int, long)
 */
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, final int position,
					long arg3) {
				
				switch (position) {
				case 0:
					hm.put("police", 100);
					emergency(hm.get("police"));
					break;
				case 1:
					hm.put("fire", 101);
					emergency(hm.get("fire"));
					break;
				case 2:
					hm.put("hospital", 102);
					emergency(hm.get("hospital"));
					break;
				case 3:
					hm.put("mom", 103);
					emergency(hm.get("mom"));
					break;
				case 4:
					hm.put("dad", 104);
					emergency(hm.get("dad"));
					break;
				case 5:
					hm.put("brother", 105);
					emergency(hm.get("brother"));
					break;
				case 6:
					hm.put("friend", 106);
					emergency(hm.get("cusions"));
					break;
				case 7:
					hm.put("cusions", 107);
					emergency(hm.get("cusions"));
					break;

				default:
					break;
				}
			}
        	
		});
       
    }
    public void emergency(int i)
    {
    	Intent intent=new Intent();
    	intent.setData(Uri.parse("tel:"+i));
		startActivity(intent);

    }

    
}
