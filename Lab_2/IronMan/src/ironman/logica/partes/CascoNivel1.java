/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ironman.logica.partes;

/**
 *
 * @author NATHALIA
 */
public class CascoNivel1 extends CascoConvencional {
    public CascoNivel1(){
        super();
        super.obtenerCaracteristicas().add("Energía nuclear");
    }

    @Override
    void operacion() {
        System.out.println("Creando casco Nivel 1"); 
    }
    
}
