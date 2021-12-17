package ironman.logica;

public class CreadorArmadura {
    private Mark1 mark1;
    private Mark2 mark2;
    private Mark3 mark3;
    private WarMachine warMachine;

    public CreadorArmadura(){
        mark1 = new Mark1();
        mark2 = new Mark2();
        mark3 = new Mark3();
        warMachine = new WarMachine();
    }

    public Armadura retrieveArmadura(String tipoDeArmadura){
        if("Mark1".equals(tipoDeArmadura)){
            return (Armadura) mark1.clone();
        } else if("Mark2".equals(tipoDeArmadura)){
            return (Armadura) mark2.clone();
        } else if("Mark3".equals(tipoDeArmadura)){
            return (Armadura) mark3.clone();
        } else if("WarMachine".equals(tipoDeArmadura)){
            return (Armadura) warMachine.clone();
        }
        return null;
    }
}
