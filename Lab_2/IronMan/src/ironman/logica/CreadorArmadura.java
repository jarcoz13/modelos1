package ironman.logica;

public class CreadorArmadura {

    private final Mark1 MARK1;
    private final Mark2 MARK2;
    private final Mark3 MARK3;
    private final WarMachine WARMACHINE;

    /**
     *Constructor que inicializa los trajes 
     */
    public CreadorArmadura() {
        MARK1 = new Mark1();
        MARK2 = new Mark2();
        MARK3 = new Mark3();
        WARMACHINE = new WarMachine();
    }
/**
 * Función del diseño "Prototype" para clonar el traje específico
 * @param tipoDeArmadura
 * @return 
 */
    public Armadura retrieveArmadura(String tipoDeArmadura) {
        if ("Mark1".equals(tipoDeArmadura)) {
            return (Armadura) MARK1.clone();
        } else if ("Mark2".equals(tipoDeArmadura)) {
            return (Armadura) MARK2.clone();
        } else if ("Mark3".equals(tipoDeArmadura)) {
            return (Armadura) MARK3.clone();
        } else if ("WarMachine".equals(tipoDeArmadura)) {
            return (Armadura) WARMACHINE.clone();
        }
        return null;
    }
}
