package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<wordjava > words=new ArrayList<wordjava>();
        words.add(new wordjava("one" ,"one" ,"one"));
        words.add(new wordjava("two" ,"two" , "two"));
        words.add(new wordjava("one" ,"one" ,"one"));
        words.add(new wordjava("two" ,"two" , "two"));
        words.add(new wordjava("one" ,"one" ,"one"));
        words.add(new wordjava("two" ,"two" , "two"));
        words.add(new wordjava("one" ,"one" ,"one"));
        words.add(new wordjava("two" ,"two" , "two"));
        words.add(new wordjava("one" ,"one" ,"one"));
        words.add(new wordjava("two" ,"two" , "two"));

        WordAdapter myadapter=new WordAdapter(this,words);
        ListView mylinear=(ListView)findViewById(R.id.word_list_id);
        mylinear.setAdapter(myadapter);
    }
}
