package com.dream.will.hydrogenballoon.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

/**
 * Author：Will on 2016/12/22 17:17
 * Mail：heheheqin.will@gmail.com
 */

public class MyImageView extends ImageView {

    private TouchImage touchImage;
    private boolean isTouch;
    private boolean isMove;

    public MyImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyImageView(Context context) {
        super(context);
    }

    public void setTouchImage(TouchImage touchImage) {
        this.touchImage = touchImage;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                isTouch = true;
            }
            break;
            case MotionEvent.ACTION_UP: {
                if (isTouch && !isMove){
                    touchImage.touchImagePic();
                }
            }
            break;
            case MotionEvent.ACTION_MOVE: {
                isMove = true;
            }
            break;
        }
        return super.onTouchEvent(event);
    }

    public interface TouchImage {
        void touchImagePic();
    }
}
