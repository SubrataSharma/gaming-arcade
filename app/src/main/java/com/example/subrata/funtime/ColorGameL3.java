package com.example.subrata.funtime;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ColorGameL3 extends AppCompatActivity {
    TextView count,score,color;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    ImageView start;
    Random r;
    Vibrator vibe;
    int coun = 1;
    int scr = 0, index=-100;
    ArrayList<String> arrCol = new ArrayList<String>();
    String arrColId[] = {"#0000ff","#ff00ff","#f28609","#ffff00","#000000","#00ff00","#ff0000","#00ffff","#630ac1"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_game_l3);
        arrCol.add("BLUE");     arrCol.add("MAGENTA");      arrCol.add("ORANGE");
        arrCol.add("YELLOW");   arrCol.add("BLACK");      arrCol.add("GREEN");
        arrCol.add("RED");     arrCol.add("CYAN");      arrCol.add("PURPLE");
        r = new Random();
        vibe = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);

        b1 = (Button)findViewById(R.id.cgl3but1);
        b2 = (Button)findViewById(R.id.cgl3but2);
        b3 = (Button)findViewById(R.id.cgl3but3);
        b4 = (Button)findViewById(R.id.cgl3but4);
        b5 = (Button)findViewById(R.id.cgl3but5);
        b6 = (Button)findViewById(R.id.cgl3but6);
        b7 = (Button)findViewById(R.id.cgl3but7);
        b8 = (Button)findViewById(R.id.cgl3but8);
        b9 = (Button)findViewById(R.id.cgl3but9);
        start = (ImageView)findViewById(R.id.cgl3imgstart);
        count = (TextView)findViewById(R.id.cgl3tvcount);
        score = (TextView)findViewById(R.id.cgl3tvscore);
        color = (TextView)findViewById(R.id.cgl3tvcolor);

        setButtonColors();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==0){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==1){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==2){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==3){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==4){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==5){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==6){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==7){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==8){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                }
            }
        });
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGame(coun);
                start.setEnabled(false);
                score.setText("Score: ");
            }
        });

    }
    public void setButtonColors(){
        Collections.shuffle(arrCol);

        b1.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(0))]));
        b2.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(1))]));
        b3.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(2))]));
        b4.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(3))]));
        b5.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(4))]));
        b6.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(5))]));
        b7.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(6))]));
        b8.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(7))]));
        b9.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(8))]));
    }

    public int getColor(String col){
        switch(col){
            case "BLUE" :return 0;
            case "MAGENTA" :return 1;
            case "ORANGE" :return 2;
            case "YELLOW" :return 3;
            case "BLACK" :return 4;
            case "GREEN" :return 5;
            case "RED" :return 6;
            case "CYAN" :return 7;
            case "PURPLE" :return 8;
            default: return -1;
        }

    }
    public void startGame(int in){
        final int j = in;
        if(in == 21){
            index = -100;
            start.setEnabled(true);
            scr = 0;
            return;
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                index = r.nextInt(900);
                index /= 100;
                setButtonColors();
                count.setText("Count: "+j+"/20");
                color.setBackgroundColor(Color.parseColor(arrColId[getColor(arrCol.get(index))]));
                startGame(j+1);
            }
        }, 1000);
    }

}
