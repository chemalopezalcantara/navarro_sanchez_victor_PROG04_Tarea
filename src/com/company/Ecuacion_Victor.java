package com.company;

import java.util.Scanner;

public class Ecuacion_Victor {

    int a, b, c;

    public Ecuacion_Victor() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public Ecuacion_Victor(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //metodos para consulta

    public int devolverA() {
        return a;
    }

    public int devolverB() {
        return b;
    }

    public int devolverC() {
        return c;
    }

    //metodos para modificar valores de los atributos

    public void insertarA(int a) {
        this.a = a;
    }

    public void insertarB(int b) {
        this.b = b;
    }

    public void insertarC(int c) {
        this.c = c;
    }

    //metodos






    //excepción discriminante negativo
    double calcularX1(int a, int b, int c) throws Exception{
        int x1 = (int) (((b*-1)+Math.sqrt(obtenerDiscriminante()))/(2*a));
        return x1;
    }
    double calcularX2(int a, int b, int c) throws Exception{
        int x2 = (int) (((b*-1)+Math.sqrt(obtenerDiscriminante()))/(2*a));
        return x2;
    }

    int obtenerDiscriminante () throws Exception{
        return (int) (Math.pow(b, 2)-(4*a*c));
    }

    //int comprobarDiscriminante (int a, int b, int c) throws ExcepcionDiscriminanteNegativo{
        //(b2-4*a*c)
    //}



    public static void main (String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        Ecuacion_Victor ecuacion1 = new Ecuacion_Victor(1, 2, 3);
        System.out.println("los discriminantes son: " + ecuacion1.calcularX1(1, 2, 3) + " x2: " + ecuacion1.calcularX2(1, 2, 3));




        //formula raiz cuadradas
        double x1 = ((b*-1)+(Math.sqrt(Math.pow(b, 2)+(-4*a*c))))/(2*a);
        System.out.println("incognita1: " + x1);

        double x2 = ((b*-1)-(Math.sqrt(Math.pow(b, 2)+(-4*a*c))))/(2*a);
        System.out.println("incognita2: " + x2);

    }//final del main

}//final de la clase
