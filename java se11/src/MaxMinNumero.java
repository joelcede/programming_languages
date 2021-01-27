import java.util.Scanner;
/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre
 * los números introducidos junto con las palabras “máximo” y “mínimo”.
 */
public class MaxMinNumero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[10];
        int menor = 10, mayor = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Escribe un numero: ");
            int numero = s.nextInt();

            if (numero < menor){
                menor = numero;
            }if (numero > mayor){
                mayor = numero;
            }
            numeros[i] = numero;
        }
        System.out.println("menor: "+menor);
        System.out.println("mayor: "+mayor);
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
}
