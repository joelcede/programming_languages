import java.util.Scanner;

/**
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
 * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 * dos asteriscos menos en la base para simular la curvatura de las esquinas
 * inferiores.
 * Ejemplo:
 * Introduzca la altura de la U: 5
 * 
 *   *     *
 *   *     *
 *   *     *
 *   *     *
 *    * * *
 */
public class LetraU {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String caracter = "* ";
        String espacio = "  ";

        System.out.print("Introduzca la altura de U: ");
        int altura = s.nextInt();

        int base = resta(altura,2);
        for (int i = 0; i < altura-1; i++) {
            System.out.println(caracter+espacio.repeat(base)+caracter);
        }
        System.out.print(espacio+caracter.repeat(base));
    }
    public static int resta(int n1,int n2){
        return n1 - n2;
    }
}
