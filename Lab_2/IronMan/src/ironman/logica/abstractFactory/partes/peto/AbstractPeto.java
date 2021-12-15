package ironman.logica.abstractFactory.partes.peto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
 */
public abstract class AbstractPeto implements InterfacePeto {
    private List<String> caracteristicas;

    public AbstractPeto() {
        caracteristicas = new ArrayList<>();
    }

    public List <String> obtenerCaracteristicas(){
        return caracteristicas;
    }
}
