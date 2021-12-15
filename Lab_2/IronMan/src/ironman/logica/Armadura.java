package ironman.logica;

import ironman.logica.fabricas.*;
import ironman.logica.partes.botas.AbstractBotas;
import ironman.logica.partes.casco.AbstractCasco;
import ironman.logica.partes.guantes.AbstractGuantes;
import ironman.logica.partes.hombreras.AbstractHombreras;
import ironman.logica.partes.peto.AbstractPeto;
import ironman.logica.partes.yelmo.AbstractYelmo;

public class Armadura {
    public FabricaAbstracta fabrica;
    
    private String nombreArmadura;
    private AbstractCasco casco;
    private AbstractYelmo yelmo;
    private AbstractHombreras hombreras;
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
                nombreArmadura = "Mark 4";
                fabrica = new FabricaMark4();
                break;
            case 5:
                nombreArmadura = "War Machine";
                fabrica = new FabricaWarMachine();
                break;
        }
    }

    public void creacionPartes(){
        System.out.println("Creando armadura " + nombreArmadura);

        casco = fabrica.crearCasco();
        System.out.println(casco.operacion());
        
        yelmo = fabrica.crearYelmo();
        System.out.println(yelmo.operacion());

        hombreras = fabrica.crearHombreras();
        System.out.println(hombreras.operacion());

        peto = fabrica.crearPeto();
        System.out.println(peto.operacion());
        
        guantes = fabrica.crearGuantes();
        System.out.println(guantes.operacion());

        botas = fabrica.crearBotas();
        System.out.println(botas.operacion());
    }
}
