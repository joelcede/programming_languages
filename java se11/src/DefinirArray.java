import java.util.Scanner;
/**
 * Define un array de 12 números enteros con nombre num y asigna los valores
 * según la tabla que se muestra a continuación. Muestra el contenido de todos
 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
 * han sido inicializados?
 */
public class DefinirArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] num = new int[12];

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite un numero: ");
            int numero = s.nextInt();
            System.out.print("Digite la posicion(0 - 11): ");
            int posicion = s.nextInt();

            num[posicion] = numero;

            if (i == 5){
                for (int k : num) {
                    System.out.print(k + " ");
                }
            }
        }
    }
}
