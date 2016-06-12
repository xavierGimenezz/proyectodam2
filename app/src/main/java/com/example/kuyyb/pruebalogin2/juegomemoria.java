package com.example.kuyyb.pruebalogin2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Fredi on 08/06/2016.
 */
public class juegomemoria extends Activity implements Runnable {

    private ImageButton ib1;
    private ImageButton ib2;
    private ImageButton ib3;
    private ImageButton ib4;
    private ImageButton ib5;
    private ImageButton ib6;
    private ImageButton ib7;
    private ImageButton ib8;
    private ImageButton ib9;
    private ImageButton ib10;
    private ImageButton ib11;
    private ImageButton ib12;
    private ImageButton ib13;
    private ImageButton ib14;
    private ImageButton ib15;
    private ImageButton ib16;
    public Button button6;

    private int []valores={1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8};
    private ImageButton imgBotones[];
    private int valorSeleccionado=-1;
    private int valorBorrar=0; //es para grabar que valor tiene que girar de nuevo cunado se equivoque

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciarCartas();
        imgBotones=new ImageButton[]{ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9,ib10,ib11,ib12}; //arrglo de todos las cartas para poder utilizar
        desordenarCartas();
        agregarEventosCartas();
        /*button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent siguiente3 = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(siguiente3);
            }
        });*/
    }

    private Handler puente = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            Bitmap bpm = BitmapFactory.decodeResource(getResources(), R.drawable.carta0);
            imgBotones[valorSeleccionado].setImageBitmap(bpm);
            valorSeleccionado = -1;
            imgBotones[valorBorrar].setImageBitmap(bpm);
        }
    };

    private void desordenarCartas()
    {
        Random rnd=new Random();
        int aux;
        int indiceAux;

        for(int i=0;i<valores.length;i++)
        {
            aux=valores[i]; //respaldo el valor del indice
            indiceAux=rnd.nextInt(8); //nuevo indice para cambiar el valor

            valores[i]=valores[indiceAux];
            valores[indiceAux]=aux;

        }

    }

    private void controlador(int opcion,ImageButton img)
    {
        Bitmap bpm=null;
        opcion--;
        switch (valores[opcion])
        {
            case 1: bpm= BitmapFactory.decodeResource(getResources(),R.drawable.carta1);break;//imagenes de las cartas
            case 2: bpm= BitmapFactory.decodeResource(getResources(),R.drawable.carta2);break;
            case 3: bpm= BitmapFactory.decodeResource(getResources(),R.drawable.carta3);break;
            case 4: bpm= BitmapFactory.decodeResource(getResources(),R.drawable.carta4);break;
            case 5: bpm= BitmapFactory.decodeResource(getResources(),R.drawable.carta5);break;
            case 6: bpm= BitmapFactory.decodeResource(getResources(),R.drawable.carta6);break;
            case 7: bpm= BitmapFactory.decodeResource(getResources(),R.drawable.carta7);break;
            case 8: bpm= BitmapFactory.decodeResource(getResources(),R.drawable.carta8);break;
        }

        if(valorSeleccionado==-1) //para verificar que es la primera carta seleccionada
        {
            valorSeleccionado=opcion;
            img.setImageBitmap(bpm); //dibujas la carta
        }
        else
        {
            if(valores[valorSeleccionado]==valores[opcion]) //las dos son iguales
            {
                Toast.makeText(this, "!Bien!",Toast.LENGTH_LONG ).show(); //solo es un mensaje
                img.setImageBitmap(bpm);
                valorSeleccionado=-1; //para indicar que otra vez no hya carta girada
                // Toast.makeText(this, "mensaje", Toast.LENGTH_LONG).show();
            }
            else //son diferente
            {
                valorBorrar=opcion; //el valor que tengo que girar
                img.setImageBitmap(bpm);
                //runOnUiThread(new Runnable()
                Thread hilo=new Thread(this);
                hilo.start(); //
                // Toast.makeText(this,"!Mal!",Toast.LENGTH_SHORT).show();
                //Toast.makeText(this,"!Mal!",100).show();
            }
        }
    }

    private void iniciarCartas()
    {
        //carga todas las vistas a la clase para anejar
        ib1= (ImageButton) findViewById(R.id.carta1);
        ib2= (ImageButton) findViewById(R.id.carta2);
        ib3= (ImageButton) findViewById(R.id.carta3);
        ib4= (ImageButton) findViewById(R.id.carta4);
        ib5= (ImageButton) findViewById(R.id.carta5);
        ib6= (ImageButton) findViewById(R.id.carta6);
        ib7= (ImageButton) findViewById(R.id.carta7);
        ib8= (ImageButton) findViewById(R.id.carta8);
        ib9= (ImageButton) findViewById(R.id.carta9);
        ib10= (ImageButton) findViewById(R.id.carta10);
        ib11= (ImageButton) findViewById(R.id.carta11);
        ib12= (ImageButton) findViewById(R.id.carta12);
        ib13= (ImageButton) findViewById(R.id.carta13);
        ib14= (ImageButton) findViewById(R.id.carta14);
        ib15= (ImageButton) findViewById(R.id.carta15);
        ib16= (ImageButton) findViewById(R.id.carta16);
    }

    private void agregarEventosCartas()
    {
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador(1,ib1);
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador(2, ib2);
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador(3, ib3);
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador(4, ib4);
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador(5, ib5);
            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador(6, ib6);
            }
        });
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador(7, ib7);
            }
        });
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador(8, ib8);
            }
        });
        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador(9, ib9);
            }
        });
        ib10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador(10, ib10);
            }
        });
        ib11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador(11, ib11);
            }
        });
        ib12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador(12, ib12);
            }
        });
        ib13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador(12, ib13);
            }
        });
        ib14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador(12, ib14);
            }
        });
        ib15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador(12, ib15);
            }
        });
        ib16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controlador(12, ib16);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void run() {
        SystemClock.sleep(1000);
        // Bitmap bpm= BitmapFactory.decodeResource(getResources(),R.drawable.carta0);
        // imgBotones[valorSeleccionado].setImageBitmap(bpm);
        //  valorSeleccionado=-1;
        //  imgBotones[valorBorrar].setImageBitmap(bpm);
        Message msg = new Message();
        msg.obj = 16;
        puente.sendMessage(msg);

    }
}

