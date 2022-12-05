package com.cookandroid.scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

public class MainActivity extends AppCompatActivity {
    ScrollView scroll_contents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scroll_contents=findViewById(R.id.scrollContents);
        ChipGroup Chip_Group=(ChipGroup) findViewById(R.id.chipGroup);

        Chip chip=new Chip(this);

        Chip chip1=(Chip)findViewById(R.id.comming);
        Chip chip2=(Chip)findViewById(R.id.popular);
        Chip chip3=(Chip)findViewById(R.id.series);
        Chip chip4=(Chip)findViewById(R.id.movie);

        //버튼 클릭시 최상단 이동
        chip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scroll_contents.fullScroll(ScrollView.FOCUS_UP);
            }
        });
        chip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scroll_contents.fullScroll(ScrollView.FOCUS_UP);
            }
        });
        chip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scroll_contents.fullScroll(ScrollView.FOCUS_UP);
            }
        });
        chip4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scroll_contents.fullScroll(ScrollView.FOCUS_UP);
            }
        });
    }
}