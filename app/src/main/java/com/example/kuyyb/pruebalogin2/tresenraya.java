package com.example.kuyyb.pruebalogin2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Fredi on 07/06/2016.
 */
public class tresenraya extends View implements GestureDetector.OnGestureListener{
    private Paint pCuadricula, pCirculo, pCruz;
    private char [] estado;
    private char jugando;
    TextView ganador;
    private int acabado=0;

    private GestureDetector gd;

    public tresenraya(Context context) {this(context, null, 0);
    }

    public tresenraya(Context context, AttributeSet attrs) {this(context, attrs, 0);
    }

    public tresenraya(Context context, AttributeSet attrs, int defStyleAttr) {

        super(context, attrs, defStyleAttr);
        gd = new GestureDetector(context,this);
        pCuadricula = new Paint();
        pCuadricula.setColor(Color.LTGRAY);
        pCuadricula.setStyle(Paint.Style.STROKE);
        pCuadricula.setStrokeWidth(10);
        pCirculo=new Paint(pCuadricula);
        pCirculo.setColor(Color.BLUE);
        pCirculo.setStrokeWidth(10);
        pCruz=new Paint(pCirculo);
        pCruz.setColor(Color.GREEN);
        iniciarPartida();
    }

    public void iniciarPartida(){
        jugando = 'X';
        estado = "         ".toCharArray();
        this.invalidate();

    }

    @Override
    public void onMeasure(int specw, int spech){
        int w = MeasureSpec.getSize(specw);
        int h = MeasureSpec.getSize(spech);

        if(w < h) h =w;
        else w=h;

        //   w = h = (w < h) ? w: h;

        setMeasuredDimension(w, h);

    }

    @Override
    public void onDraw(Canvas canvas){

        // canvas.drawColor(Color.RED);
        int w = getWidth();
        int cw = (w - 10) / 3;
        canvas.drawLine(5,5+cw,w-5,5+cw,pCuadricula);
        canvas.drawLine(5,5+cw+5+cw,w-5,5+cw+cw+5,pCuadricula);
        canvas.drawLine(5+cw,5,5+cw,w-5,pCuadricula);
        canvas.drawLine(5 + cw + cw, 5, 5 + cw + cw, w - 5, pCuadricula);
        for(int j=0;j<3;j++){
            for(int i=0;i<3;i++){
                char simbolo = estado[j*3+i];
                if(simbolo == ' ') continue;
                float x1 = 5 + i * cw +cw * 0.1F;
                float y1 = 5 + j * cw + cw *0.1F;
                float x2 = x1 + cw - cw * 0.2F;
                float y2 = y1 +cw - cw * 0.2F;
                if(simbolo == 'X'){
                    canvas.drawLine(x1,y1,x2,y2,pCruz);
                    canvas.drawLine(x1,y2,x2,y1,pCruz);
                }
                else{
                    float cx = 5 + i *cw + cw /2 ;
                    float cy = 5 + j * cw + cw /2 ;
                    float r = cw /2 - cw * 0.10F;
                    canvas.drawCircle(cx,cy,r,pCirculo);
                }



            }

        }

    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        return  gd.onTouchEvent(e);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        int w = getWidth();
        int cw = ( w - 10) / 3;
        int i = (int)Math.floor((e.getX() - 5) / cw );
        int j = ((int)e.getY() -5) / cw;
        if (i < 0) return false;
        if (i > 2) return false;
        if (j < 0) return false;
        if (j > 2) return false;
        Log.d("flx", "celda i=" + i + ", j=" + j);
        int index = j * 3 + i;
        if(estado[index] != ' ') return false;
        estado[index] = jugando;
        if(
                ((estado[0] != ' ') && (estado[0] == estado[1]) && (estado[1] == estado[2])) ||
                        ((estado[3] != ' ') && (estado[3] == estado[4])&& (estado[4] == estado[5])) ||
                        ((estado[6] != ' ') && (estado[6] == estado[7])&& (estado[7] == estado[8])) ||
                        ((estado[0] != ' ') && (estado[0] == estado[3])&& (estado[3] == estado[6])) ||
                        ((estado[1] != ' ') && (estado[1] == estado[4])&& (estado[4] == estado[7])) ||
                        ((estado[2] != ' ') && (estado[2] == estado[5])&& (estado[5] == estado[8])) ||
                        ((estado[0] != ' ') && (estado[0] == estado[4])&& (estado[4] == estado[8])) ||
                        ((estado[2] != ' ') && (estado[2] == estado[4])&& (estado[4] == estado[6]))) {
                        Log.d("flx", "HA GANADO"+jugando);
        }
        jugando = (jugando == 'X') ? 'O' : 'X';
        this.invalidate();
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }


}
