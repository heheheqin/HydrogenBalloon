package com.dream.will.hydrogenballoon.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dream.will.hydrogenballoon.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：Will on 2016/12/20 11:27
 * Mail：heheheqin.will@gmail.com
 */

public class WantToView extends LinearLayout {

    List<String>  strings ;
    private HorizontalScrollView hsv;
    private TextView wantto;
    private LinearLayout ll;

    public WantToView(Context context) {
        super(context);
        initData();
    }

    public WantToView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initData();
    }

    private void initData() {
        strings = new ArrayList<>();
        inflate(getContext(), R.layout.gonglv_list_head_wantto_view, this);
        hsv = (HorizontalScrollView) findViewById(R.id.hsv);
        ll = (LinearLayout) findViewById(R.id.linearlayout);
        wantto = (TextView) findViewById(R.id.wantto);
        wantto.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setText("桂林");
            }
        });
    }

    public void setText(String str){
            strings.add(0,str);
        int size = strings.size();

        if (size != 0){
            ll.removeAllViews();
            for (int i = 0; i < size; i++) {
                LayoutParams params = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.setMargins(8,8,8,8);
                TextView textView = new TextView(getContext());
                textView.setBackgroundResource(R.drawable.wanto_text_shape);
                textView.setTextSize(13);
                textView.setPadding(15,4,15,4);
                textView.setTextColor(getResources().getColor(R.color.wanto_text_gray));
                textView.setText(strings.get(i));
                ll.addView(textView,params);
                Log.i("TAG", "setText: ---------" + i);
            }
//            hsv.addView(ll);
            requestLayout();
        }
    }


}
