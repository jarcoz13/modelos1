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
public class CascoNivel3 extends Casco {
    public CascoNivel3(){
        super();
        super.obtenerCaracteristicas().add("Energía nuclear");
    }

    @Override
    void operacion() {
        System.out.println("Creando casco convencional"); 
    }
    
}
