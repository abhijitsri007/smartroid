package com.jspiders.list3;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView listview;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listview=(ListView)findViewById(R.id.listView1);
        
        final String[] names={"police","Hospital","Fire"};
        final int[] nos={100,101,102};
        
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, names);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, final int pos,
					long arg3) {
				Intent intent=new Intent();
		        intent.putExtra(names.toString(), nos);
				switch (pos) {
				case 0:
					
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
