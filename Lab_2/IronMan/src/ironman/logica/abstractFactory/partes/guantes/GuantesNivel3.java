package ironman.logica.abstractFactory.partes.guantes;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
 */
public class GuantesNivel3 extends GuantesNivel2 {
    public GuantesNivel3(){
        super();
    }

    @Override
    public String operacion() {
        return "Creando guante nivel 3"; 
    }
}
