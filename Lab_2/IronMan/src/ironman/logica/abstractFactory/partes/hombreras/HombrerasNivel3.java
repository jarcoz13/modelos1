package ironman.logica.abstractFactory.partes.hombreras;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
 */
public class HombrerasNivel3 extends HombrerasNivel2 {
    public HombrerasNivel3(){
        super();
    }

    @Override
    public String operacion() {
        return "Creando hombreras nivel 3"; 
    }
}
