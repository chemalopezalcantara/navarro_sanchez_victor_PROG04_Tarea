package com.company;

import java.util.Scanner;

public class DeportesConSwitchCase_Victor {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("introduce las opciones:");
            String temperaturaString = sc.nextLine();
            int temperaturaInt = Integer.parseInt(temperaturaString);


            switch (temperaturaInt){

                case 1:
                    System.out.println("estas dentro del caso 1");
                    break;
                case 2:
                    System.out.println("estas dentro del caso 2");
                    break;
                case 3:
                    System.out.println("estas dentro del caso 1");
                    break;
                case 4:
                    System.out.println("estas dentro del caso 1");
                    break;

            }//final del switch
        }catch (NumberFormatException error){
            System.out.println("se ha producido un error con el tipo de dato, error: " + error);
        }





    }//final del main
}//final de la clase
