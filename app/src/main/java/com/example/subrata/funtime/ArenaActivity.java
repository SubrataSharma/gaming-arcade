package com.example.subrata.funtime;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ArenaActivity extends AppCompatActivity {
    ImageView music;
    int storedPreference;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arena);
        music = (ImageView)findViewById(R.id.music);
        /* Getting app music settings icon **/
        preferences = PreferenceManager.getDefaultSharedPreferences(ArenaActivity.this);
        /*End Getting app music settings icon**/

    }

    public void settings(View v){

    }
    public void music(View v){
        storedPreference = preferences.getInt("storedInt",0);
        changeMusicIcon();
    }
    public void changeMusicIcon(){
        if(storedPreference==-1){
            startService(new Intent(ArenaActivity.this,MyService.class));
            music.setImageResource(R.drawable.sound);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("storedInt", 0); // value to store
            editor.commit();
            Toast.makeText(getApplicationContext(),storedPreference+" true",Toast.LENGTH_LONG).show();

        }
        else{
            stopService(new Intent(ArenaActivity.this,MyService.class));
            music.setImageResource(R.drawable.mute);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("storedInt", -1); // value to store
            editor.commit();
            Toast.makeText(getApplicationContext(),storedPreference+" false",Toast.LENGTH_LONG).show();
        }
    }
    public void colorgame(View v){
        startActivity(new Intent(ArenaActivity.this,ColorGameL1.class));
    }
    public void slidegame(View v){
        startActivity(new Intent(ArenaActivity.this,SlideGameL1.class));
    }
    public void spinthebottle(View v){
        startActivity(new Intent(ArenaActivity.this,SpinTheBottle.class));
    }
    public void crosswords(View v){
        startActivity(new Intent(ArenaActivity.this,CrossWordsL1.class));
    }
    public void tictactoe(View v){
        startActivity(new Intent(ArenaActivity.this,TicTacToe.class));
    }
    public void quiz(View v){
        startActivity(new Intent(ArenaActivity.this,QuizL1.class));
    }

    @Override
    protected void onPause() {
        super.onPause();
        stopService(new Intent(ArenaActivity.this,MyService.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        storedPreference = preferences.getInt("storedInt",0);
        if(storedPreference==-1) {
            stopService(new Intent(ArenaActivity.this,MyService.class));
            music.setImageResource(R.drawable.mute);
        }
        else {
            startService(new Intent(ArenaActivity.this,MyService.class));
            music.setImageResource(R.drawable.sound);
        }
    }
}