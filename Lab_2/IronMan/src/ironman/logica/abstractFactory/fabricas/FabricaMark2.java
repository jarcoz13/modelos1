package ironman.logica.abstractFactory.fabricas;

import ironman.logica.abstractFactory.partes.botas.AbstractBotas;
import ironman.logica.abstractFactory.partes.botas.BotasNivel1;
import ironman.logica.abstractFactory.partes.casco.AbstractCasco;
import ironman.logica.abstractFactory.partes.casco.CascoNivel1;
import ironman.logica.abstractFactory.partes.guantes.AbstractGuantes;
import ironman.logica.abstractFactory.partes.guantes.GuantesNivel1;
import ironman.logica.abstractFactory.partes.hombreras.AbstractHombreras;
import ironman.logica.abstractFactory.partes.hombreras.HombrerasNivel1;
import ironman.logica.abstractFactory.partes.peto.AbstractPeto;
import ironman.logica.abstractFactory.partes.peto.PetoNivel1;
import ironman.logica.abstractFactory.partes.yelmo.AbstractYelmo;
import ironman.logica.abstractFactory.partes.yelmo.YelmoNivel1;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
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
