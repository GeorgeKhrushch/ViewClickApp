package com.regex.khrushch.viewclickapp.circle_click;

import android.view.MotionEvent;

class CircleClickEvent {

    private float radius;
    private float x;
    private float y;

    CircleClickEvent(float radius, float width, MotionEvent event) {
        this.radius = radius;
        x = event.getX() - width/2;
        y = event.getY() - width/2;
    }

    boolean isClickInsideCircle(){
        return x*x + y*y <= radius*radius;
    }
}
