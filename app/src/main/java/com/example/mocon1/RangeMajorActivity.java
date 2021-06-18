package com.example.mocon1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RangeMajorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_range_major);
    }

    public void clickbtnmajor2(View view){
        Intent intent = new Intent(this,RangeSubjectActivity.class);
        startActivity(intent);

        finish();
    }

    public void clickbtnc(View view){
        Intent intent = new Intent(this, QbankMajorCActivity.class);
        startActivity(intent);

        finish();
    }

    public void clickbtnjava(View view){
        Intent intent = new Intent(this, QbankMajorJavaActivity.class);
        startActivity(intent);

        finish();
    }

    public void clickbtnpython(View view){
        Intent intent = new Intent(this, QbankMajorPythonActivity.class);
        startActivity(intent);

        finish();
    }
}