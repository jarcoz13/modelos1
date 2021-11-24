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
    private controlLibros manejadorLibros = new controlLibros();
    private controlRevistas manejadorRevistas = new controlRevistas();
    private controlManuales manejadorManuales = new controlManuales();
    private Scanner sc;
    
    public void start(){
        int tipo;
        
        
        boolean seguimos;
        sc = new Scanner(System.in);
        do {            
            System.out.println(
                    "Bienvenido a nuestra biblioteca"
                    + "\n1\tListar inventario"
                    + "\n2\tAgregar Elemento"
                    + "\n3\tRemover Elemento"
                    + "\n4\tBuscar"
            );
            
            int in = Integer.parseInt(sc.nextLine());
            
            switch(in){
                case 1:
                    System.out.println("Listar\n1.\tTodo\n2.\tLibros\n3.\tRevistas\n4.\tManuales");
                    int ca = Integer.parseInt(sc.nextLine());
                    System.out.println("Mostrando ");
                    if ( ca == 1){
                        manejadorLibros.mostrarTodo();
                        manejadorManuales.mostrarTodo();
                        manejadorRevistas.mostrarTodo();
                    } else if (ca == 2){
                        manejadorLibros.mostrarTodo();
                    }else if (ca == 3){
                        manejadorRevistas.mostrarTodo();
                    }else if (ca == 4){
                        manejadorManuales.mostrarTodo();
                    }
                    break;
                case 2:
                    System.out.println("Eliga el tipo de elemento que va a AGREGAR");
                    tipo = devolverTipo();
                    if( tipo == 1 )
                        agregarLibro();
                    else if( tipo == 2 )
                        agregarRevista();
                    else if( tipo == 3 )
                        agregarManual();
                    break;
                case 3:
                    System.out.println("Eliga el tipo de elemento que va a DAR DE BAJA");
                    tipo = devolverTipo();
                    if( tipo == 1 )
                        eliminarLibro();
                    else if( tipo == 2 )
                        manejadorRevistas.retirarRevista(obtenerTitulo());
                    else if( tipo == 3 )
                        manejadorManuales.retirarManual(obtenerTitulo());
                    break;
                case 4:
                    System.out.println("¿Que desea buscar?");
                    tipo = devolverTipo();
                    //System.out.println("");
                    if( tipo == 1 )
                        manejadorLibros.buscarLibroPorTitulo(obtenerTitulo());
                    else if( tipo == 2 )
                        manejadorRevistas.buscarRevistaPorTitulo(obtenerTitulo());
                    else if( tipo == 3 )
                        manejadorManuales.buscarManualPorTitulo(obtenerTitulo());
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
            System.out.println("Eliga el tipo de elemento\n1.\tLibro\n2.\tRevista\n3.\tManual");
            salida = Integer.parseInt(sc.nextLine());
        }while(salida < 1 || salida > 3);
        return salida;
    } 
    
    private void agregarLibro(){
        
        System.out.println("Ingrese el titúlo del libro: ");
        String title = sc.nextLine();
        
        System.out.println("Ingrese el nombre del autor(a) del libro: ");
        String autor = sc.nextLine();
        
        System.out.println("Ingrese el nombre de la editorial del libro: ");
        String editorial = sc.nextLine();
        
        System.out.println("Ingrese el año de publicación del libro: ");
        int anio = Integer.parseInt(sc.nextLine());
        
        System.out.println("Ingrese la cantidad de ejemplares que va a ingresar del libro "+ title+ " " + autor +": ");
        int stock = Integer.parseInt(sc.nextLine());
        
        manejadorLibros.agregarNuevoLibro(stock, title, autor, anio, editorial);
    }
    
    private void agregarRevista(){
        
        System.out.println("Ingrese el titúlo de la revista: ");
        String title = sc.nextLine();
        
        System.out.println("Ingrese el nombre del autor(a) de la revista: ");
        String autor = sc.nextLine();
        
        System.out.println("Ingrese la categoria de la revista: ");
        String categoria = sc.nextLine();
        
        System.out.println("Ingrese el país de la revista: ");
        String pais = sc.nextLine();
        
        System.out.println("Ingrese el año de publicación de la revista: ");
        int anio = Integer.parseInt(sc.nextLine());
        
        System.out.println("Ingrese la cantidad de ejemplares que va a ingresar de la revista "+ title+ " " + autor +": ");
        int stock = Integer.parseInt(sc.nextLine());
        
        manejadorRevistas.agregarNuevoRevista(pais, categoria, title, stock, autor, anio);
                
    }
    
    private void agregarManual(){
        
        System.out.println("Ingrese el titúlo del manual: ");
        String title = sc.nextLine();
        
        System.out.println("Ingrese el nombre del autor(a) del manual: ");
        String autor = sc.nextLine();
        
        System.out.println("Ingrese el dispositivo al cual corresponde el manual: ");
        String dispositivo = sc.nextLine();
        
        System.out.println("Ingrese el país del manual: ");
        String pais = sc.nextLine();
        
        System.out.println("Ingrese el año de publicación del manual: ");
        int anio = Integer.parseInt(sc.nextLine());
        
        System.out.println("Ingrese la cantidad de ejemplares que va a ingresar del manual "+ title+ " " + autor +": ");
        int stock = Integer.parseInt(sc.nextLine());
        
        manejadorManuales.agregarNuevoManual(dispositivo, pais, title, stock, autor, anio);
        ;
    }
    
    private void eliminarLibro(){
        System.out.println("Ingrese el titúlo de la revista a eliminar: ");
        String titulo = sc.nextLine();
        
        System.out.println("Ingrese el nombre del autor(a) del objeto a eliminar: ");
        String autor = sc.nextLine();
        
        manejadorLibros.retirarLibro(titulo, autor);
    }
    
    private String obtenerTitulo(){
        System.out.println("Ingrese el titúlo del objeto: ");
        return sc.nextLine();
    }
    
}
