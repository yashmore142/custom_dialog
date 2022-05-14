package com.example.custom_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnfilter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        btnfilter=findViewById(R.id.btnfilter);
        btnfilter.setOnClickListener(new btnfilterClickListener());
    }
    class btnfilterClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"filter is clicked",Toast.LENGTH_LONG);

            Dialog pricerange=new Dialog(MainActivity.this);
            pricerange.setContentView(R.layout.price_range);

            pricerange.show();


        }
    }
}