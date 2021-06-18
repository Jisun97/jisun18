package com.example.mocon1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class QbankEquActivity extends AppCompatActivity {
    RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qbank_equ);
    }

    public void clickbtnfinish(View view){
        radioButton = findViewById(R.id.right);

        if(radioButton.isChecked()){
            Intent intent = new Intent(this,QbankTrueExActivity.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(this,QbankFalseExActivity.class);
            startActivity(intent);
        }

        finish();
    }

}