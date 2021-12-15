package ironman.logica.fabricas;

import ironman.logica.partes.botas.AbstractBotas;
import ironman.logica.partes.botas.BotasNivel1;
import ironman.logica.partes.casco.AbstractCasco;
import ironman.logica.partes.casco.CascoNivel1;
import ironman.logica.partes.guantes.AbstractGuantes;
import ironman.logica.partes.guantes.GuantesNivel1;
import ironman.logica.partes.hombreras.AbstractHombreras;
import ironman.logica.partes.hombreras.HombrerasNivel1;
import ironman.logica.partes.peto.AbstractPeto;
import ironman.logica.partes.peto.PetoNivel1;
import ironman.logica.partes.yelmo.AbstractYelmo;
import ironman.logica.partes.yelmo.YelmoNivel1;

/**
 *
 * 
 */
public class FabricaMark2 implements FabricaAbstracta {
    @Override
    public AbstractCasco crearCasco() {
        return new CascoNivel1();
    }
    
    @Override
    public AbstractHombreras crearHombreras() {
        return new HombrerasNivel1();
    }

    @Override
    public AbstractPeto crearPeto() {
        return new PetoNivel1();
    }

    @Override
    public AbstractGuantes crearGuantes() {
        return new GuantesNivel1();
    }

    @Override
    public AbstractBotas crearBotas() {
        return new BotasNivel1();
    }

    @Override
    public AbstractYelmo crearYelmo() {
        return new YelmoNivel1();
    }
}
