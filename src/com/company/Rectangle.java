package com.company;

import java.lang.Math;

/**
 * Created by pwnd on 1/5/2017.
 */
public class Rectangle {

    // Main vars

    private Vector origin;
    private Vector corner;

    // Getters

    public Vector getOrigin(){return this.origin;}
    public Vector getCorner(){return this.corner;}

    public Double getBase(){
        return this.corner.getX() - this.origin.getX();
    }

    public Double getAltura(){
        return this.origin.getY() - this.corner.getY();
    }

    // Rectangle

    public Rectangle(Vector origin, Vector corner){
        this.origin = origin;
        this.corner = corner;
    }

    // Operations

    public Double getArea(Rectangle rect){
        return rect.getBase()*rect.getAltura();
    }

    public Double getPerimeter(Rectangle rect){
        return 2 * rect.getBase() + 2 * rect.getAltura();
    }


}
