package com.joyappsdevteam.plainshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

import static com.joyappsdevteam.plainshooter.GameView.dWidth;

public class Aircraft {

    Bitmap[] aircraft = new Bitmap[15];
    int aircraftX, aircraftY, velocity, aircraftFrame;
    Random random;

    public Aircraft(Context context) {

        aircraft[0] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft_1);
        aircraft[1] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft_2);
        aircraft[2] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft_3);
        aircraft[3] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft_4);
        aircraft[4] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft_5);
        aircraft[5] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft_6);
        aircraft[6] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft_7);
        aircraft[7] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft_8);
        aircraft[8] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft_9);
        aircraft[9] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft_10);
        aircraft[10] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft_11);
        aircraft[11] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft_12);
        aircraft[12] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft_13);
        aircraft[13] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft_14);
        aircraft[14] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft_15);

        random = new Random();

        resetPosition();
    }

    public Bitmap getBitmap() {
        return aircraft[aircraftFrame];
    }

    public int getWidth() {
        return aircraft[0].getWidth();
    }

    public int getHeight() {
        return aircraft[0].getHeight();
    }

    public void resetPosition() {
        aircraftX = dWidth + random.nextInt(1200);
        aircraftY = random.nextInt(300);
        velocity = 8 + random.nextInt(13);
        aircraftFrame = 0;
    }
}
