package com.example.ejercicio1_1_1p;

public class Matematicas {
    public Integer n1;
    public Integer n2;
    static Double resp;



    public Matematicas(){

    }


public static Double Sumar(int n1, int n2){
    resp = (double)n1+n2;
return resp;
}
public static Double Restar(int n1, int n2){
        resp = (double)n1-n2;
        return resp;
    }
    public static Double Multiplicar(int n1,int n2){
        resp = (double)n1*n2;
        return resp;
    }
    public static  Double Dividir(int n1,int n2){
        resp = (double)n1/n2;
        return resp;
    }

    public int getN2() {return n2;}

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public Double getResp() {
        return resp;
    }

    public void setResp(Double resp) {
        this.resp = resp;
    }


    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }
}
