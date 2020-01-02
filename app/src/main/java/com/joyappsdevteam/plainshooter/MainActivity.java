package com.joyappsdevteam.plainshooter;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGame(View view) {
        Toast.makeText(this, "ButtonClicked", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(MainActivity.this, StartGame.class);
        startActivity(i);
        finish();
    }
}
