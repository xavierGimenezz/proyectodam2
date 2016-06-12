package com.example.kuyyb.pruebalogin2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by kuyyb on 10/06/2016.
 */
public class azulActivity extends Activity {
    TextView textView21,textView23;
    Button button3, button5;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.azul);
        Intent intent = getIntent();
        int temp = intent.getIntExtra("int_value", 0);
        TextView txt3 = (TextView) findViewById(R.id.textView23);
        txt3.setText(temp+" puntos");
        int temp2 = intent.getIntExtra("int_value1", 0);
        TextView txt4 = (TextView) findViewById(R.id.textView21);
        txt4.setText(temp2+" puntos");
        final int game = intent.getIntExtra("game", 0);
        button3=(Button)findViewById(R.id.button3);
        button5=(Button)findViewById(R.id.button5);
        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(game==0){
                    Intent siguiente2 = new Intent(getApplicationContext(),juegoActivity.class);
                    startActivity(siguiente2);
                }
                if(game==1){
                    Intent siguiente2 = new Intent(getApplicationContext(),juegoActivity2.class);
                    startActivity(siguiente2);
                }
            }
        });
        button3=(Button)findViewById(R.id.button3);
        button5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent menu = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(menu);
            }
        });

    }
}