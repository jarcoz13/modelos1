package ironman.logica.fabricas;

import ironman.logica.partes.botas.AbstractBotas;
import ironman.logica.partes.botas.BotasConvencionales;
import ironman.logica.partes.casco.AbstractCasco;
import ironman.logica.partes.casco.CascoConvencional;
import ironman.logica.partes.guantes.AbstractGuantes;
import ironman.logica.partes.guantes.GuantesConvencionales;
import ironman.logica.partes.hombreras.AbstractHombreras;
import ironman.logica.partes.hombreras.HombrerasConvencionales;
import ironman.logica.partes.peto.AbstractPeto;
import ironman.logica.partes.peto.PetoConvencional;
import ironman.logica.partes.yelmo.AbstractYelmo;
import ironman.logica.partes.yelmo.YelmoConvencional;

/**
 *
 * 
 */
public class FabricaMark1 implements FabricaAbstracta {
    @Override
    public AbstractCasco crearCasco() {
        return new CascoConvencional();
    }

    @Override
    public AbstractHombreras crearHombreras() {
        return new HombrerasConvencionales();
    }

    @Override
    public AbstractPeto crearPeto() {
        return new PetoConvencional();
    }

    @Override
    public AbstractGuantes crearGuantes() {
        return new GuantesConvencionales();
    }

    @Override
    public AbstractBotas crearBotas() {
        return new BotasConvencionales();
    }

    @Override
    public AbstractYelmo crearYelmo() {
        return new YelmoConvencional();
    }
}
