package com.company;

import java.util.Scanner;

public class SumaNumeros_Victor {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int numero = 0, suma = 0;

        while(numero != -1){
                System.out.println("Introduce numero: ");
                numero = sc.nextInt();
                suma = suma + numero;

        }


        System.out.println("el resultado de la suma de todos ellos es: " +  (suma+1));
    }//final del main
}
