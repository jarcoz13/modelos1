package ironman.logica.fabricas;

import ironman.logica.partes.botas.AbstractBotas;
import ironman.logica.partes.botas.BotasNivel2;
import ironman.logica.partes.casco.AbstractCasco;
import ironman.logica.partes.casco.CascoNivel2;
import ironman.logica.partes.guantes.AbstractGuantes;
import ironman.logica.partes.guantes.GuantesNivel2;
import ironman.logica.partes.hombreras.AbstractHombreras;
import ironman.logica.partes.hombreras.HombrerasNivel2;
import ironman.logica.partes.peto.AbstractPeto;
import ironman.logica.partes.peto.PetoNivel2;
import ironman.logica.partes.yelmo.AbstractYelmo;
import ironman.logica.partes.yelmo.YelmoNivel2;


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
