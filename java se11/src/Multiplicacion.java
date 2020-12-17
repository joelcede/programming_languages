
import java.util.Scanner;

/**
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación..
 */

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("ingrese el primer numero: ");
        int numero1 = s.nextInt();

        System.out.print("ingrese el segundo numero: ");
        int numero2 = s.nextInt();

        System.out.println("el resultado es: "+multiplicacion(numero1,numero2));
    }
    public static int multiplicacion(int num1, int num2){
        return num1 * num2;
    }
}
