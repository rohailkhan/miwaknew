package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alhamdullah on 3/31/2017.
 */

public class WordAdapter extends ArrayAdapter<wordjava> {
//public WordAdapter(@NonNull Context context,int resouce, ArrayList<wordjava> words)
    //our getView method will inflate the view .We dont need the default resouce of super class
    public WordAdapter(@NonNull Context context, ArrayList<wordjava> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View myview=convertView;
        if (myview==null){
            myview= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        // Get the {@link Word} object located at this position in the list
        wordjava currentWord = getItem(position);
        TextView onetext=(TextView)myview.findViewById(R.id.one);
        TextView twotext=(TextView)myview.findViewById(R.id.two);
        TextView threetext=(TextView)myview.findViewById(R.id.three);
        onetext.setText(currentWord.getArabic());
        twotext.setText(currentWord.getTranslation());
        threetext.setText(currentWord.getReference());
        return myview;
    }
}
