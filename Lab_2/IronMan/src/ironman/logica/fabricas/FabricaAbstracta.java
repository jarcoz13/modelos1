package ironman.logica.fabricas;

import ironman.logica.partes.botas.AbstractBotas;
import ironman.logica.partes.casco.AbstractCasco;
import ironman.logica.partes.guantes.AbstractGuantes;
import ironman.logica.partes.peto.AbstractPeto;

/**
 *Implementación del diseño creacional "Abstract Factory" 
 */
public interface FabricaAbstracta {
    
    /**
     * Creación del casco
     * @return AbstractCasco
     */
    public AbstractCasco crearCasco();
    
     /**
     * Creación del peto
     * @return AbstractPeto
     */
    public AbstractPeto crearPeto();
    
     /**
     * Creación de los guantes
     * @return AbstractGuantes
     */
    public AbstractGuantes crearGuantes();
    
     /**
     * Creación de las botas
     * @return AbstractBotas
     */
    public AbstractBotas crearBotas();
    
}
