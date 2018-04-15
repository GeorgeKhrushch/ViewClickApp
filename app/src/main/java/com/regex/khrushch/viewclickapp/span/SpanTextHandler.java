package com.regex.khrushch.viewclickapp.span;

import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.widget.TextView;

public class SpanTextHandler {

    private TextView tvHello;

    public SpanTextHandler(TextView tvHello) {
        this.tvHello = tvHello;
        setDifferentSizeTextToTextView();
    }

    private void setDifferentSizeTextToTextView(){
        Spannable partOne = getSpannable("Hello, ", Color.BLACK, 2f);
        Spannable partTwo = getSpannable("Java, ", Color.BLUE, 1.5f);
        Spannable partThree = getSpannable("my old friend...", Color.GRAY, 1.3f);
        tvHello.setText(partOne);
        tvHello.append(partTwo);
        tvHello.append(partThree);
        tvHello.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private Spannable getSpannable(String text, int color, float size){
        Spannable spannable = new SpannableString(text);
        spannable.setSpan(new ForegroundColorSpan(color), 0, spannable.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new RelativeSizeSpan(size), 0, spannable.length(), 0);
        spannable.setSpan(new ClickSpan(text), 0, spannable.length(), 0);
        //spannable.setSpan(new BackgroundColorSpan(Color.TRANSPARENT),0, spannable.length(), 0);
        return spannable;
    }
}
