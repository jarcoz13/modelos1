package ironman.logica.abstractFactory;

import java.util.Scanner;

import ironman.logica.abstractFactory.fabricas.*;
import ironman.logica.abstractFactory.partes.casco.Casco;

public class Prueba {
    public FabricaAbstracta fabrica;
    public Casco casco;
    public Scanner sc;
    public int opcion = 0;

    public void proceso(){
        sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese\n1\tMark 1\n2\tMark 2\n3\tMark 3\n4\tMark 4\n5\tWar Machine");
            opcion = sc.nextInt();
        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 4);

        switch(opcion){
            case 1:
                fabrica = new FabricaMark1();
                break;
            case 2:
                fabrica = new FabricaMark2();
                break;
            case 3:
                fabrica = new FabricaMark3();
                break;
            case 4:
                fabrica = new FabricaMark4();
                break;
            case 5:
                fabrica = new FabricaWarMachine();
                break;
        }

        casco = fabrica.crearCasco();
        System.out.println(casco.operacion());
    }
    public static void main(String[] args) {
        new Prueba().proceso();
    }
}
