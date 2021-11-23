package com.ud.mp.libreria;

import java.util.Scanner;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguimos;
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("Bienvenido a nuestra biblioteca");
            System.out.println("1\tListar inventario");
            System.out.println("2\tAgregar Libro");
            System.out.println("3\tRemover Libro");
            System.out.println("4\tBuscar libros por título");
            System.out.println("5\tBuscar libros por autor");
            System.out.println("6\tBuscar libros por año");
            
            int in = sc.nextInt();
            
            switch(in){
                case 1:
                    System.out.println("Listando...");
                    break;
                case 2:
                    System.out.println("Ingrese los datos del libro");
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
                    
            }
            
            seguimos = true;
        } while (seguimos);
    }
        
}
