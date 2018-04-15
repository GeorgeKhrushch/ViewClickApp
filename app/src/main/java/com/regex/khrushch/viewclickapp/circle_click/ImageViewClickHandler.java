package com.regex.khrushch.viewclickapp.circle_click;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageViewClickHandler {

    private ImageView ivPlus;
    private CircleClickEvent clickEvent;
    private Radius radius;

    public ImageViewClickHandler(ImageView ivPlus) {
        this.ivPlus = ivPlus;
        setButtonListeners();
    }

    private void setButtonListeners() {
        ivPlus.setOnTouchListener((v, e) -> {
            if (e.getAction() == MotionEvent.ACTION_DOWN){
                calculateRadius(v);
                saveClickEvent(v, e);
            }
            return false;
        });
        ivPlus.setOnClickListener(v -> {
            Toast.makeText(ivPlus.getContext(), "Click inside the circle: "
                    + clickEvent.isClickInsideCircle(), Toast.LENGTH_SHORT).show();
        });
    }

    private void calculateRadius(View v) {
        if(radius == null){
            radius = new Radius(v);
        }
    }

    private void saveClickEvent(View v, MotionEvent e) {
        clickEvent = new CircleClickEvent(radius.get(), v.getWidth(), e);
    }
}
