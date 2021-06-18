package com.example.mocon1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QbankFalseExActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qbank_false_ex);
    }

    public void clickbtnhome(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

        finish();
    }

}