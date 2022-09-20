package com.firstapp.listview_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter ar;
    String[] cityname={"charminar","tajmahal","tajhotel","palace"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listview);

        ar=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,cityname);
        listView.setAdapter(ar);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(cityname[i].equals("charminar"))
                {
                    startActivity(new Intent(MainActivity.this,charminar.class));

                }
                else if(cityname[i].equals("mysore"))
                {
                    startActivity(new Intent(MainActivity.this,Mysore.class));
                }
                else if(cityname[i].equals("tajmahal"))
                {
                    startActivity(new Intent(MainActivity.this,TajMahal.class));
                }
                else if(cityname[i].equals("tejHotel"))
                {
                    startActivity(new Intent(MainActivity.this,TajHotel.class));
                }

            }
        });

    }
}