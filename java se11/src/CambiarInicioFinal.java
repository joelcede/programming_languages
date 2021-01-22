import java.util.Scanner;

/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
 * ambos números están entre 0 y 9. El programa deberá colocar el número de
 * la posición inicial en la posición final, rotando el resto de números para que no
 * se pierda ninguno. Al final se debe mostrar el array resultante.
 */
public class CambiarInicioFinal {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] numeroArray = new int[10];
        int[] numeroC = new int [10];
        int contenedor1,contenedor2 = 0,contenedor3 = 0;

        System.out.print("Escriba el numero inicial a cambiar(posicion): ");
        int posicionI = s.nextInt();

        System.out.print("Escribe el numero final a cambiar(posicion): ");
        int posicionF = s.nextInt();

        for (int i = 0; i < 10; i++) {

            System.out.print("Escriba un numero: ");
            int numero = s.nextInt();

            contenedor2 = numeroArray[posicionF];
            numeroArray[i] = numero;
        }
        System.out.println(contenedor2);

        if ((numeroArray[posicionI] < numeroArray[posicionF])){

            contenedor1 = numeroArray[posicionI];

            for (int j = posicionI; j <= posicionF; j++) {
                //numeroArray[posicionF-1] = contenedor2;
                numeroArray[j] = numeroArray[j+1];
                //System.out.print(numeroArray[j]+" ");
                if (j == posicionF){
                    numeroArray[posicionF] = contenedor2;

                    numeroArray[posicionF-1] = contenedor1;
                }
            }
            contenedor3 = numeroArray[9];
        }
        for (int i = 1; i < 10; i++) {
            numeroC[i] = numeroArray[i-1];

            numeroC[0] = contenedor3;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(numeroC[i]+" ");
        }
    }
}
