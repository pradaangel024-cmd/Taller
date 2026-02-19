
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Taller4 {
    public static void main(String[] args) {
        //ejercicio1();
       // ejercicio2();
      // ejercicio3();
      ejercicio4();
    }
    public static void ejercicio1(){
        
        Scanner sc = new Scanner(System.in);
//Acá vamos a hacer un menú de opciones para colocar un número y nos da la opcion
        System.out.println("1- saludar\n2- despedirse\n3- salir");
        int opcion = sc.nextInt();

        switch (opcion) {
            
            case 1 -> System.out.println("Hola");
            case 2 -> System.out.println("Adios");
            case 3 -> System.out.println("Saliendo");
            default -> {
            }
        }
    }
    public static void ejercicio2() {
        Scanner teclado = new Scanner(System.in);

System.out.println("1. Calcular area del cuadrado");
System.out.println("2. Calcular area del circulo");
System.out.println("3. Calcular area del triangulo");
System.out.println("4. Calcular area del rectangulo");
System.out.println("5. Salir");
System.out.print("Elija una opcion: ");

int opcion = teclado.nextInt();

        switch (opcion) {
            //Acá vamos a hallar el área del cuadrado
            case 1 ->                 {
                    System.out.print("¿Digite el valor del lado?: ");
                    double lado = teclado.nextDouble();
                    double resultado = lado * lado;
                    System.out.println("El area es: " + resultado);
                }
            //Acá vamos a hallar el área del círculo
            case 2 ->                 {
                    System.out.print("¿Cuál es el radio?: ");
                    double radio = teclado.nextDouble();
                    double resultado = 3.1416 * (radio * radio);
                    System.out.println("El area es: " + resultado);
                }
            //Acá vamos a hallar el área del triangulo
            case 3 ->                 {
                    System.out.print("¿Cual es el valor de la base?: ");
                    double base = teclado.nextDouble();
                    System.out.print("¿Cuánto es el valor de la Altura?: ");
                    double altura = teclado.nextDouble();
                    double resultado = (base * altura) / 2;
                    System.out.println("El area es: " + resultado);
                }
            //Acá vamos a hallar el área del rectangulo
            case 4 ->                 {
                    System.out.print("¿Cual es el valor de la base?: ");
                    double base = teclado.nextDouble();
                    System.out.print("¿Cuanto mide la altura?: ");
                    double altura = teclado.nextDouble();
                    double resultado = base * altura;
                    System.out.println("El area es: " + resultado);
                }
            case 5 -> System.out.println("Saliendo del programa...");
            default -> {
            }
        }
    }
    public static void ejercicio3() {
   Scanner leer = new Scanner(System.in);

        // Variables para acumular totales (para promedios)
        double sumaMate = 0, sumaIngles = 0, sumaEspanol = 0;
        int totalEstudiantes = 0;
        
        // Variable para guardar el reporte de aprobados (en un String largo)
        String reporteEstudiantes = "";

        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n--- MENU (SIN ARREGLOS) ---");
            System.out.println("1. Registrar notas");
            System.out.println("2. Calcular promedio por materia");
            System.out.println("3. Calcular promedio total del curso");
            System.out.println("4. Mostrar aprobados y reprobados");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            opcion = leer.nextInt();

       switch (opcion) {
           case 1 -> {
               System.out.print("Nombre: ");
               leer.nextLine(); 
               String nombre = leer.nextLine();
               System.out.print("Nota Matematicas: ");
               double m = leer.nextDouble();
               System.out.print("Nota Ingles: ");
               double i = leer.nextDouble();
               System.out.print("Nota Español: ");
               double e = leer.nextDouble();
               
               sumaMate += m;
               sumaIngles += i;
               sumaEspanol += e;
               totalEstudiantes++;
               
               double promIndividual = (m + i + e) / 3;
               String estado = (promIndividual >= 3.0) ? "APROBADO" : "REPROBADO";
               
               reporteEstudiantes += "Nombre: " + nombre + " | Promedio: " + promIndividual + " | " + estado + "\n";
               System.out.println("¡Registrado!");
           }
           case 2 -> {
               if (totalEstudiantes == 0) {
                   System.out.println("No hay datos.");
               } else {
                   System.out.println("Promedio Mate: " + (sumaMate / totalEstudiantes));
                   System.out.println("Promedio Inglés: " + (sumaIngles / totalEstudiantes));
                   System.out.println("Promedio Español: " + (sumaEspanol / totalEstudiantes));
               }
           }
           case 3 -> {
               if (totalEstudiantes == 0) {
                   System.out.println("No hay datos.");
               } else {
                   double sumaTotalCurso = sumaMate + sumaIngles + sumaEspanol;
                   System.out.println("Promedio Total Curso: " + (sumaTotalCurso / (totalEstudiantes * 3)));
               }
           }
           case 4 -> {
               if (totalEstudiantes == 0) {
                   System.out.println("No hay datos.");
               } else {
                   System.out.println("\n--- ESTADO DE ESTUDIANTES ---");
                   System.out.print(reporteEstudiantes);
               }
           }
           case 5 -> System.out.println("Fin del programa.");
           default -> System.out.println("Opcion no valida.");
       }
        }
        
    
       
    }
    public static void ejercicio4(){
     
        Scanner leer = new Scanner(System.in);

       
        String listaVarones = "";
        String listaMujeres = "";

        System.out.print("¿Cuántas personas desea ingresar? ");
        int cantidad = leer.nextInt();
        leer.nextLine(); // Limpiar el buffer

        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nPersona " + (i + 1) + ":");
            
            System.out.print("Nombre: ");
            String nombre = leer.nextLine();

            System.out.print("Sexo (f/m): ");
           
            char sexo = leer.next().toLowerCase().charAt(0);
            leer.nextLine();
            switch (sexo) {
                case 'm' -> listaVarones += "- " + nombre + "\n";
                case 'f' -> listaMujeres += "- " + nombre + "\n";
                default -> System.out.println("Sexo no válido, este nombre no se guardará.");
            }
        }

        
        System.out.println("\n--- NOMBRES DE VARONES ---");
        if (listaVarones.equals("")) {
            System.out.println("No hay varones.");
        } else {
            System.out.print(listaVarones);
        }

        System.out.println("\n--- NOMBRES DE MUJERES ---");
        if (listaMujeres.equals("")) {
            System.out.println("No hay mujeres.");
        } else {
            System.out.print(listaMujeres);
        }
    }
}


