package com.example.mocon1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RangeMathActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_range_math);
    }

    public void clickbtnmath2(View view){
        Intent intent = new Intent(this,RangeSubjectActivity.class);
        startActivity(intent);

        finish();
    }

    public void clickbtnjisu(View view){
        Intent intent = new Intent(this, QbankJisuActivity.class);
        startActivity(intent);

        finish();
    }

    public void clickbtnlog(View view){
        Intent intent = new Intent(this, QbankLogActivity.class);
        startActivity(intent);

        finish();
    }

    public void clickbtnsam(View view){
        Intent intent = new Intent(this, QbankSamActivity.class);
        startActivity(intent);

        finish();
    }

    public void clickbtnequ(View view){
        Intent intent = new Intent(this, QbankEquActivity.class);
        startActivity(intent);

        finish();
    }

    public void clickbtnsigma(View view){
        Intent intent = new Intent(this, QbankSigmaActivity.class);
        startActivity(intent);

        finish();
    }




}