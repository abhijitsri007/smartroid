package com.jspiders.list1;


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
        
final String[] phones={"A","B","C","D","E","F","G","H"};
        
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
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				Intent intent=new Intent(Intent.ACTION_DIAL);
				switch (position) {
				case 0:				
					new Intent(Intent.ACTION_DIAL);
					intent.setData(Uri.parse("tel:"+"8431562232"));
					startActivity(intent);
					break;
					
				case 1:
					new Intent(Intent.ACTION_DIAL);
					intent.setData(Uri.parse("tel:"+"8123827341"));
					startActivity(intent);
					break;
				case 3:
					new Intent(Intent.ACTION_DIAL);
					intent.setData(Uri.parse("tel:"+"9835307436"));
					startActivity(intent);
					break;
				case 4:
					new Intent(Intent.ACTION_DIAL);
					intent.setData(Uri.parse("tel:"+"9430703473"));
					startActivity(intent);
					break;
				case 5:
					new Intent(Intent.ACTION_DIAL);
					intent.setData(Uri.parse("tel:"+"9931135322"));
					startActivity(intent);
					break;
				case 6:
					new Intent(Intent.ACTION_DIAL);
					intent.setData(Uri.parse("tel:"+"9835568089"));
					startActivity(intent);
					
					break;
				case 7:
					new Intent(Intent.ACTION_DIAL);
					intent.setData(Uri.parse("tel:"+"9686209554"));
					startActivity(intent);
					break;
					

				default:
					break;
				}
			}
        	
		});
    }


    
    
}
