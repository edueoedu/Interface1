package com.example.interface1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int quantidade = 0;
    double total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    View.OnClickListener teste()

    public void adiciona(View view){
        quantidade++;
        TextView quant = findViewById(R.id.quant);
        quant.setText("" + quantidade);

    }

    public void retira(View view){
        quantidade--;
        TextView tira = findViewById(R.id.quant);
        tira.setText("" + quantidade);

    }

    public void tot(View view){
        total = quantidade * 3;
        TextView tot = findViewById(R.id.total);
        tot.setText("" + total);

    }



}
