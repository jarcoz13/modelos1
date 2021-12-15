package ironman.logica.abstractFactory.partes.hombreras;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
 */
public class HombrerasNivel1 extends HombrerasConvencionales {
    public HombrerasNivel1(){
        super();
    }

    @Override
    public String operacion() {
        return "Creando hombreras Nivel 1"; 
    }
}
