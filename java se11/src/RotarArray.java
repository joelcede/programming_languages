import java.util.Arrays;
import java.util.Scanner;
/**
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.
 */
public class RotarArray {
    public static void main(String[] args){
        int[] numero = new int[15];
        Scanner s = new Scanner(System.in);

        for (int i = 1; i < 15; i++) {
            System.out.print("Escribe un numero: ");
            int numeros = s.nextInt();
            numero[i] = numeros;
            if (i == 14){
                System.out.print("Escribe un numero: ");
                numeros = s.nextInt();
                numero[0] = numeros;
            }
        }
        System.out.println(Arrays.toString(numero));
    }
}
