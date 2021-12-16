package ironman.logica;

import ironman.logica.fabricas.*;
import ironman.logica.partes.botas.AbstractBotas;
import ironman.logica.partes.casco.AbstractCasco;
import ironman.logica.partes.guantes.AbstractGuantes;
import ironman.logica.partes.peto.AbstractPeto;


public class Armadura {
    public FabricaAbstracta fabrica;
    
    private String nombreArmadura;
    private AbstractCasco casco;
    private AbstractBotas botas;
    private AbstractGuantes guantes;
    private AbstractPeto peto;

    /**
     * 
     */
    public Armadura(int tipoArmadura) {
        switch(tipoArmadura){
            case 1:
                nombreArmadura = "Mark 1";
                fabrica = new FabricaMark1();
                break;
            case 2:
                nombreArmadura = "Mark 2";
                fabrica = new FabricaMark2();
                break;
            case 3:
                nombreArmadura = "Mark 3";
                fabrica = new FabricaMark3();
                break;
            case 4:
                nombreArmadura = "War Machine";
                fabrica = new FabricaWarMachine();
                break;
        }
    }

    public void creacionPartes(){
        System.out.println("Creando armadura " + nombreArmadura);

        casco = fabrica.crearCasco();
        System.out.println(casco.operacion());

        peto = fabrica.crearPeto();
        System.out.println(peto.operacion());
        
        guantes = fabrica.crearGuantes();
        System.out.println(guantes.operacion());

        botas = fabrica.crearBotas();
        System.out.println(botas.operacion());
    }
}
