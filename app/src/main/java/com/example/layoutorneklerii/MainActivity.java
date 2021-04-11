package com.example.layoutorneklerii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.function.DoubleUnaryOperator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.butonornek);
    }


    public void Calistir(View v) {
        Log.d("Bilgi", "Butona Basıldı ");
    }

    public void Calistir2(View v) {
        Log.d("Bilgi", "Calistir2: buotuna basıldı ");
    }

    public void Topla(View a) {

        EditText edt1 = (EditText) findViewById(R.id.edt1);
        EditText edt2 = (EditText) findViewById(R.id.edt2);
        TextView txt1 = (TextView) findViewById(R.id.txtview1);
        int sayi1 = Integer.valueOf(edt1.getText().toString());
        int sayi2 = Integer.valueOf(edt2.getText().toString());
        txt1.setText(String.valueOf(sayi1+sayi2));

    }

}