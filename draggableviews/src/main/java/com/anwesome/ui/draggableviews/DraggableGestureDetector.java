package com.anwesome.ui.draggableviews;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by anweshmishra on 20/12/16.
 */
public class DraggableGestureDetector extends GestureDetector.SimpleOnGestureListener {
    private View view;
    private View.OnClickListener clickListener;
    public DraggableGestureDetector(View view, View.OnClickListener clickListener) {
        this.view = view;
        this.clickListener = clickListener;
    }
    public DraggableGestureDetector(View view) {
        this.view = view;
    }
    public boolean onDown(MotionEvent event) {
        return true;
    }
    public boolean onSingleTapUp(MotionEvent event) {
        if(this.clickListener!=null) {
            this.clickListener.onClick(view);
        }
        return true;
    }
    public boolean onScroll(MotionEvent e1,MotionEvent e2,float velx,float vely) {
        view.setX(e1.getX()+4*(e2.getX()-e1.getX())/5);
        view.setY(e1.getY()+4*(e2.getY()-e1.getY())/5);
        return true;
    }
}