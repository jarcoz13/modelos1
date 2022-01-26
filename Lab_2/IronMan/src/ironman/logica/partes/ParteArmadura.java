package ironman.logica.partes;

/**
 *
 * @author Usuario
 */
public class ParteArmadura {
    private int salud;
    private int danio;
    private int defensa;

    public int getSalud() {
        return salud;
    }

    public int getDanio() {
        return danio;
    }

    public int getDefensa() {
        return defensa;
    }
    
    public void aumentarSalud(int aumento){
        salud += aumento;
    }
    
    public void aumentarDanio(int aumento){
        danio += aumento;
    }
    
    public void aumentarDefensa(int aumento){
        defensa += aumento;
    }
}
