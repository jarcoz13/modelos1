/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ud.mp.libreria.modelo;

import com.ud.mp.libreria.logica.Revista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class controlRevistas {
    private List<Revista> revistas;
    public controlRevistas() {
        this.revistas = new ArrayList<Revista>();
        revistas.add(new Revista(revistas.size(), "Biomédica", 10, "Instituto Nacional de Salud", "Colombia", "Salud"));
        revistas.add(new Revista(revistas.size(), "Biomédica", 10, "Instituto Nacional de Salud", "Colombia", "Salud"));
        revistas.add(new Revista(revistas.size(), "Biomédica", 10, "Instituto Nacional de Salud", "Colombia", "Salud"));
        revistas.add(new Revista(revistas.size(), "Biomédica", 10, "Instituto Nacional de Salud", "Colombia", "Salud"));
        revistas.add(new Revista(revistas.size(), "Biomédica", 10, "Instituto Nacional de Salud", "Colombia", "Salud"));
        revistas.add(new Revista(revistas.size(), "Biomédica", 10, "Instituto Nacional de Salud", "Colombia", "Salud"));
    }
    
}
