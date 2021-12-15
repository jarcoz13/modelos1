package ironman.logica.abstractFactory.fabricas;

import ironman.logica.abstractFactory.partes.casco.Casco;
import ironman.logica.abstractFactory.partes.casco.CascoNivel1;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
 */
public class FabricaMark2 implements FabricaAbstracta {
    @Override
    public Casco crearCasco() {
        return new CascoNivel1();
    }
}
