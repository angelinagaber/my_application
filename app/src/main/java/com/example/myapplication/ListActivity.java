package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

         String[] items ={"Android" , "Windows" , "iphone" ,"blackberry" , "linux"};
        ListAdapter adapter = new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1 , items);
        ListView thelist =(ListView)findViewById(R.id.ListView);
        thelist.setAdapter(adapter);
        thelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent2 = new Intent(ListActivity.this , DeviceDetailActivity.class);
                startActivity(intent2);
            }
        });



    }
}
