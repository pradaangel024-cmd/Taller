package com.mycompany.taller2;

import java.util.Scanner;

public class Taller2 {

    public static void main(String[] args) {
        // Aquí llamas a los ejercicios que quieras probar
        ejercicio1();
    }

    public static void ejercicio1() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese n1: ");
        int n1 = lector.nextInt();
        System.out.print("Ingrese n2: ");
        int n2 = lector.nextInt();
        System.out.print("Ingrese n3: ");
        int n3 = lector.nextInt();
        System.out.print("Ingrese n4: ");
        int n4 = lector.nextInt();
        System.out.print("Ingrese n5: ");
        int n5 = lector.nextInt();
        int promedio = (n1 + n2 + n3 + n4 + n5) / 5;
        System.out.println("Promedio: " + promedio);
    }

    public static void ejercicio2() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Nota parciales (55%): ");
        float n1 = lector.nextFloat();
        System.out.print("Nota quices (30%): ");
        float n2 = lector.nextFloat();
        System.out.print("Nota trabajo (15%): ");
        float n3 = lector.nextFloat();
        double p = (n1 * 0.55) + (n2 * 0.3) + (n3 * 0.15);
        System.out.println("Promedio final: " + p);
    }

    public static void ejercicio3() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Nombre del empleado: ");
        String nom = lector.next();
        System.out.print("Horas trabajadas: ");
        int h = lector.nextInt();
        System.out.print("Pago por hora: ");
        int p = lector.nextInt();
        System.out.println(nom + ", su sueldo es: " + (h * p));
    }

    public static void ejercicio4() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = lector.nextInt();
        if (n % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    public static void ejercicio5() {
        Scanner lector = new Scanner(System.in);
        System.out.print("Numero A: ");
        int a = lector.nextInt();
        System.out.print("Numero B: ");
        int b = lector.nextInt();
        System.out.print("Numero C: ");
        int c = lector.nextInt();
        if (a + b == c || a + c == b || b + c == a) {
            System.out.println("Uno es la suma de los otros dos");
        } else {
            System.out.println("No se cumple la condicion");
        }
    }
}