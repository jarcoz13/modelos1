package com.ud.mp.libreria.controladores;

import java.util.List;

public abstract class ControladorGenerico<T> implements ControladorGenericoInterface<T>{
    @Override
    public abstract List<T> getElements();    
    
    public void agregarNuevoElemento(T element) {
        if(!getElements().contains(element)) {
            System.out.println("Se agrego el elemento");
            getElements().add(element);
        } else {
            System.out.println("Ya existe el elemento");
        }
    }
    public boolean retirarElemento(T element) {
        if(getElements().contains(element)) {
            System.out.println("Eliminando elemento");
           getElements().remove(element);
           return true;
        } else {
            System.out.println("No existe el elemento");
            return false;
        }
    }
}
