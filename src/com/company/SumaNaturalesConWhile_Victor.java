package com.company;
/**
 * @author Victor Navarro
 * tema 4
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaNaturalesConWhile_Victor {
    public static void main(String args[]){
        int suma = 0;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("introduce el  número natural para mostrar la suma de sus anteriores");
            int numero = sc.nextInt();
            sc.close();

            int i = 0;
            while(i <= numero){
                //aqui se realiza la suma y se almacena en la variable suma
                suma = suma + i;

                //aqui se imprime el valor de i
                System.out.print(i + " ");
                //System.out.println();
                i++;
            }

            System.out.println("la suma de todos los números anteriores es: " + suma);

        }catch (InputMismatchException error){
            System.out.println("no has introducido un número natural");
        } //final de la excepción


    }//final del main

}//final de la clase
