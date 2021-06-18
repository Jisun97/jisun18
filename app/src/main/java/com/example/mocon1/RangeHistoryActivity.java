package com.example.mocon1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RangeHistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_range_history);
    }

    public void clickbtnhistory2(View view){
        Intent intent = new Intent(this,RangeSubjectActivity.class);
        startActivity(intent);

        finish();
    }


    public void clickbtnhistroya(View view){
        Intent intent = new Intent(this, QbankHistoryAActivity.class);
        startActivity(intent);

        finish();
    }

    public void clickbtnhistroyb(View view){
        Intent intent = new Intent(this, QbankHistoryBActivity.class);
        startActivity(intent);

        finish();
    }

    public void clickbtnhistroyc(View view){
        Intent intent = new Intent(this, QbankHistoryCActivity.class);
        startActivity(intent);

        finish();
    }

    public void clickbtnhistroyd(View view){
        Intent intent = new Intent(this, QbankHistoryDActivity.class);
        startActivity(intent);

        finish();
    }

}