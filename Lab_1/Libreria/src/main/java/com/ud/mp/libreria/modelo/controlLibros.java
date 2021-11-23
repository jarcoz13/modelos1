package com.ud.mp.libreria.modelo;

import com.ud.mp.libreria.logica.Libro;
import com.ud.mp.libreria.logica.Manual;
import com.ud.mp.libreria.logica.Revista;
import com.ud.mp.libreria.logica.elementoBibliotecario;
import java.util.ArrayList;
import java.util.List;

public class controlLibros {
    private List<elementoBibliotecario> todo; 
    private List<Libro> libros;
    private List<Revista> revistas;
    private List<Manual> manuales;
    

    public controlLibros() {
        this.libros = new ArrayList<Libro>();
        libros.add(new Libro(libros.size(), 4, "Mario Benedetti", "La tregua")); //1974
        libros.add(new Libro(libros.size(), 3, "Guillermo Arriaga", "El búfalo de la noche"));//1999, 
        libros.add(new Libro(libros.size(), 5, "Julio Cortazar", "Rayuela")); //1963
        libros.add(new Libro(libros.size(), 6, "Aldous Huxley", "Un mundo feliz"));//1932, 
        libros.add(new Libro(libros.size(), 4, "Mario Mendoza", "Akelarre"));//2020, 
        libros.add(new Libro(libros.size(), 100, "Antoine de Saint-Exupéry", "El principito"));//1943, 
        libros.add(new Libro(libros.size(), 23, "Gabriel García Márquez", "100 años de soledad"));//1967, 
        libros.add(new Libro(libros.size(), 4, "Gabriel García Márquez", "La mala obra"));//1962, 
        libros.add(new Libro(libros.size(), 7, "Gabriel García Márquez", "El coronel no tiene quien le escriba"));//1961, 
        
        this.revistas = new ArrayList<Revista>();
        revistas.add(new Revista(revistas.size(), "Biomédica", 10, "Instituto Nacional de Salud", "Colombia", "Salud"));
    }
    
    public List<elementoBibliotecario> getTodo() {
        return todo;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Revista> getRevistas() {
        return revistas;
    }

    public List<Manual> getManuales() {
        return manuales;
    }
    /*
        agregar nuevo libro a la lista
    **/
    public void agregarNuevoLibro(int stock, String title, String author){
        for (Libro book : libros) {
            if (book.getAuthor().equals(author) && book.getTitle().equals(title)){
                System.out.println("Ya existe el libro " + title + ".\nSe agrego al inventario.");
                book.setStock(book.getStock() + 1);
                return;
            }
        }
        libros.add(new Libro(libros.size(), stock,  author, title));
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
    
    public void buscarLibroPorEditorial(String editorial){
        for (Libro book : libros) {
            if (book.getEditorial().equals(editorial)){
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
                        +"\nTitúlo:\t" + book.getTitle() 
                        +"\nAutor:\t" + book.getAuthor()
                        +"\nInventario:\t" + book.getStock()
                        +"\n----------------------------------");
    }
}
