import java.util.Scanner;
/**
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.
 */
public class CambiarPosicion {
    public static void main(String[] args) {
        int[] numeros = new int[16];
        Scanner s = new Scanner(System.in);
        int contenedor;

        for (int i = 1; i < 16; i++) {
            System.out.print("Escribe un numero: ");
            int numero = s.nextInt();

            numeros[i] = numero;

            if (i == 15){
                contenedor = numero;
                numeros[0] = contenedor;
                for (int j = 0; j < 15; j++) {
                    System.out.print(numeros[j]+" ");
                }
            }
        }
    }
}
