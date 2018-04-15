package com.regex.khrushch.viewclickapp.circle_click;

import android.view.View;

class Radius {

    private float radius;

    Radius(View view) {
        setupRadius(view);
    }

    private void setupRadius(View view) {
        float width = view.getWidth();
        radius = (float) (width*0.88/2);
    }

    float get(){
        return radius;
    }
}
