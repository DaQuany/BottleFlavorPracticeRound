package com.example.practiceround;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.sql.Array;
import java.util.List;

public class HartAdapter extends ArrayAdapter<Hart> {
    public HartAdapter(Context context, List<Hart> harts){
        super(context, 0, harts);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,@NonNull ViewGroup parent){
        Hart hart = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout)
        }
        return super.getView(position, convertView, parent);
    }
}
