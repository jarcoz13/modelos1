package ironman.logica.fabricas;

import ironman.logica.partes.botas.AbstractBotas;
import ironman.logica.partes.botas.BotasWarMachine;
import ironman.logica.partes.casco.AbstractCasco;
import ironman.logica.partes.casco.CascoWarMachine;
import ironman.logica.partes.guantes.AbstractGuantes;
import ironman.logica.partes.guantes.GuantesWarMachine;
import ironman.logica.partes.peto.AbstractPeto;
import ironman.logica.partes.peto.PetoWarMachine;

/**
 *La clase "Fabrica War Machine"  se encarga de la creción de los elementos de dicho traje
 */
public class FabricaWarMachine implements FabricaAbstracta {
    @Override
    public AbstractCasco crearCasco() {
        return new CascoWarMachine();
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
