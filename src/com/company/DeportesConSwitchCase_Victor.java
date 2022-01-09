package com.company;
/**
 * @author Victor Navarro
 * tema 4
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class DeportesConSwitchCase_Victor {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        //controlamos los posibles errores con los tipos de datos
        try{
            System.out.println("introduce la temperatura: ");
            int num = sc.nextInt();
            //avaluamos las condiciones dentro del swich
            switch (((num > 30) ? 0 : (15 < num && num <= 30) ? 1 : (5 < num && num <= 15) ? 2 : (-10 < num && num <= 5) ? 3 : (num<= -10) ? 4 : 5)){
                case 0:
                    System.out.println("tu deporte es la natación");
                    break;
                case 1:
                    System.out.println("tu deporte es el golf");
                    break;
                case 2:
                    System.out.println("tu deporte es el tenis");
                    break;
                case 3:
                    System.out.println("tu deporte es el esqui");
                    break;
                case 4:
                    System.out.println("tu deporte son las damas");
                    break;

            }//final del switch

        }catch (InputMismatchException error){
            System.out.println("se ha producido un error con el tipo de dato, error: " + error);
        }





    }//final del main
}//final de la clase
