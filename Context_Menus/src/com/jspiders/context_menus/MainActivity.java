package com.jspiders.context_menus;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] contacts={"AAA","BBB","CCC","DDD","EEE","FFF"};
        listView1=(ListView)findViewById(R.id.listView1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, contacts);
        listView1.setAdapter(adapter);
        registerForContextMenu(listView1);
    }
@Override
public void onCreateContextMenu(ContextMenu menu, View v,
		ContextMenuInfo menuInfo) {
	menu.setHeaderTitle("choose your option");
	super.onCreateContextMenu(menu, v, menuInfo);
	getMenuInflater().inflate(R.menu.context_menu, menu);
}

    @Override
    public boolean onContextItemSelected(MenuItem item) {
    
    	
    	if(item.getItemId()==R.id.call)
    	{
    		Toast.makeText(MainActivity.this, "calling...", Toast.LENGTH_SHORT).show();
    		
    	}
    	return super.onContextItemSelected(item);
    }
    
}
