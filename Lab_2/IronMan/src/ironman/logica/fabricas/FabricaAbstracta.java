package ironman.logica.fabricas;

import ironman.logica.partes.botas.AbstractBotas;
import ironman.logica.partes.casco.AbstractCasco;
import ironman.logica.partes.guantes.AbstractGuantes;
import ironman.logica.partes.hombreras.AbstractHombreras;
import ironman.logica.partes.peto.AbstractPeto;
import ironman.logica.partes.yelmo.AbstractYelmo;

/**
 *
 * 
 */
public interface FabricaAbstracta {
    
    public AbstractCasco crearCasco();
    
    public AbstractYelmo crearYelmo();

    public AbstractHombreras crearHombreras();

    public AbstractPeto crearPeto();

    public AbstractGuantes crearGuantes();

    public AbstractBotas crearBotas();
}
