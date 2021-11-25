package com.ud.mp.libreria.controladores;

import com.ud.mp.libreria.logica.Libro;
import java.util.ArrayList;
import java.util.List;

public class controlLibros extends ControladorGenerico<Libro>{
    private List<Libro> libros;

    public controlLibros() {
        this.libros = new ArrayList<>();
        
        //new Libro(editorial, libros.size(), title, stock, author, fechaPub)
        libros.add(new Libro("1", libros.size(), "La tregua", 4, "Mario Benedetti", 1974)); //1974
        libros.add(new Libro("1", libros.size(), "El búfalo de la noche", 3, "Guillermo Arriaga", 1999));//1999, 
        libros.add(new Libro("1", libros.size(), "Rayuela", 5, "Julio Cortazar", 1963)); //1963
        libros.add(new Libro("1", libros.size(), "Un mundo feliz", 6, "Aldous Huxley", 1932));//1932, 
        libros.add(new Libro("1", libros.size(), "Akelarre", 4, "Mario Mendoza", 2020));//2020, 
        libros.add(new Libro("1", libros.size(), "El principito", 100, "Antoine de Saint-Exupéry", 1943));//1943, 
        libros.add(new Libro("1", libros.size(), "100 años de soledad", 23, "Gabriel García Márquez", 1967));//1967, 
        libros.add(new Libro("1", libros.size(), "La mala obra", 4, "Gabriel García Márquez", 1962));//1962, 
        libros.add(new Libro("1", libros.size(), "El coronel no tiene quien le escriba", 7, "Gabriel García Márquez", 1961));//1961, 
    }
    
    @Override
    public List<Libro> getElements() {
        return libros;
    }

    @Override
    public void listarTodo() {
        for (Libro book : libros)
            book.imprimir();
    }
    
    public void agregarNuevoElemento( String title, String author, int stock, int anio, String editorial) {
        super.agregarNuevoElemento(new Libro(editorial, getElements().size(),title, stock, author, anio));
    }
    
    @Override
    public void agregarNuevoElemento(String title, int stock, String author, int anio) {
        super.agregarNuevoElemento(new Libro(getElements().size(),title, stock, author, anio));
    }

    @Override
    public boolean prestamoElementos(String titulo, String autor, int cantidad){
        Libro libro = obtenerElemento(titulo, autor);
        if(libro != null){
           return libro.prestamoElementos(cantidad); 
       } else {
            System.out.println("No existe el libro: "+ titulo);
            return false;
        } 
    }
    
    @Override
    public boolean devolverElementos(String titulo, String autor, int cantidad) {
        Libro libro = obtenerElemento(titulo, autor);
        if(libro != null){
            System.out.println("Libro devuelto. \nTítulo: " + titulo + ".");
            libro.agregarElementos(cantidad);
            return true;
        } else {
            System.out.println("Verfica que el libro sea de nuestra biblioteca.");
            return false;
        }
    }

    @Override
    public boolean retirarElemento(String titulo, String autor) {
        Libro libro = obtenerElemento(titulo, autor);
        if(libro != null){
            System.out.println("Libro retirado.\nTítulo: " + titulo + ".");
            super.retirarElemento(libro);
            return true;
        } else {
            System.out.println("NO tenemos el libro en nuestro inventario.\nTitúlo: " + titulo + ".");
            return false;
        }
             
    }

    @Override
    public Libro obtenerElemento(String title, String autor) {
        for (Libro libro : libros) {
            if(libro.getTitulo().equals(title) && libro.getAutor().equals(autor)){
                return libro;
            }
        }
        return null;
    }

    @Override
    public void imprimirElemento(String title) {
        for (Libro libro : libros) {
            if(libro.getTitulo().equals(title)){
                libro.imprimir();
            }
        }
    }
}
