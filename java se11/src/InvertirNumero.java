import java.util.Scanner;

/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 * nunca se me ocurrio una forma tan sencilla de invertir numeros
 */
public class InvertirNumero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero,invertido = 0,resto;

        System.out.print("Escribe un numero: ");
        numero = s.nextInt();

        while (numero>0){
            resto = numero%10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }
        System.out.println("numero invertido: "+invertido);
    }
}
