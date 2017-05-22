package com.company;

/**
 * Created by pwnd on 21/5/2017.
 */
public class Triangle {

    /// 0 = vertice superior // 1 = vertice inferior izquierdo // 2 = vertice inferior derecho

    private Vector [] vertices;

    public Triangle(Vector [] v){this.vertices = v;}

    //Get stuff

    public Vector[] getVertices(){return this.vertices;}

    public Vector getVertex(int index){
        return this.vertices[index];
    }

    public double getBase(){return this.vertices[2].getX() - this.vertices[1].getX();}
    public double getAltura(){return this.vertices[0].getY() - this.vertices[1].getX();}


    public double getA(){return Math.sqrt((this.vertices[0].getX() - this.vertices[1].getX())+((this.vertices[0].getY() - this.vertices[1].getY())));}
    public double getB(){return this.vertices[0].getY() - this.vertices[1].getX();}
    public double getC(){return Math.sqrt((this.vertices[0].getX() - this.vertices[2].getX())+((this.vertices[0].getY() - this.vertices[2].getY())));}

    // Other Stuff

    public double getArea(){return (getBase() * getAltura()) / 2;}
    public double getPerimetro(){return getA() + getB() + getC();}


}
