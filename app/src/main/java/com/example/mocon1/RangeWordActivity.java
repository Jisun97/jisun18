package com.example.mocon1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RangeWordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_range_word);
    }

    public void clickbtnword2(View view){
        Intent intent = new Intent(this,RangeSubjectActivity.class);
        startActivity(intent);

        finish();
    }
}