import java.util.Scanner;

/**
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("FACTORIAL");
        System.out.print("Escribe un numero: ");
        int numero = s.nextInt();

        int contador = 0;
        int factor = 1;

        while (contador<numero){
            factor = multiplica(factor,numero);
            System.out.print("*"+numero);
            numero--;
        }
        System.out.println(" = "+factor);
    }
    public static int multiplica(int num1, int num2){
        return num1 * num2;
    }
}
