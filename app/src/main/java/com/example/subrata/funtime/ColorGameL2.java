package com.example.subrata.funtime;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class ColorGameL2 extends AppCompatActivity {
    TextView count,score,color;
    Button blue,magenta,orange,yellow,black,green,red,cyan,purple,easy,pro;
    ImageView start;
    Random r;
    Vibrator vibe;
    int coun = 1;
    int scr = 0, index=-100;
    String arrCol[] = {"BLUE","MAGENTA","ORANGE","YELLOW","BLACK","GREEN","RED","CYAN","PURPLE"};
    String arrColId[] = {"#0000ff","#ff00ff","#f28609","#ffff00","#000000","#00ff00","#ff0000","#00ffff","#630ac1"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_game_l2);
        count = (TextView)findViewById(R.id.cgl2tvcount);
        score = (TextView)findViewById(R.id.cgl2tvscore);
        color = (TextView)findViewById(R.id.cgl2tvcolor);
        blue = (Button)findViewById(R.id.cgl2btblue);
        magenta = (Button)findViewById(R.id.cgl2btmagneta);
        orange = (Button)findViewById(R.id.cgl2btorange);
        yellow = (Button)findViewById(R.id.cgl2btyellow);
        black = (Button)findViewById(R.id.cgl2btblack);
        green = (Button)findViewById(R.id.cgl2btgreen);
        red = (Button)findViewById(R.id.cgl2btred);
        cyan = (Button)findViewById(R.id.cgl2btcyan);
        purple = (Button)findViewById(R.id.cgl2btpurple);
        start = (ImageView)findViewById(R.id.imagestartl2);
        easy = (Button)findViewById(R.id.Lvl1);
        pro = (Button)findViewById(R.id.Lvl3);
        r = new Random();
        vibe = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==0){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });
        magenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==1){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==2){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==3){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==4){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==5){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==6){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });
        cyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==7){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==7){
                    scr += 1;
                    score.setText("Score: "+scr);
                }else{
                    index = -100;
                    vibe.vibrate(200);
                    animate();
                }
            }
        });


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score.setText("Score: ");
                startGame(coun);
                start.setEnabled(false);
            }
        });
    }
    public void animate(){
        Animation anim = new TranslateAnimation(0,20,0,0);
        anim.setDuration(3);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(10);
        color.startAnimation(anim);
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
                count.setText("Count: "+j+"/20");
                color.setText(arrCol[index]);
                color.setTextColor(Color.parseColor(arrColId[index]));
                startGame(j+1);
            }
        }, 1000);
        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ColorGameL2.this,ColorGameL1.class);
                startActivity(in);
            }
        });
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ColorGameL2.this,ColorGameL3.class));
            }
        });
    }
}