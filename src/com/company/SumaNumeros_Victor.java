package com.company;
/**
 * @author Victor Navarro
 * tema 4
 */
import java.util.Scanner;

public class SumaNumeros_Victor {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int numero = 0, suma = 0;

        while(numero != -1){
                System.out.println("Introduce numero, -1 para terminar: ");
                numero = sc.nextInt();
                suma = suma + numero;

        }


        //se suma 1 para compensar la resta del valor de cierre
        System.out.println("el resultado de la suma de todos ellos es: " +  (suma+1));
    }//final del main
}
