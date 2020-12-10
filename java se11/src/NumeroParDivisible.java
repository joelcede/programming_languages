import java.util.Scanner;

/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 */
public class NumeroParDivisible {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        int numero = s.nextInt();

        if (numero%5 == 0){
            System.out.println("El "+numero+" es par y divisible de 5.");
        }else if (numero%2 == 0){
            System.out.println("Es par, pero no divisible para 5");
        }else{
            System.out.println("NO es par y tampoco es divisible para 5");
        }
    }
}
