package com.ud.mp.libreria.modelo;

import com.ud.mp.libreria.controladores.controlLibros;
import com.ud.mp.libreria.controladores.controlManuales;
import com.ud.mp.libreria.controladores.controlRevistas;
import java.util.Scanner;

public class Modelo {
    private final controlLibros manejadorLibros;
    private final controlRevistas manejadorRevistas;
    private final controlManuales manejadorManuales;
    private Scanner sc;
    
    public Modelo(){
        manejadorLibros = new controlLibros();
        manejadorRevistas = new controlRevistas();
        manejadorManuales = new controlManuales();
        sc = new Scanner(System.in);
    }
    
    public void start(){
        int tipo;
        int opcion;
        boolean seguimos = true;
        
        do {            
            System.out.println(
                    "Bienvenido a nuestra biblioteca"
                    + "\nElija una opción"
                    + "\n1.\tListar inventario"
                    + "\n2.\tAgregar Elemento"
                    + "\n3.\tPrestamo de Elemento"
                    + "\n4.\tRemover Elemento"
                    + "\n5.\tBuscar"
                    + "\n6.\tSalir"
            );
            
            opcion  = Integer.parseInt(sc.nextLine());
            
            switch(opcion){
                case 1:
                    System.out.println("Listar\n1.\tTodo\n2.\tLibros\n3.\tRevistas\n4.\tManuales");
                    int ca = Integer.parseInt(sc.nextLine());
                    System.out.println("Mostrando... ");
                    if ( ca == 1){
                        manejadorLibros.listarTodo();
                        manejadorManuales.listarTodo();
                        manejadorRevistas.listarTodo();
                    } else if (ca == 2){
                        manejadorLibros.listarTodo();
                    }else if (ca == 3){
                        manejadorRevistas.listarTodo();
                    }else if (ca == 4){
                        manejadorManuales.listarTodo();
                    }
                    break;
                case 2:
                    System.out.println("Elija el tipo de elemento que va a AGREGAR");
                    tipo = devolverTipo();
                    if( tipo == 1 )
                        agregarLibro();
                    else if( tipo == 2 )
                        agregarRevista();
                    else if( tipo == 3 )
                        agregarManual();
                    break;
                case 3:
                    System.out.println("Elija el tipo de elemento que va a PEDIR PRESTADO");
                    tipo = devolverTipo();
                    if( tipo == 1 )
                        pedirLibro();
                    else if( tipo == 2 )
                        pedirRevista();
                    else if( tipo == 3 )
                        pedirManual();
                    break;
                case 4:
                    System.out.println("Elija el tipo de elemento que va a DAR DE BAJA");
                    tipo = devolverTipo();
                    if( tipo == 1 )
                        manejadorLibros.retirarElemento(obtenerTitulo(), obtenerAutor());
                    else if( tipo == 2 )
                        manejadorRevistas.retirarElemento(obtenerTitulo(), obtenerAutor());
                    else if( tipo == 3 )
                        manejadorManuales.retirarElemento(obtenerTitulo(), obtenerAutor());
                    break;
                case 5:
                    System.out.println("¿Que desea buscar?");
                    tipo = devolverTipo();
                    //System.out.println("");
                    if( tipo == 1 )
                        manejadorLibros.imprimirElemento(obtenerTitulo());
                    else if( tipo == 2 )
                        manejadorRevistas.imprimirElemento(obtenerTitulo());
                    else if( tipo == 3 )
                        manejadorManuales.imprimirElemento(obtenerTitulo());
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    seguimos = false;
                    break;
                default:
                    System.out.println("Ingrese un valor predeterminado.");
                    break;
            }
        } while (seguimos);
        sc.close();
    }
    
    private int devolverTipo(){
        int salida = 0;
        do{
            System.out.println("1.\tLibro\n2.\tRevista\n3.\tManual");
            salida = Integer.parseInt(sc.nextLine());
        }while(salida < 1 || salida > 3);
        return salida;
    } 
    
    private String[] datosBasicos(String tipo){
        String [] datos = new String[4];
        
        if(tipo.equals("revista")){
            tipo = "de la " + tipo;
        } else {
            tipo = "del " + tipo;
        }
        
        System.out.println("Ingrese el título "+tipo+": ");
        datos[0] = sc.nextLine();
        
        System.out.println("Ingrese el nombre del autor(a) "+tipo+": ");
        datos[1] = sc.nextLine();
        
        System.out.println("Ingrese el año de publicación "+tipo+": ");
        datos[2] = sc.nextLine();
        
        System.out.println("Ingrese la cantidad de ejemplares que va a ingresar " + tipo + " " + datos[0] + ": ");
        datos[3] = sc.nextLine();
        
        return datos;
    }
    
    private void agregarLibro(){
        
        String datos[] = datosBasicos("libro");
        
        System.out.println("Ingrese el nombre de la editorial del libro: ");
        String editorial = sc.nextLine();
        
        manejadorLibros.agregarNuevoElemento(
                datos[0], 
                datos[1], 
                Integer.parseInt(datos[3]), 
                Integer.parseInt(datos[2]), 
                editorial
        );
    }
    
    private void agregarRevista(){
        String datos[] = datosBasicos("revista");
        
        System.out.println("Ingrese la categoria de la revista: ");
        String categoria = sc.nextLine();
        
        System.out.println("Ingrese el país de la revista: ");
        String pais = sc.nextLine();
        
        manejadorRevistas.agregarNuevoElemento(
                pais, 
                categoria, 
                datos[0], 
                datos[1], 
                Integer.parseInt(datos[3]), 
                Integer.parseInt(datos[2])
        );
                
    }
    
    private void agregarManual(){
        String datos[] = datosBasicos("manual");
        
        System.out.println("Ingrese el dispositivo al cual corresponde el manual: ");
        String dispositivo = sc.nextLine();
        
        System.out.println("Ingrese el país del manual: ");
        String pais = sc.nextLine();

        manejadorManuales.agregarNuevoElemento(
                dispositivo, 
                pais, 
                datos[0], 
                Integer.parseInt(datos[3]), 
                datos[1], 
                Integer.parseInt(datos[2])
        );
    }
       
    private String obtenerTitulo(){
        System.out.println("Ingrese el titúlo del objeto: ");
        return sc.nextLine();
    }
    private String obtenerAutor(){
        System.out.println("Ingrese el nombre del autor del objeto: ");
        return sc.nextLine();
    }
    
    
    private void pedirLibro(){
        System.out.println("Ingrese la cantidad de libros a retirar: ");
        int cantidad = Integer.parseInt(sc.nextLine());
        manejadorLibros.prestamoElementos(obtenerTitulo(), obtenerAutor(), cantidad);
    }

    private void pedirRevista() {
        System.out.println("Ingrese la cantidad de revistas a retirar: ");
        int cantidad = Integer.parseInt(sc.nextLine());
        manejadorRevistas.prestamoElementos(obtenerTitulo(), obtenerAutor(), cantidad);
    }

    private void pedirManual() {
        System.out.println("Ingrese la cantidad de manuales a retirar: ");
        int cantidad = Integer.parseInt(sc.nextLine());
        manejadorManuales.prestamoElementos(obtenerTitulo(), obtenerAutor(), cantidad);
    }
}
