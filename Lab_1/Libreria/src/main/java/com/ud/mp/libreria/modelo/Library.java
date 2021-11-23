package com.ud.mp.libreria.modelo;

import com.ud.mp.libreria.logica.Libro;
import com.ud.mp.libreria.logica.Manual;
import com.ud.mp.libreria.logica.Revista;
import com.ud.mp.libreria.logica.elementoBibliotecario;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<elementoBibliotecario> todo; 
    private List<Libro> libros;
    private List<Revista> revistas;
    private List<Manual> manuales;
    

    public Library() {
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
    
    public List<Libro> getBooks(){
        return libros;
    }
    /*
        agregar nuevo libro a la lista
    **/
    public boolean saveBook(int stock, int year, String title, String author){
        for (Libro book : libros) {
            if (book.getAuthor().equals(author) && book.getTitle().equals(title)){
                return false;
            }
        }
        libros.add(new Libro(libros.size(), stock,  author, year, title));
        return true; 
    }
    
    public boolean removeBook(String title){
        for (Libro book : libros) {
            if (book.getTitle().equals(title)){
                libros.remove(book);
                return true;
            }
        }
        return false; 
    }
    
    public List<Libro> searchBooksByTitle(String title){
        List<Libro> find = new ArrayList<Libro>();;
        for (Libro book : libros) {
            if (book.getTitle().equals(title)){
                find.add(book);
            }
        }
        return find;
    }
    
    public List<Libro> searchBooksByYear(int year){
        List<Libro> find = new ArrayList<Libro>();;
        for (Libro book : libros) {
            if (book.getYear() == year){
                find.add(book);
            }
        }
        return find;
    }
    
    public List<Libro> searchBooksByAuthor(String author){
        List<Libro> find = new ArrayList<Libro>();;
        for (Libro book : libros) {
            if (book.getAuthor().equals(author)){
                find.add(book);
            }
        }
        return find;
    }
}
