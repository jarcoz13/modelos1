package ironman.logica.abstractFactory.fabricas;

import ironman.logica.abstractFactory.partes.botas.AbstractBotas;
import ironman.logica.abstractFactory.partes.botas.BotasWarMachine;
import ironman.logica.abstractFactory.partes.casco.AbstractCasco;
import ironman.logica.abstractFactory.partes.casco.CascoWarMachine;
import ironman.logica.abstractFactory.partes.guantes.AbstractGuantes;
import ironman.logica.abstractFactory.partes.guantes.GuantesWarMachine;
import ironman.logica.abstractFactory.partes.hombreras.AbstractHombreras;
import ironman.logica.abstractFactory.partes.hombreras.HombrerasWarMachine;
import ironman.logica.abstractFactory.partes.peto.AbstractPeto;
import ironman.logica.abstractFactory.partes.peto.PetoWarMachine;
import ironman.logica.abstractFactory.partes.yelmo.AbstractYelmo;
import ironman.logica.abstractFactory.partes.yelmo.YelmoWarMachine;

/**
 *
 * @author Alejandro Cortázar.  Cod: 20181020022
 * @author Andrés Martín.       Cod: 20201020137
 * @author Nathalia Rojas.      Cod: 20201020124
 */
public class FabricaWarMachine implements FabricaAbstracta {
    @Override
    public AbstractCasco crearCasco() {
        return new CascoWarMachine();
    }

    @Override
    public AbstractYelmo crearYelmo() {
        return new YelmoWarMachine();
    }

    @Override
    public AbstractHombreras crearHombreras() {
        return new HombrerasWarMachine();
    }

    @Override
    public AbstractPeto crearPeto() {
        return new PetoWarMachine();
    }

    @Override
    public AbstractGuantes crearGuantes() {
        return new GuantesWarMachine();
    }

    @Override
    public AbstractBotas crearBotas() {
        return new BotasWarMachine();
    }
}
