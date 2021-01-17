import java.util.Scanner;
/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los elementos
 * que no han sido inicializados?
 */
public class SimboloArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [] simbolo = new String[10];

        System.out.print("Cuantos caracteres desea escribir?: ");
        int  cantidad = s.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Escribe el caracter: ");
            String caracter = s.next();
            System.out.print("Indica una posicion del (0-9): ");
            int posicion = s.nextInt();

            simbolo[posicion] = caracter;
            if (i == cantidad-1){
                for (int j = 0; j < 10; j++) {
                    System.out.print(simbolo[j]+" ");
                }
            }
        }
    }
}
