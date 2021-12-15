package ironman.logica.fabricas;

import ironman.logica.partes.botas.AbstractBotas;
import ironman.logica.partes.botas.BotasNivel3;
import ironman.logica.partes.casco.AbstractCasco;
import ironman.logica.partes.casco.CascoNivel3;
import ironman.logica.partes.guantes.AbstractGuantes;
import ironman.logica.partes.guantes.GuantesNivel3;
import ironman.logica.partes.hombreras.AbstractHombreras;
import ironman.logica.partes.hombreras.HombrerasNivel3;
import ironman.logica.partes.peto.AbstractPeto;
import ironman.logica.partes.peto.PetoNivel3;
import ironman.logica.partes.yelmo.AbstractYelmo;
import ironman.logica.partes.yelmo.YelmoNivel3;

/**
 *
 * 
 */
public class FabricaMark4 implements FabricaAbstracta {
    @Override
    public AbstractCasco crearCasco() {
        return new CascoNivel3();
    }

    @Override
    public AbstractYelmo crearYelmo() {
        return new YelmoNivel3();
    }

    @Override
    public AbstractHombreras crearHombreras() {
        return new HombrerasNivel3();
    }

    @Override
    public AbstractPeto crearPeto() {
        return new PetoNivel3();
    }

    @Override
    public AbstractGuantes crearGuantes() {
        return new GuantesNivel3();
    }

    @Override
    public AbstractBotas crearBotas() {
        return new BotasNivel3();
    }
}
