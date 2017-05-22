package com.company;

/**
 * Created by pwnd on 1/5/2017.
 */

public class Vector{

    private double x;
    private double y;

    public double getX(){
        return this.x;
    }
    public double getY(){return	this.y;}

    public Vector(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Vector add(Vector v){
        return new Vector(this.x + v.x, this.y + v.y);
    }


}
