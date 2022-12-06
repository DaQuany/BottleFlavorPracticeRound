package com.example.practiceround;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        val statusText:TextView = findviewById(R.id.staus_text)
        val seekBar:SeekBar = findviewById(R.id.seekBar)

        SeekBar.SetOnseekBarchangeListener(object:SeekBar.OnSeekBarChangeListener {
            override fun onprogressChanged(seekBar: SeekBar?, progress:Int, fromUser:Boolean){
                statusText.text ="${progress}%"
            }

            override fun onStartTrackingTouch(p0:SeekBar ?){}

            override fun onStopTrackingTouch(p0:SeekBar ?){}
        })
    }
}



