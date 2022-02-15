package com.example.listviewexmaple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    // Set data at first
    ListView simpleList;
    String[] countryList = {
            "India",
            "China",
            "Australia",
            "Portugal",
            "America",
            "New Zealand"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set ListView
        simpleList = (ListView) findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                R.layout.activity_listview,
                R.id.textView,
                countryList
        );
        simpleList.setAdapter(arrayAdapter);
    }
}