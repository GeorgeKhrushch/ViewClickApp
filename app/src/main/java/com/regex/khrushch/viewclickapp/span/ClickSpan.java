package com.regex.khrushch.viewclickapp.span;

import android.graphics.drawable.ColorDrawable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Toast;


class ClickSpan extends ClickableSpan {

    private String textToShow;

    ClickSpan(String textToShow) {
        this.textToShow = textToShow;
    }

    @Override
    public void onClick(View widget) {
        Toast.makeText(widget.getContext(), textToShow, Toast.LENGTH_SHORT).show();
        widget.setBackgroundDrawable(new ColorDrawable(0x00));
    }

    @Override
    public void updateDrawState(TextPaint ds) {

    }
}
