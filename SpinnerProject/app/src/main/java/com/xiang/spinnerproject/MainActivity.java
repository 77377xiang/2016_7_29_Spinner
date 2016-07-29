package com.xiang.spinnerproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner= (Spinner) findViewById(R.id.spacer);
        String [] arr={"text view","button","edit text"};
        //创建arrayAdapter对象
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice,arr);
        spinner.setAdapter(adapter);

    }
}
