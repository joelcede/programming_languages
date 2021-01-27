import java.util.Scanner;
/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que
 * no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 * el array resultante.
 */
public class OrdenImparArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numero = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Escribe un numero: ");
            int numAleatorio = s.nextInt();
            numero[i] = numAleatorio;
        }
        System.out.println("---------ARRAY INICIAL---------");
        System.out.println(" 1  2  3  4  5  6  7  8  9  10");
        System.out.println("-------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+numero[i]+" ");
        }
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("----------ARRAY FINAL----------");
        System.out.println(" 1  2  3  4  5  6  7  8  9  10");
        System.out.println("-------------------------------");
        for (int i = 0; i < 10; i++) {
            if (numero[i]%2==1){
                System.out.print(" "+numero[i]+" ");
            }
        }
        for (int i = 0; i < 10; i++) {
            if (numero[i]%2==0){
                System.out.print(" "+numero[i]+" ");
            }
        }
        System.out.println();
        System.out.println("-------------------------------");
    }
}
