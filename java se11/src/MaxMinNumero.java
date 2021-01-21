import java.util.Scanner;
/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre
 * los números introducidos junto con las palabras “máximo” y “mínimo”.
 */
public class MaxMinNumero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Escribe un numero: ");
            int numero = s.nextInt();
            numeros[i] = numero;
            if (i == 9){
                for (int j = 0; j < 10; j++) {
                    System.out.print(numeros[j]+" maximo y minimo ");
                }
            }
        }
    }
}
