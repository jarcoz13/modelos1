package ironman.logica.partes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
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
