package com.joyappsdevteam.plainshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Aircraft2 extends Aircraft {

    Bitmap[] aircraft = new Bitmap[10];

    public Aircraft2(Context context) {
        super(context);

        aircraft[0] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft2_1);
        aircraft[1] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft2_2);
        aircraft[2] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft2_3);
        aircraft[3] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft2_4);
        aircraft[4] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft2_5);
        aircraft[5] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft2_6);
        aircraft[6] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft2_7);
        aircraft[7] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft2_8);
        aircraft[8] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft2_9);
        aircraft[9] = BitmapFactory.decodeResource(context.getResources(), R.drawable.aircraft2_10);

        resetPosition();
    }

    @Override
    public Bitmap getBitmap() {
        return aircraft[aircraftFrame];
    }

    @Override
    public int getWidth() {
        return aircraft[0].getWidth();
    }

    @Override
    public int getHeight() {
        return aircraft[0].getHeight();
    }

    @Override
    public void resetPosition() {
        aircraftX = -(200 + random.nextInt(1500));
        aircraftY = random.nextInt(400);
        velocity = 5 + random.nextInt(21);
    }
}
