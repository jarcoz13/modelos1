package ironman.logica.fabricas;

import ironman.logica.partes.botas.AbstractBotas;
import ironman.logica.partes.casco.AbstractCasco;
import ironman.logica.partes.guantes.AbstractGuantes;
import ironman.logica.partes.peto.AbstractPeto;

/**
 *
 * 
 */
public interface FabricaAbstracta {
    
    public AbstractCasco crearCasco();

    public AbstractPeto crearPeto();

    public AbstractGuantes crearGuantes();

    public AbstractBotas crearBotas();
}
