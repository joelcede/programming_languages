import java.util.Scanner;
/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces
 * por teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente. Los números
 * que se han cambiado deben aparecer entrecomillados.
 */
public class IntAString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] numeros = new String[100];

        System.out.print("valor a cambiar(1-20): ");
        String valor1 = s.next();
        System.out.print("Ingresa el nuevo valor(1-20): ");
        String valor2 = s.next();

        for (int i = 0; i < 10; i++) {
            String numAleatorio = ((int)(Math.random()*20)+" ");

            if (numAleatorio.equals(valor1)){
                numAleatorio = '{'+valor2+'}';
            }

            numeros[i] = numAleatorio;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
}
