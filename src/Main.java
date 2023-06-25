package com.open_bootcamp;

public class Main {
    //EJERCICIO IF
    public static void main(String[] args) {
        int numeroif= -2;

        if (numeroif == 0) {
            System.out.println("es cero");
        }else if (numeroif < 0) {
            System.out.println("es negativo");
        }else {
            System.out.println("es positivo");
        }

        //EJERCICIO WHILE

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        //EJERCICIO DO WHILE
        int numerodoWhile = 0;
        do {
            System.out.println(numerodoWhile);
            numerodoWhile = numerodoWhile + 2;
        }while (numeroWhile < 3);

        //EJERCICIO FOR
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1){
            System.out.println(numeroFor);
        }

        //EJERCICIO SWITCH

        var estacion = "otoño";

        switch (estacion){
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("No es una estacion");
        }


    }
}