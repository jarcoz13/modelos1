package ironman.logica.abstractFactory.fabricas;

import ironman.logica.abstractFactory.partes.casco.Casco;
import ironman.logica.abstractFactory.partes.casco.CascoConvencional;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
 */
public class FabricaMark1 implements FabricaAbstracta {
    @Override
    public Casco crearCasco() {
        return new CascoConvencional();
    }
}
