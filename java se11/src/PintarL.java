import java.util.Scanner;

/**
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno.
 * Ejemplo:
 * Introduzca la altura de la L: 5
 *   *
 *   *
 *   *
 *   *
 *   * * *
 */
public class PintarL {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la altura de la L: ");
        int altura = s.nextInt();

        //operacion
        int operarD = division(altura,2);
        int horizontal = suma(operarD,1);

        String caracter = " * ";
        int contador = 0;


        while (contador<altura-1){
            System.out.println(caracter);
            contador++;
        }
        String indiceU = caracter.repeat(horizontal);
        System.out.println(indiceU);
    }
    public static int suma(int n1,int n2){
        return n1 + n2;
    }
    public static int division(int n1,int n2){
        return n1 / n2;
    }
}
