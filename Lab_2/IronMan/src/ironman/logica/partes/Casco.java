/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ironman.logica.partes;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author NATHALIA
 */
public abstract class Casco{
    private List<String> caracteristicas;

    public Casco () {
        caracteristicas = new ArrayList<>();
        caracteristicas.add("Mascara");
        caracteristicas.add("Protector cerebral");        
    }
   
    abstract void operacion();
    public List <String> obtenerCaracteristicas(){
    return caracteristicas;
    }
    
}
