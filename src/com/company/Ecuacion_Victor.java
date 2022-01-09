package com.company;
/**
 * @author Victor Navarro
 * tema 4
 */

import java.util.Scanner;

public class Ecuacion_Victor {
    //atributos y constructores de la clase
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


    //metodos para calcular las incognitas

    //se ha modificado el tipo del metodo para devolver tambien el mensaje junto con su valor.
    double calcularX1(int a, int b, int c) throws ExcepcionDiscriminanteNegativo{
        double x1 = ((b*-1)+(Math.sqrt(Math.pow(b, 2)+(-4*a*c))))/(2*a);
        System.out.println("la primera solución de la ecuacion de segundo grado a= " + a + " b= " + b + " c= " + c + " es: ");
        return x1;

    }
    double calcularX2(int a, int b, int c) throws ExcepcionDiscriminanteNegativo{
        double x2 = ((b*-1)-(Math.sqrt(Math.pow(b, 2)+(-4*a*c))))/(2*a);
        System.out.println("la primera solución de la ecuacion de segundo grado a= " + a + " b= " + b + " c= " + c + " es: ");
        return x2;

    }

    //metodo para el discriminante negativo:
    void ExcepcionDiscriminanteNegativo(int a, int b, int c) {
        try{
            if ((Math.pow(b,2)+(-4* a * c))>=0){
                System.out.println("el resultado del discriminante es positivo, puede continuar la ejecución del programa");
                System.out.println(" ");
                System.out.println(calcularX1(a, b, c));
                System.out.println(calcularX2(a, b, c));
            }else{
                //lazamos el error personalizado, si el discriminante es negativo
                throw new ExcepcionDiscriminanteNegativo("EL DISCRIMINANTE ES NEGATIVO: NO HAY SOLUCIONES REALES");

            }//final del else

        }catch (ExcepcionDiscriminanteNegativo error){
            System.out.println(error.getMessage());


        }//final del catch
    }

    //clase para crear nuestras propias excepciones
    public class ExcepcionDiscriminanteNegativo extends Exception{
        public ExcepcionDiscriminanteNegativo(String msg) {
            super(msg);
        }
    }



    public static void main (String args[]) throws ExcepcionDiscriminanteNegativo {

        Scanner sc = new Scanner(System.in);
        //capturamos una excepción general como dice el ejercicio
        try{
            //pedimos los valores para el constructor
            System.out.println("Introduce el valor a: ");
            int a = sc.nextInt();
            System.out.println("Introduce el valor b: ");
            int b = sc.nextInt();
            System.out.println("Introduce el valor c: ");
            int c = sc.nextInt();


            //instancionamos un objeto de la clase Ecuación_Victor
            Ecuacion_Victor miEcuacion = new Ecuacion_Victor(a, b, c);
            miEcuacion.ExcepcionDiscriminanteNegativo(a, b, c);
        }catch (Exception error){
            System.out.println("se ha capturado y controlado una excepción ");
        }//final del catch de la excepción


        



    }//final del main

}//final de la clase
