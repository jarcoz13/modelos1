package com.ud.mp.libreria;

import com.ud.mp.libreria.modelo.*;
import java.util.Scanner;

public class main {
    static Scanner sc;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        controlLibros conLib = new controlLibros();
        controlRevistas conRev = new controlRevistas();
        controlManuales conMan = new controlManuales();
        
        boolean seguimos;
        sc = new Scanner(System.in);
        do {            
            System.out.println(
                    "Bienvenido a nuestra biblioteca"
                    + "\n1\tListar inventario"
                    + "\n2\tAgregar Libro"
                    + "\n3\tRemover Libro"
                    + "\n4\tBuscar libros por título"
                    + "\n5\tBuscar libros por autor"
                    + "\n6\tBuscar libros por año"
            );
            
            int in = Integer.parseInt(sc.nextLine());
            
            switch(in){
                case 1:
                    System.out.println("Listando...");
                    conLib.mostrarTodo();
                    break;
                case 2:
                    System.out.println("Ingrese los datos del libro");
                    agregarLibro();
                    break;
                case 3:
                    System.out.println("Ingrese el titulo del libro a retirar");
                    break;
                case 4:
                    System.out.println("Ingrese el titulo del libro a buscar");
                    break;
                case 5:
                    System.out.println("Ingrese el autor del libro a buscar");
                    break;
                case 6:
                    System.out.println("Ingrese el año del libro a buscar");
                    break;
                default:
                    System.out.println("Ingrese un valor predeterminado.");
                    break;
            }
            
            seguimos = true;
        } while (seguimos);
        sc.close();
    }
    private static void agregarLibro(){
        int id = Integer.parseInt(sc.nextLine());
        // = Integer.parseInt(sc.nextLine());
        //int id = Integer.parseInt(sc.nextLine());
        
    }
}
