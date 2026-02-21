package javatest;

import java.util.Scanner;

public class JavaTest {

    public static void main(String[] args) {

        /*int edad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** BIENVENIDO A ENGLISH SCHOOL ***");
        System.out.println("Ingrese la edad del alumno");
        edad = teclado.nextInt();

        if (edad >= 4 && edad <= 6) {
            System.out.println("Lunes y miércoles de 16 a 17 hs.");
        } else if (edad >= 7 && edad <= 8) {
            System.out.println("Martes y Jueves de 16.30 a 17.30 hs.");
        } else if (edad >= 9 && edad <= 10) {
            System.out.println("Martes y Jueves de 17.30 a 19 hs.");
        } else if (edad >= 11 && edad <= 13) {
            System.out.println("Martes y Jueves de 17 a 18.30 hs.");
        } else {
            System.out.println("Ingrese una edad correcta.");
        }*/
        
        // Números en pantalla del 1 al 35
        /*for (int i = 1; i <35; i++ ) {
            System.out.println(i);
        }*/
        
        // Números desde el 1 hasta el seleccionado por el usuario

        // Solicitar número
        
        int numero;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número límite");
        numero = teclado.nextInt();
        
        System.out.println("Número: " + numero);
        

    }
}
