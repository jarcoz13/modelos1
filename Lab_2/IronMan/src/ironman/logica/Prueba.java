package ironman.logica;

import java.util.Scanner;



public class Prueba {
    
    public Scanner sc;
    public int opcion = 0;

    public void proceso(){
        sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese\n1\tMark 1\n2\tMark 2\n3\tMark 3\n4\tMark 4\n5\tWar Machine");
            opcion = sc.nextInt();
        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5);

        Armadura armadura = new Armadura(opcion);

        armadura.creacionPartes();
    }
}
