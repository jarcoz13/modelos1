package com.ud.mp.libreria.logica;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
        books.add(new Book(books.size(), 4, "Mario Benedetti", 1974, "La tregua"));
        books.add(new Book(books.size(), 3, "Guillermo Arriaga", 1999, "El búfalo de la noche"));
        books.add(new Book(books.size(), 5, "Julio Cortazar", 1963, "Rayuela"));
        books.add(new Book(books.size(), 6, "Aldous Huxley", 1932, "Un mundo feliz"));
        books.add(new Book(books.size(), 4, "Mario Mendoza", 2020, "Akelarre"));
        books.add(new Book(books.size(), 100, "Antoine de Saint-Exupéry", 1943, "El principito"));
        books.add(new Book(books.size(), 23, "Gabriel García Márquez", 1967, "100 años de soledad"));
        books.add(new Book(books.size(), 4, "Gabriel García Márquez", 1962, "La mala obra"));
        books.add(new Book(books.size(), 7, "Gabriel García Márquez", 1961, "El coronel no tiene quien le escriba"));
    }
    
    public List<Book> getBooks(){
        return books;
    }
    
    public boolean saveBook(int stock, int year, String title, String author){
        for (Book book : books) {
            if (book.getAuthor().equals(author) && book.getTitle().equals(title)){
                return false;
            }
        }
        books.add(new Book(books.size(), stock,  author, year, title));
        return true; 
    }
    
    public boolean removeBook(String title){
        for (Book book : books) {
            if (book.getTitle().equals(title)){
                books.remove(book);
                return true;
            }
        }
        return false; 
    }
    
    public List<Book> searchBooksByTitle(String title){
        List<Book> find = new ArrayList<Book>();;
        for (Book book : books) {
            if (book.getTitle().equals(title)){
                find.add(book);
            }
        }
        return find;
    }
    
    public List<Book> searchBooksByYear(int year){
        List<Book> find = new ArrayList<Book>();;
        for (Book book : books) {
            if (book.getYear() == year){
                find.add(book);
            }
        }
        return find;
    }
    
    public List<Book> searchBooksByAuthor(String author){
        List<Book> find = new ArrayList<Book>();;
        for (Book book : books) {
            if (book.getAuthor().equals(author)){
                find.add(book);
            }
        }
        return find;
    }
}
