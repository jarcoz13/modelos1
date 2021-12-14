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
public class CascoNivel2 extends CascoNivel1 {
    public CascoNivel2(){
        super();
        super.obtenerCaracteristicas().add("Sistemas de micro engranajes");
    }

    @Override
    void operacion() {
        System.out.println("Creando casco Nivel 2"); 
    }
    
}
