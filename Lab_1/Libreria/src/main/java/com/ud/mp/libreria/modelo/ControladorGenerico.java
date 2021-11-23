package com.ud.mp.libreria.modelo;

import com.ud.mp.libreria.logica.elementoBibliotecario;
import java.util.List;


public abstract class ControladorGenerico<T> implements ControladorGenericoInterface<T>{

    public abstract List<T> getElements();

    @Override
    public void listarTodo() {
        for (T element : getElements()) {
            System.out.println("----------------------------------"
                         +"\n" + element.toString()
                        +"\n----------------------------------");
        }
    }

    public void agregarNuevoElemento(T element) {
        getElements().add(element);
    }

    @Override
    public boolean devolucionElemento(String titulo, String autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retirarElemento(String titulo, String autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarElementoPorTitulo(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarElementoPorAutor(String autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimirElemento(T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
