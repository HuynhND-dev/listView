package com.huynhnd.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMonHoc;
    ArrayList<String> arrayCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonHoc = (ListView) findViewById(R.id.listview);
        arrayCourse = new ArrayList<>();

        arrayCourse.add("android");
        arrayCourse.add("PHP");
        arrayCourse.add("java");
        arrayCourse.add("PYTHON");
        arrayCourse.add("js");

        ArrayAdapter arrayAdapter =new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arrayCourse);

        lvMonHoc.setAdapter(arrayAdapter);

    }
}