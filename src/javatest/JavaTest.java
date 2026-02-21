package javatest;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

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
        
        /*for (int i = 0; i <35; i++ ) {
            System.out.println(i+1);
        }*/
        
        // Números desde el 1 hasta el seleccionado por el usuario
        
        /*int numero;
        boolean valido = false;
        
        Scanner teclado = new Scanner(System.in);

        while (!valido) {
            try {
                System.out.print("Ingrese el número límite: ");
                numero = teclado.nextInt();

                for (int i = 1; i <= numero; i++) {
                    System.out.println(i);
                }
                valido = true;
            } catch (InputMismatchException e) {

                System.out.println("Ingrese un formato de número correcto.");
                teclado.nextLine();
            }
        }*/
        
        // Números del 200 al 250 saltando de 2 en 2
        
        /*for (int i = 198; i <= 248; i++) {
            System.out.println(i + 2);
        }*/
        
        // Cuenta regresiva de 10 a 1
        
        /*for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }*/
        
        // Mostrar palabras ingresadas hasta la palabra salir
        
        /*String palabra = "";
        
        Scanner teclado = new Scanner(System.in);
        
        while (!"salir".equalsIgnoreCase(palabra)) {
            System.out.print("Ingrese una palabra: ");
            palabra = teclado.nextLine();
            
            System.out.println(palabra);
        }*/
        
        // Nombres en array
        
        /*Scanner teclado = new Scanner(System.in);
        
        String[] nombres = new String[8];
        
        for (int i =0; i < nombres.length; i++) {
            System.out.print("Ingrese un nombre: ");
            nombres[i] = teclado.nextLine();      
        }
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(i + ". " + nombres[i]);
        }*/
        
        
        // Número mayor y menor de un array
        
        /*Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + ". Ingrese un número: ");
            numeros[i] = teclado.nextInt();
        }
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);*/
        
        // Contar cantidad de veces que se ingresa el número 3
        
        /*Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(i + 1 + ". Ingrese un número: ");
            numeros[i] = teclado.nextInt();
        }
        
        for (int numero : numeros) {
            if (numero == 3) {
                contador += 1;
            }
        }
        
      

        if (contador == 0) {
            System.out.println("El número no fue ingresado.");
        } else if (contador == 1) {
            System.out.println("El número 3 fue ingresado una vez.");
        } else {
            System.out.println("El número 3 fue ingresado " + contador + " veces.");
        }*/
        
        // Suma y promedio de salario
        
        /*double[] sueldos = new double[4];
        double suma = 0;
        double promedio = 0;

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Ingrese el sueldo número " + (i + 1) + ": ");
            sueldos[i] = teclado.nextDouble();
            suma += sueldos[i];
        }

        promedio = suma / sueldos.length;

        System.out.println("Suma de todos los salarios: " + suma);
        System.out.println("Promedio de todos los salarios: " + promedio);*/
        
        // Tabla de alumnos
        
        double[][] notas = new double[4][3];
        double[] promedios = new double[4];
        Scanner teclado = new Scanner(System.in);
        
        for (int f = 0; f < notas.length; f++) {
            System.out.println("Ingrese las notas del alumno " + (f + 1) + ":");
            for (int c = 0; c < notas[0].length; c++) {
                notas[f][c] = teclado.nextDouble();
            }
        }
        
        double total;
        
        for (int f = 0; f < notas.length; f++) {
            total = 0;
            for (int c = 0; c < notas[0].length; c++) {
                total = total + notas[f][c];
            }
            promedios[f] = total / notas[0].length;
        }
        
        System.out.println("---------- PROMEDIOS ----------");
        
        for (int f = 0; f < notas.length; f++) {
            System.out.println("Las notas del alumno número " + (f + 1) + " son: ");
            for (int c = 0; c < notas[0].length; c++) {
                System.out.println(notas[f][c]);
            }
            System.out.println("El promedio es de: " + promedios[f]);
                    System.out.println("------------------------------");

        }
        
        
        


        
        
        
        
        
        
        
       
        

    }
}
