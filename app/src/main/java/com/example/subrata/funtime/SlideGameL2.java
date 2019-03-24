package com.example.subrata.funtime;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class SlideGameL2 extends AppCompatActivity implements View.OnClickListener{

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16,next;
    ImageView congo;
    ArrayList<Integer> arr = new ArrayList<Integer>();
    Vibrator vibe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_game_l2);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        b1 = (Button)findViewById(R.id.sgL2B1);
        b2 = (Button) findViewById(R.id.sgL2B2);
        b3 = (Button) findViewById(R.id.sgL2B3);
        b4 = (Button) findViewById(R.id.sgL2B4);
        b5 = (Button) findViewById(R.id.sgL2B5);
        b6 = (Button) findViewById(R.id.sgL2B6);
        b7 = (Button) findViewById(R.id.sgL2B7);
        b8 = (Button) findViewById(R.id.sgL2B8);
        b9 = (Button) findViewById(R.id.sgL2B9);
        b10 = (Button) findViewById(R.id.sgL2B10);
        b11 = (Button) findViewById(R.id.sgL2B11);
        b12 = (Button) findViewById(R.id.sgL2B12);
        b13 = (Button) findViewById(R.id.sgL2B13);
        b14 = (Button) findViewById(R.id.sgL2B14);
        b15 = (Button) findViewById(R.id.sgL2B15);
        b16 = (Button) findViewById(R.id.sgL2B16);
        next = (Button)findViewById(R.id.sgl1butnext);
        congo = (ImageView)findViewById(R.id.sgl1congo);
        vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        arr.add(0);     arr.add(1);     arr.add(2);     arr.add(3);
        arr.add(4);     arr.add(5);     arr.add(6);     arr.add(7);
        arr.add(8);     arr.add(9);     arr.add(10);    arr.add(11);
        arr.add(12);    arr.add(13);    arr.add(14);    arr.add(15);

        shuffleNumbers();

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SlideGameL2.this,SlideGameL3.class));
                finish();
            }
        });
    }

    public void shuffleNumbers(){
        int inversions, blankIndex;
        while(true){
            inversions = 0;
            blankIndex = arr.indexOf(0);
            blankIndex = (blankIndex/4)+1;
            Collections.shuffle(arr);
            for(int i=0; i<=14; i++){
                for (int j=i+1; j<=15; j++){
                    if(arr.get(i)!=0 && arr.get(j)!=0 && arr.get(i)>arr.get(j))
                        inversions++;
                }
            }
            if((inversions%2==0 && blankIndex%2==0) || (inversions%2!=0 && blankIndex%2!=0))
                break;
        }
        setImage();
    }

    public void setImage(){
        b1.setBackgroundResource(getId(arr.get(0)));    b1.setText(arr.get(0)+"");
        b2.setBackgroundResource(getId(arr.get(1)));    b2.setText(arr.get(1)+"");
        b3.setBackgroundResource(getId(arr.get(2)));    b3.setText(arr.get(2)+"");
        b4.setBackgroundResource(getId(arr.get(3)));    b4.setText(arr.get(3)+"");
        b5.setBackgroundResource(getId(arr.get(4)));    b5.setText(arr.get(4)+"");
        b6.setBackgroundResource(getId(arr.get(5)));    b6.setText(arr.get(5)+"");
        b7.setBackgroundResource(getId(arr.get(6)));    b7.setText(arr.get(6)+"");
        b8.setBackgroundResource(getId(arr.get(7)));    b8.setText(arr.get(7)+"");
        b9.setBackgroundResource(getId(arr.get(8)));    b9.setText(arr.get(8)+"");
        b10.setBackgroundResource(getId(arr.get(9)));    b10.setText(arr.get(9)+"");
        b11.setBackgroundResource(getId(arr.get(10)));    b11.setText(arr.get(10)+"");
        b12.setBackgroundResource(getId(arr.get(11)));    b12.setText(arr.get(11)+"");
        b13.setBackgroundResource(getId(arr.get(12)));    b13.setText(arr.get(12)+"");
        b14.setBackgroundResource(getId(arr.get(13)));    b14.setText(arr.get(13)+"");
        b15.setBackgroundResource(getId(arr.get(14)));    b15.setText(arr.get(14)+"");
        b16.setBackgroundResource(getId(arr.get(15)));    b16.setText(arr.get(15)+"");
    }

    public int getId(int num){
        switch (num){

            case 1: return R.drawable.sgl21;
            case 2: return R.drawable.sgl22;
            case 3: return R.drawable.sgl23;
            case 4: return R.drawable.sgl24;
            case 5: return R.drawable.sgl25;
            case 6: return R.drawable.sgl26;
            case 7: return R.drawable.sgl27;
            case 8: return R.drawable.sgl28;
            case 9: return R.drawable.sgl29;
            case 10: return R.drawable.sgl210;
            case 11: return R.drawable.sgl211;
            case 12: return R.drawable.sgl212;
            case 13: return R.drawable.sgl213;
            case 14: return R.drawable.sgl214;
            case 15: return R.drawable.sgl215;
            default: return R.drawable.sgl20;
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.sgL2B1:
                if(b2.getText().toString().equals("0"))
                    doSwap(b1, b2);
                else if(b5.getText().toString().equals("0"))
                    doSwap(b1, b5);
                else {
                    vibe.vibrate(100);}
                break;
            case R.id.sgL2B2:
                if(b1.getText().toString().equals("0"))
                    doSwap(b2,b1);
                else if(b3.getText().toString().equals("0"))
                    doSwap(b2, b3);
                else if(b6.getText().toString().equals("0"))
                    doSwap(b2, b6);
                else {
                    vibe.vibrate(100);}
                break;
            case R.id.sgL2B3:
                if(b2.getText().toString().equals("0"))
                    doSwap(b3, b2);
                else if(b4.getText().toString().equals("0"))
                    doSwap(b3, b4);
                else if(b7.getText().toString().equals("0"))
                    doSwap(b3, b7);
                else {
                    vibe.vibrate(100);}
                break;
            case R.id.sgL2B4:
                if(b3.getText().toString().equals("0"))
                    doSwap(b4, b3);
                else if(b8.getText().toString().equals("0"))
                    doSwap(b4, b8);
                else {
                    vibe.vibrate(100);}
                break;

            case R.id.sgL2B5:
                if(b1.getText().toString().equals("0"))
                    doSwap(b5, b1);
                else if(b6.getText().toString().equals("0"))
                    doSwap(b5, b6);
                else if(b9.getText().toString().equals("0"))
                    doSwap(b5, b9);
                else {
                    vibe.vibrate(100);}
                break;
            case R.id.sgL2B6:
                if(b2.getText().toString().equals("0"))
                    doSwap(b6, b2);
                else if(b5.getText().toString().equals("0"))
                    doSwap(b6, b5);
                else if(b7.getText().toString().equals("0"))
                    doSwap(b6, b7);
                else if(b10.getText().toString().equals("0"))
                    doSwap(b6, b10);
                else {
                    vibe.vibrate(100);}
                break;
            case R.id.sgL2B7:
                if(b3.getText().toString().equals("0"))
                    doSwap(b7, b3);
                else if(b6.getText().toString().equals("0"))
                    doSwap(b7, b6);
                else if(b8.getText().toString().equals("0"))
                    doSwap(b7, b8);
                else if(b11.getText().toString().equals("0"))
                    doSwap(b7, b11);
                else {
                    vibe.vibrate(100);}
                break;
            case R.id.sgL2B8:
                if(b4.getText().toString().equals("0"))
                    doSwap(b8,b4);
                else if(b7.getText().toString().equals("0"))
                    doSwap(b8, b7);
                else if(b12.getText().toString().equals("0"))
                    doSwap(b8, b12);
                else {
                    vibe.vibrate(100);}
                break;

            case R.id.sgL2B9:
                if(b5.getText().toString().equals("0"))
                    doSwap(b9, b5);
                else if(b10.getText().toString().equals("0"))
                    doSwap(b9, b10);
                else if(b13.getText().toString().equals("0"))
                    doSwap(b9, b13);
                else {
                    vibe.vibrate(100);}
                break;
            case R.id.sgL2B10:
                if(b6.getText().toString().equals("0"))
                    doSwap(b10, b6);
                else if(b9.getText().toString().equals("0"))
                    doSwap(b10, b9);
                else if(b11.getText().toString().equals("0"))
                    doSwap(b10, b11);
                else if(b14.getText().toString().equals("0"))
                    doSwap(b10, b14);
                else {
                    vibe.vibrate(100);}
                break;
            case R.id.sgL2B11:
                if(b7.getText().toString().equals("0"))
                    doSwap(b11, b7);
                else if(b10.getText().toString().equals("0"))
                    doSwap(b11, b10);
                else if(b12.getText().toString().equals("0"))
                    doSwap(b11, b12);
                else if(b15.getText().toString().equals("0"))
                    doSwap(b11, b15);
                else {
                    vibe.vibrate(100);}
                break;
            case R.id.sgL2B12:
                if(b8.getText().toString().equals("0"))
                    doSwap(b12,b8);
                else if(b11.getText().toString().equals("0"))
                    doSwap(b12, b11);
                else if(b16.getText().toString().equals("0"))
                    doSwap(b12, b16);
                else {
                    vibe.vibrate(100);}
                break;

            case R.id.sgL2B13:
                if(b9.getText().toString().equals("0"))
                    doSwap(b13, b9);
                else if(b14.getText().toString().equals("0"))
                    doSwap(b13, b14);
                else {
                    vibe.vibrate(100);}
                break;
            case R.id.sgL2B14:
                if(b10.getText().toString().equals("0"))
                    doSwap(b14,b10);
                else if(b13.getText().toString().equals("0"))
                    doSwap(b14, b13);
                else if(b15.getText().toString().equals("0"))
                    doSwap(b14, b15);
                else {
                    vibe.vibrate(100);}
                break;
            case R.id.sgL2B15:
                if(b11.getText().toString().equals("0"))
                    doSwap(b15, b11);
                else if(b14.getText().toString().equals("0"))
                    doSwap(b15, b14);
                else if(b16.getText().toString().equals("0"))
                    doSwap(b15, b16);
                else {
                    vibe.vibrate(100);}
                break;
            case R.id.sgL2B16:
                if(b12.getText().toString().equals("0"))
                    doSwap(b16, b12);
                else if(b15.getText().toString().equals("0"))
                    doSwap(b16, b15);
                else {
                    vibe.vibrate(100);}
                break;
        }
        if(b1.getText().toString().equals("1") && b2.getText().toString().equals("2") &&
                b3.getText().toString().equals("3")   && b4.getText().toString().equals("4") &&
                b5.getText().toString().equals("5")   && b6.getText().toString().equals("6") &&
                b7.getText().toString().equals("7")   && b8.getText().toString().equals("8") &&
                b9.getText().toString().equals("9")   && b10.getText().toString().equals("10") &&
                b11.getText().toString().equals("11") && b12.getText().toString().equals("12") &&
                b13.getText().toString().equals("13") && b14.getText().toString().equals("14") &&
                b15.getText().toString().equals("15") && b16.getText().toString().equals("0"))
        {
            congo.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
            Toast.makeText(getApplicationContext(),"done",Toast.LENGTH_SHORT).show();

        }
    }

    public void doSwap(Button from, Button to){
        to.setText(from.getText());
        from.setText("0");
        to.setBackgroundResource(getId(Integer.parseInt(to.getText().toString())));
        from.setBackgroundResource(getId(0));
    }
}