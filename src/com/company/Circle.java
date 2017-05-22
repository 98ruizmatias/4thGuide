package com.company;

import com.sun.deploy.resources.Deployment_pt_BR;

import javax.xml.crypto.dom.DOMCryptoContext;

/**
 * Created by pwnd on 8/5/2017.
 */
public class Circle {

    //Raw Materials

    private Double radio;
    private Double centro;
    private Double pi = 3.14159265359;

    //Getters Stuff

    public Double getRadio(){
        return this.radio;
    }
    public Double getCentro(){
        return this.centro;
    }
    public Double getPi(){
        return this.pi;
    }

    //Constructor Stuff

    public Circle(Double radio, Double centro){
        this.radio = radio;
        this.centro = centro;
    }

    //Operations

    public Double getDiametro(Double radio){
        return radio * 2;
    }

    public Double getArea(Double radio){
        return pi * (radio * radio);
    }

    public Double getPerimeter(Double radio){
        return pi * getDiametro(radio);
    }

}
