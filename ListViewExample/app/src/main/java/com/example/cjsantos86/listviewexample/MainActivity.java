package com.example.cjsantos86.listviewexample;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] listaAutoServicos = {"Estetica", "Auto mecanica", "Auto eletrica", "Seguro", "Rastreamento", "Funelaria"};

        ListAdapter theAdapter= new MyAdapter(this,listaAutoServicos);

        ListView theListView = (ListView) findViewById(R.id.theListView);

        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String autoSerico = "You Clicked" + String.valueOf(adapterView.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, autoSerico,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
