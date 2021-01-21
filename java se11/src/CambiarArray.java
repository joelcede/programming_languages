import java.util.Arrays;
import java.util.Scanner;
/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces
 * por teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente. Los números
 * que se han cambiado deben aparecer entrecomillados.
 */
public class CambiarArray {
    public static void main(String[] args) {
        int[] numero = new int[100];
        Scanner s = new Scanner(System.in);

        System.out.print("Escriba el valor a remplazar: ");
        int valor1 = s.nextInt();

        System.out.print("Escriba valor de remplazo: ");
        int valor2 = s.nextInt();

        for (int i = 0; i < 100; i++) {
            int numAleatorio = ((int)(Math.random()*20));
            numero[i] = numAleatorio;
            if (numero[i] == valor1){
                numero[i] = valor2;
                System.out.print("'"+numero[i]+"' ");
            }else{
                System.out.print(numero[i]+" ");
            }
        }
        System.out.println();
        //System.out.print(Arrays.toString(numero));
    }
}
