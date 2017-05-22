package com.company;

import java.net.Inet4Address;

/**
 * Created by pwnd on 8/5/2017.
 */
public class Matrix {

    //Raw Materials

    private Integer filas;
    private Integer columnas;
    private Integer [][] stuff;

    //Getters Stuff

    public Integer getFilas(){
        return this.filas;
    }
    public Integer getColumnas(){
        return this.columnas;
    }

    //Constructor Stuff

    public Matrix(Integer filas, Integer columnas){
        this.filas = filas;
        this.columnas = columnas;
        stuff = new Integer[filas][columnas] ;
    }

//    private Matrix(Matrix nu){
//        this(nu.stuff);
//    }

    //Some Stuff


}
