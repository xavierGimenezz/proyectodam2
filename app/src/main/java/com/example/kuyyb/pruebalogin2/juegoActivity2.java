package com.example.kuyyb.pruebalogin2;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by kuyyb on 09/06/2016.
 */
public class juegoActivity2 extends Activity {
    Random rand = new Random();
    int dado = 0;
    TextView textView, textView5;
    int positionsave = 0;
    int dado2=0;
    int positionsave2=0;
    int positiondado2=0;
    int turno=1;
    int position2=0;
    int points=0;
    int points2=0;
    int game=1;
    CheckBox checkBox;
    ImageButton dadu,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37;
    Button dados;
    MediaPlayer player;
    int position=0;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablero);
        player = MediaPlayer.create(juegoActivity2.this, R.raw.cytus);
        player.setLooping(true);
        player.start();
        dados=(Button)findViewById(R.id.dados);

        checkBox=(CheckBox)findViewById(R.id.checkBox);
        //= MediaPlayer.create(this, R.raw.cytus);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkBox .isChecked()){
                    // mediaplayer is already muted, so needs be to unmuted
                    player.pause();
                }else{
                    // mute media player
                    player.start();
                }
            }
        });
        dados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position < 37) {
                    dado = rand.nextInt(6);
                    dado++;
                    dado2 = rand.nextInt(6);
                    dado2++;
                    positionsave = position;
                    turno++;
                    positionsave2 = positiondado2;
                    turno--;

                    position = position + dado;
                    positiondado2 = positiondado2 + dado2;

                    if(position>=36){
                        position=36;
                    }
                    if(positiondado2>=36){
                        positiondado2=36;
                    }
                    if (position == positiondado2) {
                        position--;
                    }

                    if (positionsave == 31 && dado > 5) {
                        position = positionsave;
                    }
                    if (positionsave == 32 && dado > 4) {
                        position = positionsave;
                    }
                    if (positionsave == 33 && dado > 3) {
                        position = positionsave;
                    }
                    if (positionsave == 34 && dado > 2) {
                        position = positionsave;
                    }
                    if (positionsave == 35 && dado > 1) {
                        position = positionsave;
                    }
                    if (position > 36) {
                        position = positionsave;
                    }
                    if (positionsave2 == 31 && dado2 > 5) {
                        positiondado2 = positionsave2;
                    }
                    if (positionsave2 == 32 && dado2 > 4) {
                        positiondado2 = positionsave2;
                    }
                    if (positionsave2 == 33 && dado2 > 3) {
                        positiondado2 = positionsave2;
                    }
                    if (positionsave2 == 34 && dado2 > 2) {
                        positiondado2 = positionsave2;
                    }
                    if (positionsave2 == 35 && dado2 > 1) {
                        positiondado2 = positionsave2;
                    }
                    if (position > 36) {
                        position = positionsave;
                    }
                    if (position2 > 36) {
                        positiondado2 = positionsave2;
                    }

                    dadu = (ImageButton) findViewById(R.id.dadu);
                    c1 = (ImageButton) findViewById(R.id.c1);
                    c2 = (ImageButton) findViewById(R.id.c2);
                    c3 = (ImageButton) findViewById(R.id.c3);
                    c4 = (ImageButton) findViewById(R.id.c4);
                    c5 = (ImageButton) findViewById(R.id.c5);
                    c6 = (ImageButton) findViewById(R.id.c6);
                    c7 = (ImageButton) findViewById(R.id.c7);
                    c8 = (ImageButton) findViewById(R.id.c8);
                    c9 = (ImageButton) findViewById(R.id.c9);
                    c10 = (ImageButton) findViewById(R.id.c10);
                    c11 = (ImageButton) findViewById(R.id.c11);
                    c12 = (ImageButton) findViewById(R.id.c12);
                    c13 = (ImageButton) findViewById(R.id.c13);
                    c14 = (ImageButton) findViewById(R.id.c14);
                    c15 = (ImageButton) findViewById(R.id.c15);
                    c16 = (ImageButton) findViewById(R.id.c16);
                    c17 = (ImageButton) findViewById(R.id.c17);
                    c18 = (ImageButton) findViewById(R.id.c18);
                    c19 = (ImageButton) findViewById(R.id.c19);
                    c20 = (ImageButton) findViewById(R.id.c20);
                    c21 = (ImageButton) findViewById(R.id.c21);
                    c22 = (ImageButton) findViewById(R.id.c22);
                    c23 = (ImageButton) findViewById(R.id.c23);
                    c25 = (ImageButton) findViewById(R.id.c25);
                    c26 = (ImageButton) findViewById(R.id.c26);
                    c27 = (ImageButton) findViewById(R.id.c27);
                    c28 = (ImageButton) findViewById(R.id.c28);
                    c29 = (ImageButton) findViewById(R.id.c29);
                    c30 = (ImageButton) findViewById(R.id.c30);
                    c31 = (ImageButton) findViewById(R.id.c31);
                    c32 = (ImageButton) findViewById(R.id.c32);
                    c33 = (ImageButton) findViewById(R.id.c33);
                    c34 = (ImageButton) findViewById(R.id.c34);
                    c35 = (ImageButton) findViewById(R.id.c35);
                    c36 = (ImageButton) findViewById(R.id.c36);
                    c37 = (ImageButton) findViewById(R.id.c37);
                    if (dado == 1) {
                        dadu.setImageResource(R.drawable.dado1);
                    }
                    if (dado == 2) {
                        dadu.setImageResource(R.drawable.dado2);
                    }
                    if (dado == 3) {
                        dadu.setImageResource(R.drawable.dado3);
                    }
                    if (dado == 4) {
                        dadu.setImageResource(R.drawable.dado4);
                    }
                    if (dado == 5) {
                        dadu.setImageResource(R.drawable.dado5);
                    }
                    if (dado == 6) {
                        dadu.setImageResource(R.drawable.dado6);
                    }
                    if (position == 1) {
                        c1.setImageResource(R.drawable.ficha1);
                    } else if(positiondado2==1) {
                        c1.setImageResource(R.drawable.ficha2);
                    } else {
                        c1.setImageResource(R.drawable.casilla1);
                    }
                    if (position == 2) {
                        c2.setImageResource(R.drawable.ficha1);
                        points = points + 20;
                    } else if(positiondado2==2) {
                        c2.setImageResource(R.drawable.ficha2);
                    } else {
                        c2.setImageResource(R.drawable.casilla2);
                    }
                    if (position == 3) {
                        c3.setImageResource(R.drawable.ficha1);
                    } else if(positiondado2==3) {
                        c3.setImageResource(R.drawable.ficha2);
                    } else {
                        c3.setImageResource(R.drawable.casilla3);
                        points = points + 20;
                    }
                    if (position == 4) {
                        c4.setImageResource(R.drawable.ficha1);
                        points = points - 30;
                    } else if(positiondado2==4) {
                        c4.setImageResource(R.drawable.ficha2);
                    } else {
                        c4.setImageResource(R.drawable.casilla4);
                    }
                    if (position == 5) {
                        c5.setImageResource(R.drawable.ficha1);
                        points = points + 20;
                    } else if(positiondado2==5) {
                        c5.setImageResource(R.drawable.ficha2);
                    } else {
                        c5.setImageResource(R.drawable.casilla5);
                    }
                    if (position == 6) {
                        c6.setImageResource(R.drawable.ficha1);
                        position--;
                        points2=points2-50;
                    } else if(positiondado2==6) {
                        c6.setImageResource(R.drawable.ficha2);
                    } else {
                        c6.setImageResource(R.drawable.casilla6);
                    }
                    if (position == 7) {
                        c7.setImageResource(R.drawable.ficha1);
                        points = points - 30;
                    } else if(positiondado2==7) {
                        c7.setImageResource(R.drawable.ficha2);
                    } else {
                        c7.setImageResource(R.drawable.casilla7);
                    }
                    if (position == 8) {
                        c8.setImageResource(R.drawable.ficha1);
                        points = points + 20;
                    } else if(positiondado2==8) {
                        c8.setImageResource(R.drawable.ficha2);
                    } else {
                        c8.setImageResource(R.drawable.casilla8);
                    }
                    if (position == 9) {
                        c9.setImageResource(R.drawable.ficha1);
                        points = points + 20;
                    } else if(positiondado2==9) {
                        c9.setImageResource(R.drawable.ficha2);
                    } else {
                        c9.setImageResource(R.drawable.casilla9);
                    }
                    if (position == 10) {
                        c10.setImageResource(R.drawable.ficha1);
                        points = points - 30;
                    } else if(positiondado2==10) {
                        c10.setImageResource(R.drawable.ficha2);
                    } else {
                        c10.setImageResource(R.drawable.casilla10);
                    }
                    if (position == 11) {
                        c11.setImageResource(R.drawable.ficha1);
                        position--;
                        points2=points2-50;
                    } else if(positiondado2==11) {
                        c11.setImageResource(R.drawable.ficha2);
                    } else {
                        c11.setImageResource(R.drawable.casilla11);
                    }
                    if (position == 12) {
                        c12.setImageResource(R.drawable.ficha1);
                        points = points - 30;
                    } else if(positiondado2==12) {
                        c12.setImageResource(R.drawable.ficha2);
                    } else {
                        c12.setImageResource(R.drawable.casilla12);
                    }
                    if (position == 13) {
                        c13.setImageResource(R.drawable.ficha1);
                    } else if(positiondado2==13) {
                        c13.setImageResource(R.drawable.ficha2);
                    } else {
                        points = points + 20;
                        c13.setImageResource(R.drawable.casilla13);
                    }
                    if (position == 14) {
                        c14.setImageResource(R.drawable.ficha1);
                        points = points - 30;
                    } else if(positiondado2==14) {
                        c14.setImageResource(R.drawable.ficha2);
                    } else {
                        c14.setImageResource(R.drawable.casilla14);
                    }
                    if (position == 15) {
                        c15.setImageResource(R.drawable.ficha1);
                        points = points + 20;
                    } else if(positiondado2==15) {
                        c15.setImageResource(R.drawable.ficha2);
                    } else {
                        c15.setImageResource(R.drawable.casilla15);
                    }
                    if (position == 16) {
                        c16.setImageResource(R.drawable.ficha1);
                        position--;
                        points2=points2-50;
                    } else if(positiondado2==16) {
                        c16.setImageResource(R.drawable.ficha2);
                    } else {
                        c16.setImageResource(R.drawable.casilla16);
                    }
                    if (position == 17) {
                        c17.setImageResource(R.drawable.ficha1);
                        points = points + 20;
                    } else if(positiondado2==17) {
                        c17.setImageResource(R.drawable.ficha2);
                    } else {
                        c17.setImageResource(R.drawable.casilla17);
                    }
                    if (position == 18) {
                        c18.setImageResource(R.drawable.ficha1);
                        points = points + 20;
                    } else if(positiondado2==18) {
                        c18.setImageResource(R.drawable.ficha2);
                    } else {
                        c18.setImageResource(R.drawable.casilla18);
                    }
                    if (position == 19) {
                        c19.setImageResource(R.drawable.ficha1);
                        points = points - 30;
                    } else if(positiondado2==19) {
                        c19.setImageResource(R.drawable.ficha2);
                    } else {
                        c19.setImageResource(R.drawable.casilla19);
                    }
                    if (position == 20) {
                        c20.setImageResource(R.drawable.ficha1);

                        position--;
                        points2=points2-50;
                    } else if(positiondado2==20) {
                        c21.setImageResource(R.drawable.ficha2);
                    } else {
                        c20.setImageResource(R.drawable.casilla20);
                    }
                    if (position == 21) {
                        c21.setImageResource(R.drawable.ficha1);
                        points = points - 30;
                    } else if(positiondado2==21) {
                        c21.setImageResource(R.drawable.ficha2);
                    } else {
                        c21.setImageResource(R.drawable.casilla21);
                    }
                    if (position == 22) {
                        c22.setImageResource(R.drawable.ficha1);
                        points = points - 30;
                    } else if(positiondado2==22) {
                        c22.setImageResource(R.drawable.ficha2);
                    } else {
                        c22.setImageResource(R.drawable.casilla22);
                    }
                    if (position == 23) {
                        c23.setImageResource(R.drawable.ficha1);
                        points = points + 20;
                    } else if(positiondado2==23) {
                        c23.setImageResource(R.drawable.ficha2);
                    } else {
                        c23.setImageResource(R.drawable.casilla23);
                    }
                    if (position == 24) {
                        c25.setImageResource(R.drawable.ficha1);
                        position--;
                        points2=points2-50;
                    } else if(positiondado2==24) {
                        c25.setImageResource(R.drawable.ficha2);
                    } else {
                        c25.setImageResource(R.drawable.casilla24);
                    }
                    if (position == 25) {
                        c26.setImageResource(R.drawable.ficha1);
                        points = points + 20;
                    } else if(positiondado2==25) {
                        c26.setImageResource(R.drawable.ficha2);
                    } else {
                        c26.setImageResource(R.drawable.casilla25);
                    }
                    if (position == 26) {
                        c27.setImageResource(R.drawable.ficha1);
                        points = points + 20;
                    } else if(positiondado2==26) {
                        c27.setImageResource(R.drawable.ficha2);
                    } else {
                        c27.setImageResource(R.drawable.casilla26);
                    }
                    if (position == 27) {
                        c28.setImageResource(R.drawable.ficha1);
                        points = points + 20;
                    } else if(positiondado2==27) {
                        c28.setImageResource(R.drawable.ficha2);
                    } else {
                        c28.setImageResource(R.drawable.casilla27);
                    }
                    if (position == 28) {
                        c29.setImageResource(R.drawable.ficha1);
                        points = points - 30;
                    } else if(positiondado2==28) {
                        c29.setImageResource(R.drawable.ficha2);
                    } else {
                        c29.setImageResource(R.drawable.casilla28);
                    }
                    if (position == 29) {
                        c30.setImageResource(R.drawable.ficha1);
                        position--;
                        points2=points2-50;
                    } else if(positiondado2==29) {
                        c30.setImageResource(R.drawable.ficha2);
                    } else {
                        c30.setImageResource(R.drawable.casilla29);
                    }
                    if (position == 30) {
                        c31.setImageResource(R.drawable.ficha1);
                        points = points + 20;
                    } else if(positiondado2==30) {
                        c31.setImageResource(R.drawable.ficha2);
                    } else {
                        c31.setImageResource(R.drawable.casilla30);
                    }
                    if (position == 31) {
                        c32.setImageResource(R.drawable.ficha1);
                        points = points - 30;
                    } else if(positiondado2==31) {
                        c32.setImageResource(R.drawable.ficha2);
                    } else {
                        c32.setImageResource(R.drawable.casilla31);
                    }
                    if (position == 32) {
                        c33.setImageResource(R.drawable.ficha1);
                        points = points + 20;
                    } else if(positiondado2==32) {
                        c33.setImageResource(R.drawable.ficha2);
                    } else {
                        c33.setImageResource(R.drawable.casilla32);
                    }
                    if (position == 33) {
                        c34.setImageResource(R.drawable.ficha1);
                        position--;
                        points2=points2-50;
                        points = points + 100;} else if(positiondado2==33) {
                        c34.setImageResource(R.drawable.ficha2);
                    } else {
                        c34.setImageResource(R.drawable.casilla33);
                    }
                    if (position == 34) {
                        c35.setImageResource(R.drawable.ficha1);
                        points = points - 30;
                    } else if(positiondado2==34) {
                        c35.setImageResource(R.drawable.ficha2);
                    } else {
                        c35.setImageResource(R.drawable.casilla34);
                    }
                    if (position == 35) {
                        c36.setImageResource(R.drawable.ficha1);
                        points = points - 30;
                    } else if(positiondado2==35) {
                        c36.setImageResource(R.drawable.ficha2);
                    } else if(positiondado2==35) {
                    }else{
                        c36.setImageResource(R.drawable.casilla35);
                    }
                    if (position == 36) {
                        c37.setImageResource(R.drawable.ficha1);
                        points=points+100;
                        Intent intent = new Intent(getApplicationContext(), rojoActivity.class);
                        intent.putExtra("int_value", points2);
                        intent.putExtra("int_value1", points);
                        intent.putExtra("game", game);
                        startActivity(intent);
                    } else {
                        c37.setImageResource(R.drawable.casilla36
                        );
                    }if (positiondado2 == 1) {
                        c1.setImageResource(R.drawable.ficha2);
                    } else {
                        c1.setImageResource(R.drawable.casilla1);
                    }
                    if (positiondado2 == 2) {
                        c2.setImageResource(R.drawable.ficha2);
                        points2=points2+20;
                    } else if(position==2) {
                        c2.setImageResource(R.drawable.ficha1);
                    } else {
                        c2.setImageResource(R.drawable.casilla2);
                    }
                    if (positiondado2 == 3) {
                        c3.setImageResource(R.drawable.ficha2);
                        points2=points2+20;
                    } else if(position==3) {
                        c3.setImageResource(R.drawable.ficha1);
                    } else {
                        c3.setImageResource(R.drawable.casilla3);

                    }
                    if (positiondado2 == 4) {
                        c4.setImageResource(R.drawable.ficha2);
                        points2=points2-30;
                    } else if(position==4) {
                        c4.setImageResource(R.drawable.ficha1);
                    } else {
                        c4.setImageResource(R.drawable.casilla4);
                    }
                    if (positiondado2 == 5) {
                        c5.setImageResource(R.drawable.ficha2);
                        points2 = points2 + 20;
                    } else if(position==5) {
                        c5.setImageResource(R.drawable.ficha1);
                    } else {
                        c5.setImageResource(R.drawable.casilla5);
                    }
                    if (positiondado2 == 6) {
                        c6.setImageResource(R.drawable.ficha2);
                        positiondado2=5;
                        points=points-50;
                    } else if(position==6) {
                        c6.setImageResource(R.drawable.ficha1);
                    } else {
                        c6.setImageResource(R.drawable.casilla6);
                    }
                    if (positiondado2 == 7) {
                        c7.setImageResource(R.drawable.ficha2);
                        points2=points2-30;
                    } else if(position==7) {
                        c7.setImageResource(R.drawable.ficha1);
                    } else {
                        c7.setImageResource(R.drawable.casilla7);
                    }
                    if (positiondado2 == 8) {
                        c8.setImageResource(R.drawable.ficha2);
                        points2=points2+20;
                    } else if(position==8) {
                        c8.setImageResource(R.drawable.ficha1);
                    } else {
                        c8.setImageResource(R.drawable.casilla8);
                    }
                    if (positiondado2 == 9) {
                        c9.setImageResource(R.drawable.ficha2);
                        points2=points2+20;
                    } else if(position==9) {
                        c9.setImageResource(R.drawable.ficha1);
                    } else {
                        c9.setImageResource(R.drawable.casilla9);
                    }
                    if (positiondado2 == 10) {
                        c10.setImageResource(R.drawable.ficha2);
                        points2=points2-30;
                    } else if(position==10) {
                        c10.setImageResource(R.drawable.ficha1);
                    } else {
                        c10.setImageResource(R.drawable.casilla10);
                    }
                    if (positiondado2 == 11) {
                        c11.setImageResource(R.drawable.ficha2);
                        positiondado2--;
                        points=points-50;
                    } else if(position==11) {
                        c11.setImageResource(R.drawable.ficha1);
                    } else {
                        c11.setImageResource(R.drawable.casilla11);
                    }
                    if (positiondado2 == 12) {
                        c12.setImageResource(R.drawable.ficha2);
                        points2=points2-30;
                    } else if(position==12) {
                        c12.setImageResource(R.drawable.ficha1);

                    } else {
                        c12.setImageResource(R.drawable.casilla12);
                    }
                    if (positiondado2 == 13) {
                        c13.setImageResource(R.drawable.ficha2);
                        points2=points2+20;
                    } else if(position==13) {
                        c13.setImageResource(R.drawable.ficha1);
                    } else {

                        c13.setImageResource(R.drawable.casilla13);
                    }
                    if (positiondado2 == 14) {
                        c14.setImageResource(R.drawable.ficha2);
                        points2=points2-30;
                    } else if(position==14) {
                        c14.setImageResource(R.drawable.ficha1);
                    } else {
                        c14.setImageResource(R.drawable.casilla14);
                    }
                    if (positiondado2 == 15) {
                        c15.setImageResource(R.drawable.ficha2);
                        points2=points2+20;
                    } else if(position==15) {
                        c15.setImageResource(R.drawable.ficha1);
                    } else {
                        c15.setImageResource(R.drawable.casilla15);
                    }
                    if (positiondado2 == 16) {
                        c16.setImageResource(R.drawable.ficha2);
                        positiondado2--;
                        points=points-50;
                    } else if(position==16) {
                        c16.setImageResource(R.drawable.ficha1);
                    } else {
                        c16.setImageResource(R.drawable.casilla16);
                    }
                    if (positiondado2 == 17) {
                        c17.setImageResource(R.drawable.ficha2);
                        points2=points2+20;
                    } else if(position==17) {
                        c17.setImageResource(R.drawable.ficha1);
                    } else {
                        c17.setImageResource(R.drawable.casilla17);
                    }
                    if (positiondado2 == 18) {
                        c18.setImageResource(R.drawable.ficha2);
                        points2=points2+20;
                    } else if(position==18) {
                        c18.setImageResource(R.drawable.ficha1);
                    } else {
                        c18.setImageResource(R.drawable.casilla18);
                    }
                    if (positiondado2 == 19) {
                        c19.setImageResource(R.drawable.ficha2);
                        points2=points2-30;
                    } else if(position==19) {
                        c19.setImageResource(R.drawable.ficha1);

                    } else {
                        c19.setImageResource(R.drawable.casilla19);
                    }
                    if (positiondado2 == 20) {
                        c20.setImageResource(R.drawable.ficha2);
                        positiondado2--;
                        points=points-50;
                    } else if(position==20) {
                        c20.setImageResource(R.drawable.ficha1);
                    } else {
                        c20.setImageResource(R.drawable.casilla20);
                    }
                    if (positiondado2 == 21) {
                        c21.setImageResource(R.drawable.ficha2);
                        points2=points2-30;
                    } else if(position==21) {
                        c21.setImageResource(R.drawable.ficha1);
                    } else {
                        c21.setImageResource(R.drawable.casilla21);
                    }
                    if (positiondado2 == 22) {
                        c22.setImageResource(R.drawable.ficha2);
                        points2=points2-30;
                    } else if(position==22) {
                        c22.setImageResource(R.drawable.ficha1);
                    } else {
                        c22.setImageResource(R.drawable.casilla22);
                    }
                    if (positiondado2 == 23) {
                        c23.setImageResource(R.drawable.ficha2);
                        points2=points2+20;
                    } else if(position==23) {
                        c23.setImageResource(R.drawable.ficha1);
                    } else {
                        c23.setImageResource(R.drawable.casilla23);
                    }
                    if (positiondado2 == 24) {
                        c25.setImageResource(R.drawable.ficha2);
                        positiondado2--;
                        points=points-50;
                    } else if(position==24) {
                        c25.setImageResource(R.drawable.ficha1);
                    } else {
                        c25.setImageResource(R.drawable.casilla24);
                    }
                    if (positiondado2 == 25) {
                        c26.setImageResource(R.drawable.ficha2);
                        points2=points2+20;
                    } else if(position==25) {
                        c26.setImageResource(R.drawable.ficha1);
                    } else {
                        c26.setImageResource(R.drawable.casilla25);
                    }
                    if (positiondado2 == 26) {
                        c27.setImageResource(R.drawable.ficha2);
                        points2=points2+20;
                    } else if(position==26) {
                        c27.setImageResource(R.drawable.ficha1);
                    } else {
                        c27.setImageResource(R.drawable.casilla26);
                    }
                    if (positiondado2 == 27) {
                        c28.setImageResource(R.drawable.ficha2);
                        points2=points2+20;
                    } else if(position==27) {
                        c28.setImageResource(R.drawable.ficha1);
                    } else {
                        c28.setImageResource(R.drawable.casilla27);
                    }
                    if (positiondado2 == 28) {
                        c29.setImageResource(R.drawable.ficha2);
                        points2=points2-30;
                    } else if(position==28) {
                        c29.setImageResource(R.drawable.ficha1);
                    } else {
                        c29.setImageResource(R.drawable.casilla28);
                    }
                    if (positiondado2 == 29) {
                        c30.setImageResource(R.drawable.ficha2);
                        positiondado2--;
                        points=points-50;
                    } else if(position==29) {
                        c30.setImageResource(R.drawable.ficha1);
                    } else {
                        c30.setImageResource(R.drawable.casilla29);
                    }
                    if (positiondado2 == 30) {
                        c31.setImageResource(R.drawable.ficha2);
                        points2=points2+20;
                    } else if(position==30) {
                        c31.setImageResource(R.drawable.ficha1);
                    } else {
                        c31.setImageResource(R.drawable.casilla30);
                    }
                    if (positiondado2 == 31) {
                        c32.setImageResource(R.drawable.ficha2);
                        points2 = points2 - 30;
                    } else if(position==31) {
                        c32.setImageResource(R.drawable.ficha1);
                    } else {
                        c32.setImageResource(R.drawable.casilla31);
                    }
                    if (positiondado2 == 32) {
                        c33.setImageResource(R.drawable.ficha2);
                        points2=points2+20;
                    } else if(position==32) {
                        c33.setImageResource(R.drawable.ficha1);
                    } else {
                        c33.setImageResource(R.drawable.casilla32);
                    }
                    if (positiondado2 == 33) {
                        c34.setImageResource(R.drawable.ficha2);
                        positiondado2--;
                        points=points-50;
                    } else if(position==33) {
                        c34.setImageResource(R.drawable.ficha1);
                    } else {
                        c34.setImageResource(R.drawable.casilla33);
                    }
                    if (positiondado2 == 34) {
                        c35.setImageResource(R.drawable.ficha2);
                        points2=points2-30;
                    } else if(position==34) {
                        c35.setImageResource(R.drawable.ficha1);
                    } else {
                        c35.setImageResource(R.drawable.casilla34);
                    }
                    if (positiondado2 == 35) {
                        c36.setImageResource(R.drawable.ficha2);
                        points2=points2-30;
                    } else if(position==35) {
                        c36.setImageResource(R.drawable.ficha1);
                    } else {
                        c36.setImageResource(R.drawable.casilla35);
                    }
                    if (positiondado2 == 36) {
                        c37.setImageResource(R.drawable.ficha2);
                        points2=points2+100;
                        Intent intent = new Intent(getApplicationContext(), rojoActivity.class);
                        intent.putExtra("int_value", points2);
                        intent.putExtra("int_value1", points);
                        intent.putExtra("game", game);
                        startActivity(intent);
                    } else {
                        c37.setImageResource(R.drawable.casilla36
                        );
                    }
                    TextView txt1 = (TextView) findViewById(R.id.textView13);
                    txt1.setText(points+"");
                    TextView txt2 = (TextView) findViewById(R.id.textView15);
                    txt2.setText(points2+"");
                } else {
                    TextView txt = (TextView) findViewById(R.id.textView);
                    txt.setText("Has ganado");
                }
            }
        });


    }

    @Override
    protected void onPause(){

        super.onPause();

        player.stop();
    }
    @Override
    protected void onResume(){
        super.onResume();
        player.start();
    }
}