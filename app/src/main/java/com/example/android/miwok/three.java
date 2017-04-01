package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayAdapter<wordjava> mydapter=new ArrayAdapter<wordjava>();
        mydapter.add(new wordjava("one" , "one" , "one"));
        mydapter.add(new wordjava("one" , "one" , "one"));
        mydapter.add(new wordjava("one" , "one" , "one"));
        mydapter.add(new wordjava("one" , "one" , "one"));
        mydapter.add(new wordjava("one" , "one" , "one"));
        mydapter.add(new wordjava("one" , "one" , "one"));
        mydapter.add(new wordjava("one" , "one" , "one"));
        mydapter.add(new wordjava("one" , "one" , "one"));
        mydapter.add(new wordjava("one" , "one" , "one"));



    }
}
