package com.anwesome.ui.draggableviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.EditText;

/**
 * Created by anweshmishra on 20/12/16.
 */
public class DraggableEditText extends EditText {
    private GestureDetector gestureDetector;
    public DraggableEditText(Context context, AttributeSet attrs) {
        super(context,attrs);
        gestureDetector = new GestureDetector(new DraggableGestureDetector(this));
    }
    public DraggableEditText(Context context) {
        super(context);
        gestureDetector = new GestureDetector(new DraggableGestureDetector(this));
    }
    public void setOnClickListener(OnClickListener onClickListener) {
        gestureDetector = new GestureDetector(new DraggableGestureDetector(this,onClickListener));
    }
    public boolean onTouchEvent(MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }
}
