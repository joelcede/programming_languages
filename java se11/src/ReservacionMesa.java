import java.util.Scanner;

/**
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 * (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 * el programa no está preparado para colocar a grupos mayores a 4, por tanto,
 * si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
 * mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4
 * personas como máximo e intente de nuevo”. Para el grupo que llega,
 * se busca siempre la primera mesa libre (con 0 personas). Si no quedan mesas
 * libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
 * grupo es de dos personas, se podrá colocar donde haya una o dos personas.
 * Inicialmente, las mesas se cargan con valores aleatorios entre 0 y 4. Cada
 * vez que se sientan nuevos clientes se debe mostrar el estado de las mesas.
 * Los grupos no se pueden romper aunque haya huecos sueltos suficientes.
 */
public class ReservacionMesa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] mesa = new int[10];

        for (int i = 0; i < 10; i++) {
            int personaMesa = ((int)(Math.random()*5));
            mesa[i] = personaMesa;
        }
        while (true){
            System.out.print("Cuantos son?(-1 para salir): ");
            int cliente = s.nextInt();

            if (cliente < 5){
                System.out.print("mesa pasada: ");
                for (int i = 0; i < 10; i++) {
                    System.out.print(mesa[i]+" ");
                }
            }
            System.out.println();
            if (cliente != -1){
                for (int i = 0; i < 10; i++) {
                    if (mesa[i] == 0){
                        if (cliente < 5){
                            if (mesa[i] == mesa[i]){
                                mesa[i] = mesa[i] + cliente;
                                break;
                            }
                        }
                    }else if (mesa[i] == 1){
                        if (cliente < 4){
                            if (mesa[i] == mesa[i]){
                                mesa[i] = mesa[i] + cliente;
                                break;
                            }
                        }
                    }else if (mesa[i] == 2){
                        if (cliente < 3){
                            if (mesa[i] == mesa[i]){
                                mesa[i] = mesa[i] + cliente;
                                break;
                            }
                        }
                    }else if (mesa[i] == 3){
                        if (cliente < 2){
                            if (mesa[i] == mesa[i]){
                                mesa[i] = mesa[i] + cliente;
                                break;
                            }
                        }
                    }
                }
            }if (cliente > 4){
                System.out.println("\nLo siento, no admitimos grupos mayores a 4, haga grupos de 4\n" +
                        "personas como máximo e intente de nuevo”");
                continue;
            }if (cliente == -1) {
                break;
            }
            if (cliente < 5){
                System.out.print("mesa actual: ");
                for (int i = 0; i < 10; i++) {
                    System.out.print(mesa[i]+" ");
                }
            }
            System.out.println();
        }
    }
}
