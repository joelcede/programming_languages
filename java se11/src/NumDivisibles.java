import java.util.Scanner;

/**
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 */
public class NumDivisibles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        int numero = s.nextInt();

        System.out.print("Escribe un numero divisible: ");
        int numeroDivisible = s.nextInt();

        int contador = 0;

        while (contador<numero){
            if (numero%numeroDivisible==1){
                System.out.println(numero);
            }
            numero--;
        }
    }
}
