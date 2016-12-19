package com.anwesome.ui.draggableviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

/**
 * Created by anweshmishra on 20/12/16.
 */
public class DraggableImageView extends ImageView {
    private GestureDetector gestureDetector;

    public DraggableImageView(Context context, AttributeSet attrs) {
        super(context,attrs);
        gestureDetector = new GestureDetector(new DraggableGestureDetector(this));
    }
    public DraggableImageView(Context context) {
        super(context);
        gestureDetector = new GestureDetector(new DraggableGestureDetector(this));
    }
    public void setOnClickListener(ImageView.OnClickListener clickListener) {
        gestureDetector = new GestureDetector(new DraggableGestureDetector(this,clickListener));
    }
    public boolean onTouchEvent(MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }
}
