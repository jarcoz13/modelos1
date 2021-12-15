package ironman.logica.abstractFactory.fabricas;

import ironman.logica.abstractFactory.partes.botas.AbstractBotas;
import ironman.logica.abstractFactory.partes.botas.BotasNivel2;
import ironman.logica.abstractFactory.partes.casco.AbstractCasco;
import ironman.logica.abstractFactory.partes.casco.CascoNivel2;
import ironman.logica.abstractFactory.partes.guantes.AbstractGuantes;
import ironman.logica.abstractFactory.partes.guantes.GuantesNivel2;
import ironman.logica.abstractFactory.partes.hombreras.AbstractHombreras;
import ironman.logica.abstractFactory.partes.hombreras.HombrerasNivel2;
import ironman.logica.abstractFactory.partes.peto.AbstractPeto;
import ironman.logica.abstractFactory.partes.peto.PetoNivel2;
import ironman.logica.abstractFactory.partes.yelmo.AbstractYelmo;
import ironman.logica.abstractFactory.partes.yelmo.YelmoNivel2;


public class FabricaMark3 implements FabricaAbstracta {
    @Override
    public AbstractCasco crearCasco() {
        return new CascoNivel2();
    }

    @Override
    public AbstractHombreras crearHombreras() {
        return new HombrerasNivel2();
    }

    @Override
    public AbstractPeto crearPeto() {
        return new PetoNivel2();
    }

    @Override
    public AbstractGuantes crearGuantes() {
        return new GuantesNivel2();
    }

    @Override
    public AbstractBotas crearBotas() {
        return new BotasNivel2();
    }

    @Override
    public AbstractYelmo crearYelmo() {
        return new YelmoNivel2();
    }
}
