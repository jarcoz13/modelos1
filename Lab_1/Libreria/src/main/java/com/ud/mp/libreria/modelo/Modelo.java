/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ud.mp.libreria.modelo;

import com.ud.mp.libreria.controladores.controlLibros;
import com.ud.mp.libreria.controladores.controlManuales;
import com.ud.mp.libreria.controladores.controlRevistas;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Modelo {
    private Scanner sc;
    
    public void start(){
        controlLibros conLib = new controlLibros();
        controlRevistas conRev = new controlRevistas();
        controlManuales conMan = new controlManuales();
        
        boolean seguimos;
        sc = new Scanner(System.in);
        do {            
            System.out.println(
                    "Bienvenido a nuestra biblioteca"
                    + "\n1\tListar inventario"
                    + "\n2\tAgregar Elemento"
                    + "\n3\tRemover Elemento"
                    + "\n4\tBuscar Elemento por título"
                    + "\n5\tBuscar Elemento por autor"
                    + "\n6\tBuscar Elemento por año"
            );
            
            int in = Integer.parseInt(sc.nextLine());
            
            switch(in){
                case 1:
                    System.out.println("Listar\n1.\tTodo\n2.\tLibros\n3.\tRevistas\n4.\tManuales");
                    int ca = Integer.parseInt(sc.nextLine());
                    System.out.println("Mostrando ");
                    if ( ca == 1){
                        conLib.mostrarTodo();
                        conMan.mostrarTodo();
                        conRev.mostrarTodo();
                    } else if (ca == 2){
                        conLib.mostrarTodo();
                    }else if (ca == 3){
                        conRev.mostrarTodo();
                    }else if (ca == 4){
                        conMan.mostrarTodo();
                    }
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
    
    private int devolverTipo(){
        int salida = 0;
        do{
            System.out.println("Eliga el tipo de elemento\n1.\tLibro\n2.\tRevistas\n4.\tManuales");
                    
            
        }while();
    } 
    
    private void agregarLibro(){
        int id = Integer.parseInt(sc.nextLine());
           
    }
}
