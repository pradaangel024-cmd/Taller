/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Taller3 {
    public static void main(String[] args) {
        
       //ejercicio1(); 
     // ejercicio2(); 
     //ejercicio3();
     //ejercicio4();
     ejercicio5();
    }
    // Primer ejercicio.
     
    public static void ejercicio1(){
        Scanner sc = new Scanner(System.in);
System.out.print("Ingrese un número entero: ");
int num = sc.nextInt();

if (num >= 100 && num <= 200) {
    if (num % 3 == 0) {
        System.out.println("El numero es multiplo de 3 y esta en el rango.");
        //Acá cumple las dos condiciones requeridas
    } else {
        System.out.println("Esta en el rango, pero NO es multiplo de 3.");
        //Acá solo cumple una
    }
} else {
    System.out.println("El numero esta fuera del rango.");
    //Acá no cumplió con ninguna
}
    }
    // Segundo ejercicio.
     public static void ejercicio2(){
       

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el día de nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("Ingresa el mes de nacimiento (1-12): ");
        int mes = sc.nextInt();
        
       

        String signo = switch (mes) {
            
            case 1 -> (dia >= 21) ? "Acuario" : "Capricornio";
            case 2 -> (dia >= 20) ? "Piscis" : "Acuario";
            case 3 -> (dia >= 21) ? "Aries" : "Piscis";
            case 4 -> (dia >= 21) ? "Tauro" : "Aries";
            case 5 -> (dia >= 22) ? "Geminis" : "Tauro";
            case 6 -> (dia >= 22) ? "Cancer" : "Géminis";
            case 7 -> (dia >= 23) ? "Leo" : "Cancer";
            case 8 -> (dia >= 24) ? "Virgo" : "Leo";
            case 9 -> (dia >= 24) ? "Libra" : "Virgo";
            case 10 -> (dia >= 24) ? "Escorpio" : "Libra";
            case 11 -> (dia >= 23) ? "Sagitario" : "Escorpio";
            case 12 -> (dia >= 22) ? "Capricornio" : "Sagitario";
            default -> "Mes inválido";
        };
        
        System.out.println("Tu signo es: " + signo);
    }
     //Tercer ejercicio
     public static void ejercicio3(){
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Precio del producto a comprar: ");
        double precio = sc.nextDouble();
        
        System.out.print("Descuento: ");
        double desc = sc.nextDouble();
        
        double valorDesc = precio * (desc / 100);
        double total = precio - valorDesc;
        
        System.out.println("El total es: " + total);
    
     }
    // Cuarto ejercicio
     public static void ejercicio4(){
         Scanner sc = new Scanner(System.in);

        System.out.print("Numero 1: ");
        int a = sc.nextInt();
        System.out.print("Numero 2: ");
        int b = sc.nextInt();
        System.out.print("Numero 3: ");
        int c = sc.nextInt();

        int temporal;

        if (a > b) {
            temporal = a;
            a = b;
            b = temporal;
        }
        if (b > c) {
            temporal = b;
            b = c;
            c = temporal;
        }
        if (a > b) {
            temporal = a;
            a = b;
            b = temporal;
        }

        System.out.println("El mayor es: " + c);
        System.out.println("Ordenados de menor a mayor: " + a + ", " + b + ", " + c);
    
     }
     //Quinto ejercicio
     public static void ejercicio5(){
         Scanner sc = new Scanner(System.in);

        System.out.print("Dia: ");
        int d = sc.nextInt();
        System.out.print("Mes: ");
        int m = sc.nextInt();
        System.out.print("Año: ");
        int a = sc.nextInt();

        int diasMes = 31; 

       
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            diasMes = 30;
        } else if (m == 2) {

            if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
                diasMes = 29;
            } else {
                diasMes = 28;
            }
        }

  
        d = d + 1;

        if (d > diasMes) {
            d = 1; 
            m = m + 1; 
            
            if (m > 12) {
                m = 1; 
                a = a + 1; 
            }
        }

        System.out.println("La fecha de mañana es: " + d + "/" + m + "/" + a);
    
     }
}

