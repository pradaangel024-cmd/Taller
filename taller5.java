
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class taller5 {
        public static void main(String[] args) {
           //ejercicio1();  
           ejercicio2();
        }
         public static void ejercicio1() {
  Scanner sc = new Scanner(System.in);
        
       
        String[] nombres = new String[10];
        String[] telefonos = new String[10];
        
        
        for (int i = 0; i < 10; i++) {
            nombres[i] = "Vacio";
            telefonos[i] = "0";
        }

        int op = 0;
        int contador = 0; 

        while (op != 7) {
            System.out.println("\n--- GESTION DE ESTUDIANTES ---");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Consultar estudiante");
            System.out.println("3. Modificar nombre");
            System.out.println("4. Modificar telefono");
            System.out.println("5. Eliminar estudiante");
            System.out.println("6. Imprimir listado");
            System.out.println("7. Salir");
            System.out.print("Elija una opcion: ");
            op = sc.nextInt();
            sc.nextLine(); 
      switch (op) {
          case 1 -> {
              
              if (contador < 10) {
                  System.out.print("Nombre: ");
                  nombres[contador] = sc.nextLine();
                  System.out.print("Telefono: ");
                  telefonos[contador] = sc.nextLine();
                  System.out.println("Guardado en la posicion: " + contador);
                  contador++;
              } else {
                  System.out.println("Memoria llena.");
              }
          }
          case 2 ->               {
                  
                  System.out.print("Ingrese el numero de lista (0-9): ");
                  int i = sc.nextInt();
                  if (i >= 0 && i < 10) {
                      System.out.println("Dato: " + nombres[i] + " - Tel: " + telefonos[i]);
                  }               }
          case 3 ->               {
                 
                  System.out.print("¿A que numero de lista cambia el nombre?: ");
                  int i = sc.nextInt();
                  sc.nextLine();
                  if (i >= 0 && i < 10) {
                      System.out.print("Nuevo nombre: ");
                      nombres[i] = sc.nextLine();
                  }               }
          case 4 ->               {
                  
                  System.out.print("¿A que numero de lista cambia el telefono?: ");
                  int i = sc.nextInt();
                  sc.nextLine();
                  if (i >= 0 && i < 10) {
                      System.out.print("Nuevo telefono: ");
                      telefonos[i] = sc.nextLine();
                  }               }
          case 5 ->               {
                  
                  System.out.print("Numero de lista a borrar: ");
                  int i = sc.nextInt();
                  if (i >= 0 && i < 10) {
                      nombres[i] = "Vacio";
                      telefonos[i] = "0";
                      System.out.println("Estudiante eliminado.");
                  }               }
          case 6 -> {
              
              System.out.println("\n--- LISTADO COMPLETO ---");
              for (int i = 0; i < 10; i++) {
                  
                  if (!nombres[i].equals("Vacio")) {
                      System.out.println(i + ". " + nombres[i] + " (" + telefonos[i] + ")");
                  }
              }
          }
          default -> {
          }
      }
        }
        System.out.println("Cerrando...");
    }
         public static void ejercicio2(){
      
        Scanner sc = new Scanner(System.in);

        
        int totalBoletasDisponibles = 20; 
        int limitePorPersona = 4;
        
        
        String[] cedulas = new String[50];
        int[] boletasCompradas = new int[50];
        int cantidadCompradores = 0;

        System.out.println("--- VENTA DE BOLETAS EN LÍNEA ---");

        while (totalBoletasDisponibles > 0) {
            System.out.println("\nBoletas disponibles: " + totalBoletasDisponibles);
            System.out.print("Ingrese su cédula de ciudadanía: ");
            String cedulaActual = sc.nextLine();

            
            int indiceEncontrado = -1;
            for (int i = 0; i < cantidadCompradores; i++) {
                if (cedulas[i].equals(cedulaActual)) {
                    indiceEncontrado = i;
                    break;
                }
            }

            if (indiceEncontrado != -1) {
               
                int yaTiene = boletasCompradas[indiceEncontrado];
                
                if (yaTiene >= limitePorPersona) {
                    System.out.println("VENTA RECHAZADA: Usted ya alcanzó el límite de " + limitePorPersona + " boletas.");
                } else {
                    int puedeComprar = limitePorPersona - yaTiene;
                    System.out.println("Usted ya tiene " + yaTiene + ". Solo puede comprar hasta " + puedeComprar + " más.");
                    System.out.print("¿Cuántas desea comprar?: ");
                    int cantidad = sc.nextInt(); sc.nextLine();

                    if (cantidad > 0 && cantidad <= puedeComprar && cantidad <= totalBoletasDisponibles) {
                        boletasCompradas[indiceEncontrado] += cantidad;
                        totalBoletasDisponibles -= cantidad;
                        System.out.println("Compra realizada con éxito.");
                    } else {
                        System.out.println("Cantidad no válida o supera el inventario.");
                    }
                }
            } else {
                
                System.out.print("¿Cuántas boletas desea comprar? (Máximo " + limitePorPersona + "): ");
                int cantidad = sc.nextInt(); sc.nextLine();

                if (cantidad > 0 && cantidad <= limitePorPersona && cantidad <= totalBoletasDisponibles) {
                   
                    cedulas[cantidadCompradores] = cedulaActual;
                    boletasCompradas[cantidadCompradores] = cantidad;
                    cantidadCompradores++;
                    
                    totalBoletasDisponibles -= cantidad;
                    System.out.println("Venta realizada. Total boletas vendidas: " + (20 - totalBoletasDisponibles));
                } else {
                    System.out.println("Cantidad no permitida.");
                }
            }
        }

        System.out.println("\n******************************************");
        System.out.println("TODAS LAS BOLETAS SE HAN AGOTADO. PROCESO FINALIZADO.");
        System.out.println("******************************************");
         }
}
      

