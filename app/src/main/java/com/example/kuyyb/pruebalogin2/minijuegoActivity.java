package com.example.kuyyb.pruebalogin2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by kuyyb on 08/06/2016.
 */
public class minijuegoActivity extends Activity {
    int juego=0;
    int points;
    Button button4;
     public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
         setContentView(R.layout.tresenraya);
         button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){

             @Override
             public void onClick(View v) {
                 Intent openMainActivity= new Intent(minijuegoActivity.this, juegoActivity.class);
                 openMainActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                 startActivity(openMainActivity);
             }
         });
         if(juego==1){

         }
    }
}
