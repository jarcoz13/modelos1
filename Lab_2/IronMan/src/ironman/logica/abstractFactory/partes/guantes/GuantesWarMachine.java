package ironman.logica.abstractFactory.partes.guantes;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
 */
public class GuantesWarMachine extends GuantesNivel3 {
    public GuantesWarMachine(){
        super();
    }

    @Override
    public String operacion() {
        return "Creando guante War Machine"; 
    }
}
