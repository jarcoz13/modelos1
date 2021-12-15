package ironman.logica.abstractFactory.partes.peto;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
 */
public class PetoWarMachine extends PetoNivel3 {
    public PetoWarMachine(){
        super();
    }

    @Override
    public String operacion() {
        return "Creando peto War Machine"; 
    }
}
