package com.example.mocon1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RangeSubjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_range_subject);
    }

    public void clickbtnmath(View view){
        Intent intent = new Intent(this,RangeMathActivity.class);
        startActivity(intent);

        finish();
    }

    public void clickbtnword(View view){
        Intent intent = new Intent(this,RangeWordActivity.class);
        startActivity(intent);

        finish();
    }

    public void clickbtnhistory(View view){
        Intent intent = new Intent(this,RangeHistoryActivity.class);
        startActivity(intent);

        finish();
    }

    public void clickbtnmajor(View view){
        Intent intent = new Intent(this,RangeMajorActivity.class);
        startActivity(intent);

        finish();
    }
}