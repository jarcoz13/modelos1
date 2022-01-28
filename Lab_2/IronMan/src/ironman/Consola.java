package ironman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ironman.logica.Armadura;
import ironman.logica.CreadorArmadura;

/** La clase "Consola" permite probar la lógica del programa mediante 
 * la solicitud de datos en consola, valga la redudancia 
*/
public class Consola {
    List<Armadura> armaduras;
    private Scanner sc;
    private int opcion = 0;
    private int cantidad = 0;
    private String tipoArmadura;
/**
 * Constructor de Consola que inicializa el arreglo de 'armaduras'
 * y 'sc' para la captura de datos
 */
    public Consola() {
        armaduras = new ArrayList<>();
        sc = new Scanner(System.in);
    }
/**
 * Mediante el método "Proceso" se selecciona el tipo de armadura, se piden datos 
 * y se realizan las respectivas validaciones, es decir, implementación de toda la lógica del programa
 */
    public void proceso() {

        do {
            System.out.println("Ingrese\n1\tMark 1\n2\tMark 2\n3\tMark 3\n4\tWar Machine");
            opcion = sc.nextInt();
        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4);

        switch (opcion) {
            case 1:
                tipoArmadura = "Mark1";
                break;
            case 2:
                tipoArmadura = "Mark2";
                break;
            case 3:
                tipoArmadura = "Mark3";
                break;
            case 4:
                tipoArmadura = "WarMachine";
                break;
        }

        do {
            System.out.println("Ingrese la cantidad de elementos que desea:");
            cantidad = sc.nextInt();
        } while (cantidad <= 0);

        CreadorArmadura creadorArmadura = new CreadorArmadura();
        System.out.println("Inventario para " + tipoArmadura + ": " + armaduras.size());
        for (int i = 0; i < cantidad; i++) {
            armaduras.add(creadorArmadura.retrieveArmadura(tipoArmadura));
        }

        // Armadura armadura = new Armadura(opcion);
        // armadura.creacionPartes();
        for (Armadura armadura : armaduras) {
            System.out.println("Nombre de la armadura " + armadura.getNombreArmadura());
            // mostrarCaracteristicas("Casco",
            // armadura.getCasco().obtenerCaracteristicas());
            // mostrarCaracteristicas("Botas",
            // armadura.getBotas().obtenerCaracteristicas());
            // mostrarCaracteristicas("Peto", armadura.getPeto().obtenerCaracteristicas());
            // mostrarCaracteristicas("Guantes",
            // armadura.getGuantes().obtenerCaracteristicas());
        }
        System.out.println("Inventario para " + tipoArmadura + ": " + armaduras.size());
    }
/**
 * Este método recibe parámetros del tipo y características del elemento
 * de la armadura
 * @param tipo
 * @param caracteristicas 
 */
    private void mostrarCaracteristicas(String tipo, List<String> caracteristicas) {
        System.out.println("Caracteristicas de " + tipo);
        for (String caracteristica : caracteristicas) {
            System.out.println("\t" + caracteristica);
        }
    }
    
}
