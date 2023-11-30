package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    AdapterView adapterView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        String[] cities = {"Meerut","Ghaziabad","Delhi","Jhansi", "Agra","Noida","Lucknow","Kanpur","Rampur","Ayodhya","Prayagaraj","Varansi","Saharanput","Firozabad","Faridabad", "Mathura", "Aligarg"};
//        adapter is used to get data and set it on the any type of View
//        ArrayAdapter contains three parameters:- Context, Type of Layout(android layout or any other laout), Array(data source)
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities);
//        set adapter
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id){
                Toast.makeText(MainActivity.this, ""+cities[position], Toast.LENGTH_SHORT).show();
                if(position == 2){
                    Toast.makeText(MainActivity.this, "NEW DELHI", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}