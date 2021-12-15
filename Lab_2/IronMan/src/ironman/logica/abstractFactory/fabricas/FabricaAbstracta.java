package ironman.logica.abstractFactory.fabricas;

import ironman.logica.abstractFactory.partes.botas.AbstractBotas;
import ironman.logica.abstractFactory.partes.casco.AbstractCasco;
import ironman.logica.abstractFactory.partes.guantes.AbstractGuantes;
import ironman.logica.abstractFactory.partes.hombreras.AbstractHombreras;
import ironman.logica.abstractFactory.partes.peto.AbstractPeto;
import ironman.logica.abstractFactory.partes.yelmo.AbstractYelmo;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
 */
public interface FabricaAbstracta {
    
    public AbstractCasco crearCasco();
    
    public AbstractYelmo crearYelmo();

    public AbstractHombreras crearHombreras();

    public AbstractPeto crearPeto();

    public AbstractGuantes crearGuantes();

    public AbstractBotas crearBotas();
}
