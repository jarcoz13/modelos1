package ironman.logica.abstractFactory.fabricas;

import ironman.logica.abstractFactory.partes.botas.AbstractBotas;
import ironman.logica.abstractFactory.partes.botas.BotasConvencionales;
import ironman.logica.abstractFactory.partes.casco.AbstractCasco;
import ironman.logica.abstractFactory.partes.casco.CascoConvencional;
import ironman.logica.abstractFactory.partes.guantes.AbstractGuantes;
import ironman.logica.abstractFactory.partes.guantes.GuantesConvencionales;
import ironman.logica.abstractFactory.partes.hombreras.AbstractHombreras;
import ironman.logica.abstractFactory.partes.hombreras.HombrerasConvencionales;
import ironman.logica.abstractFactory.partes.peto.AbstractPeto;
import ironman.logica.abstractFactory.partes.peto.PetoConvencional;
import ironman.logica.abstractFactory.partes.yelmo.AbstractYelmo;
import ironman.logica.abstractFactory.partes.yelmo.YelmoConvencional;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
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
