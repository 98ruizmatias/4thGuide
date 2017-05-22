package com.company;

/**
 * Created by pwnd on 1/5/2017.
 */
public class Vector3d {

    private double x;
    private double y;
    private double z;

    // Getters Stuff

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getZ(){return this.z;}

    // Constructor Stuff

    public Vector3d(){
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public Vector3d(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Operations

    public double productoTripleEscalar(Vector3d v){
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    public double norm(){
        return Math.sqrt(this.productoTripleEscalar(this));
    }

    public Vector3d add(Vector3d v){
        return new Vector3d(this.x + v.x, this.y + v.y,this.z + v.z);
    }

}
