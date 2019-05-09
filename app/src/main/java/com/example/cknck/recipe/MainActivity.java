package com.example.cknck.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> list = new ArrayList<String>();
    Button btnAdd;
    Button btnDel;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =(ListView)findViewById(R.id.listView1);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnDel = (Button)findViewById(R.id.btnDel);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice,list);

        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String item = list.get(position);
            }
        });

        final EditText edt = (EditText)findViewById(R.id.edt1);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = edt.getText().toString();
                list.add(str);
                adapter.notifyDataSetChanged();
                edt.setText("");
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = listView.getCheckedItemPosition();
                list.remove(pos);
                adapter.notifyDataSetChanged();
                listView.clearChoices();
            }
        });
    }
}
