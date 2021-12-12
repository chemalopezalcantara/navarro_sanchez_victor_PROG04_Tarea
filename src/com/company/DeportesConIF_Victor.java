package com.company;
import java.util.Scanner;

public class DeportesConIF_Victor {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la temperatura");
        int temperatura = sc.nextInt();

        if (temperatura > 30){
            System.out.println("tu deporte es natación");
        }
        else if (temperatura > 15 && temperatura <=30){
            System.out.println("tu deporte es el Golf");
        }
        else if (temperatura >5 && temperatura <= 15){
            System.out.println("tu deporte el el Tenis");
        }
        else if (temperatura > -10 && temperatura <= 5){
            System.out.println("tu deporte es el esquí");
        }
        else if (temperatura <= -10){
            System.out.println("tu deporte son las damas");
        }

    } //final del main


}//final de la clase
