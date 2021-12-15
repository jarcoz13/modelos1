package ironman.logica.abstractFactory.fabricas;

import ironman.logica.abstractFactory.partes.botas.AbstractBotas;
import ironman.logica.abstractFactory.partes.botas.BotasNivel3;
import ironman.logica.abstractFactory.partes.casco.AbstractCasco;
import ironman.logica.abstractFactory.partes.casco.CascoNivel3;
import ironman.logica.abstractFactory.partes.guantes.AbstractGuantes;
import ironman.logica.abstractFactory.partes.guantes.GuantesNivel3;
import ironman.logica.abstractFactory.partes.hombreras.AbstractHombreras;
import ironman.logica.abstractFactory.partes.hombreras.HombrerasNivel3;
import ironman.logica.abstractFactory.partes.peto.AbstractPeto;
import ironman.logica.abstractFactory.partes.peto.PetoNivel3;
import ironman.logica.abstractFactory.partes.yelmo.AbstractYelmo;
import ironman.logica.abstractFactory.partes.yelmo.YelmoNivel3;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
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
