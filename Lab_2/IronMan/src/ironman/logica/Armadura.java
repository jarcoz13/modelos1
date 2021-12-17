package ironman.logica;

import ironman.logica.fabricas.*;
import ironman.logica.partes.botas.AbstractBotas;
import ironman.logica.partes.casco.AbstractCasco;
import ironman.logica.partes.guantes.AbstractGuantes;
import ironman.logica.partes.peto.AbstractPeto;

public class Armadura implements Cloneable {
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
        switch (tipoArmadura) {
            case 0:
                nombreArmadura = "Mark 1";
                fabrica = new FabricaMark1();
                break;
            case 1:
                nombreArmadura = "Mark 2";
                fabrica = new FabricaMark2();
                break;
            case 2:
                nombreArmadura = "Mark 3";
                fabrica = new FabricaMark3();
                break;
            case 3:
                nombreArmadura = "War Machine";
                fabrica = new FabricaWarMachine();
                break;
        }
    }

    public void crearPartes() {
        casco = fabrica.crearCasco();

        peto = fabrica.crearPeto();

        guantes = fabrica.crearGuantes();

        botas = fabrica.crearBotas();

    }

    public void creacionPartesVerbose() {
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

    /**
     * @return the fabrica
     */
    public FabricaAbstracta getFabrica() {
        return fabrica;
    }

    /**
     * @param fabrica the fabrica to set
     */
    public void setFabrica(FabricaAbstracta fabrica) {
        this.fabrica = fabrica;
    }

    /**
     * @return the nombreArmadura
     */
    public String getNombreArmadura() {
        return nombreArmadura;
    }

    /**
     * @param nombreArmadura the nombreArmadura to set
     */
    public void setNombreArmadura(String nombreArmadura) {
        this.nombreArmadura = nombreArmadura;
    }

    /**
     * @return the casco
     */
    public AbstractCasco getCasco() {
        return casco;
    }

    /**
     * @param casco the casco to set
     */
    public void setCasco(AbstractCasco casco) {
        this.casco = casco;
    }

    /**
     * @return the botas
     */
    public AbstractBotas getBotas() {
        return botas;
    }

    /**
     * @param botas the botas to set
     */
    public void setBotas(AbstractBotas botas) {
        this.botas = botas;
    }

    /**
     * @return the guantes
     */
    public AbstractGuantes getGuantes() {
        return guantes;
    }

    /**
     * @param guantes the guantes to set
     */
    public void setGuantes(AbstractGuantes guantes) {
        this.guantes = guantes;
    }

    /**
     * @return the peto
     */
    public AbstractPeto getPeto() {
        return peto;
    }

    /**
     * @param peto the peto to set
     */
    public void setPeto(AbstractPeto peto) {
        this.peto = peto;
    }

    @Override
    public Armadura clone() {
        Armadura clonArmadura = null;
        try {
            clonArmadura = (Armadura) super.clone();
            clonArmadura.setBotas(botas);
            clonArmadura.setCasco(casco);
            clonArmadura.setFabrica(fabrica);
            clonArmadura.setGuantes(guantes);
            clonArmadura.setNombreArmadura(nombreArmadura);
            clonArmadura.setPeto(peto);
        } catch (Exception e) {
            return null;
        }

        return clonArmadura;
    }
}
