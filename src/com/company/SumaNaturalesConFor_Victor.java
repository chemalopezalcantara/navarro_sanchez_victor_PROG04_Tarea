package com.company;
/*
*@author Victor Navarro
* tema 4
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaNaturalesConFor_Victor {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        //preparamos una excepción para prevenir posibles valores no numericos
        try{
            System.out.println("introduce el numero y te dire la suma de todos sus anteriores");
            int numero = sc.nextInt();
            for (int i = 0; i<=numero; i++){
                System.out.print(" " + i);
                suma = suma + i;
            }
            System.out.println(" la suma de todos sus numeros anteriores es: " + suma);
        }catch (InputMismatchException error){
            System.out.println("no has introducido un valor numerico: " + error);
        }



    }//final del main

}//final de la clase
