import java.util.Scanner;

/**
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
 * y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
 * los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
 * debe introducir por teclado.
 */
public class MostrarNTerminos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //variables :V
        int primer = 0;
        int segundo = 1;

        int contador = 0;
        int contenedor1;
        int contenedor;

        System.out.print("Escribe hasta que indice se termina: ");
        int indice = s.nextInt();

        //la verdad es que casi no entiendo mate pero vi un ejercicio en lenguaje c y lo adapte en java zorry
        while (indice > contador){
            contenedor1 = suma(segundo,primer);
            contenedor = segundo;
            segundo = contenedor + primer;
            primer = contenedor;
            System.out.println(contenedor1);
            contador++;
        }
    }

    public static int suma(int primero,int segundo){
        return primero + segundo;
    }
}
