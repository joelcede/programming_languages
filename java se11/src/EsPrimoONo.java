import java.util.Scanner;

/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad
 */
public class EsPrimoONo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true){
            System.out.print("Escribe un numero: ");
            int numero = s.nextInt();
            if (numero%2 == 1){
                System.out.println("El numero "+numero+" es primo");
            }else {
                System.out.println("El numero "+numero+" No es primo");
                break;
            }
        }
    }
}
