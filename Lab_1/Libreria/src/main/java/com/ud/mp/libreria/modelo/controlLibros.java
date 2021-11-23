package com.ud.mp.libreria.modelo;

import com.ud.mp.libreria.logica.Libro;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class controlLibros {
    private List<Libro> libros;

    public controlLibros() {
        this.libros = new ArrayList<>();
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy"); 
        try {
            //new Libro(editorial, libros.size(), title, stock, author, fechaPub)
            libros.add(new Libro("1", libros.size(), "La tregua", 4, "Mario Benedetti", objSDF.parse("01-01-1974"))); //1974
            libros.add(new Libro("1", libros.size(), "El búfalo de la noche", 3, "Guillermo Arriaga", objSDF.parse("01-01-1999")));//1999, 
            libros.add(new Libro("1", libros.size(), "Rayuela", 5, "Julio Cortazar", objSDF.parse("01-01-1963"))); //1963
            libros.add(new Libro("1", libros.size(), "Un mundo feliz", 6, "Aldous Huxley", objSDF.parse("01-01-1932")));//1932, 
            libros.add(new Libro("1", libros.size(), "Akelarre", 4, "Mario Mendoza", objSDF.parse("01-01-2020")));//2020, 
            libros.add(new Libro("1", libros.size(), "El principito", 100, "Antoine de Saint-Exupéry", objSDF.parse("01-01-1943")));//1943, 
            libros.add(new Libro("1", libros.size(), "100 años de soledad", 23, "Gabriel García Márquez", objSDF.parse("01-01-1967")));//1967, 
            libros.add(new Libro("1", libros.size(), "La mala obra", 4, "Gabriel García Márquez", objSDF.parse("01-01-1962")));//1962, 
            libros.add(new Libro("1", libros.size(), "El coronel no tiene quien le escriba", 7, "Gabriel García Márquez", objSDF.parse("01-01-1961")));//1961, 
        } catch (ParseException ex) {
            System.out.println("No se lograron agregar elementos a la lista");
        }
        
    }

    public void mostrarTodo(){
        for (Libro book : libros)
            imprimirLibro(book);
    }
    /*
        agregar nuevo libro a la lista
    **/
    public void agregarNuevoLibro(int stock, String title, String author, Date fechaPub, String editorial){
        for (Libro book : libros) {
            if (book.getAuthor().equals(author) && book.getTitle().equals(title)){
                System.out.println("Ya existe el libro " + title + ".\nSe agrego al inventario.");
                book.setStock(book.getStock() + stock);
                return;
            }
        }
        libros.add(new Libro(editorial, libros.size(), title, stock, author, fechaPub));
    }
    
    public boolean devolucionLibro(String title, String author){
        for (Libro book : libros) {
            if (book.getAuthor().equals(author) && book.getTitle().equals(title)){
                System.out.println("Libro recibido.\nTitúlo: " + title + ".");
                book.setStock(book.getStock() + 1);
                return true;
            }
        }
        System.out.println("Verfica que el libro sea de nuestra biblioteca.");
        return false; 
    }
    
    public boolean retirarLibro(String title, String autor){
        for (Libro book : libros) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(autor)){
                System.out.println("Libro retirado.\nTitúlo: " + title + ".");
                book.setStock(book.getStock() -1);
                return true;
            }
        }
        System.out.println("NO tenemos el libro en nuestro inventario.\nTitúlo: " + title + ".");
        return false; 
    }
    
    public void buscarLibroPorTitulo(String title){
        for (Libro book : libros) {
            if (book.getTitle().equals(title)){
                imprimirLibro(book);
            }
        }
    }
    
    public void buscarLibroPorAutor(String author){
        for (Libro book : libros) {
            if (book.getAuthor().equals(author)){
                imprimirLibro(book);
            }
        }
    }
    private void imprimirLibro(Libro book){
        System.out.println("----------------------------------"
                + "\nId:\t" + book.getId()
                +"\nTitúlo:\t" + book.getTitle() 
                +"\nAutor:\t" + book.getAuthor()
                +"\nInventario:\t" + book.getStock()
                +"\nFecha Publicaciòn:\t" + book.getPublicationDate().toString()
                +"\nEditorial:\t " + book.getEditorial()
                +"\n----------------------------------");
    }
    
    public void buscarLibroPorEditorial(String editorial){
        for (Libro book : libros) {
            if (book.getEditorial().equals(editorial)){
                imprimirLibro(book);
            }
        }
    }
}
