package com.regex.khrushch.viewclickapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.regex.khrushch.viewclickapp.circle_click.ImageViewClickHandler;
import com.regex.khrushch.viewclickapp.span.SpanTextHandler;

public class MainActivity extends AppCompatActivity {

    private ImageView ivPlus;
    private TextView tvHello;

    private ImageViewClickHandler clickHandler;
    private SpanTextHandler spanTextHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setupHandlers();
    }

    private void findViews() {
        ivPlus = findViewById(R.id.ivMainActivityPlus);
        tvHello = findViewById(R.id.tvMainActivityHello);
    }

    private void setupHandlers(){
        clickHandler = new ImageViewClickHandler(ivPlus);
        spanTextHandler = new SpanTextHandler(tvHello);
    }
}
