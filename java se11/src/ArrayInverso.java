import java.util.Scanner;
/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.
 */
public class ArrayInverso {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] orden = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa 1 numero: ");
            int numero = s.nextInt();

            orden[i] = numero;

            if (i == 9){
                for (int inversa = 9; inversa >= 0 ; inversa--) {
                    System.out.print(orden[inversa]+" ");
                }
            }
        }
    }
}
