import java.util.Scanner;

/**
 * Escribe un programa que, dado un número entero, diga cuáles son y cuánto
 * suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
 * izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
 * números largos.
 * Ejemplo 1:
 *
 * Por favor, introduzca un número entero positivo: 94026782
 * Dígitos pares: 4 0 2 6 8 2
 * Suma de los dígitos pares: 22
 * Ejemplo 2:
 *
 * Por favor, introduzca un número entero positivo: 31779
 * Dígitos pares:
 * Suma de los dígitos pares: 0
 * Ejemplo 3:
 *
 * Por favor, introduzca un número entero positivo: 2404
 * Dígitos pares: 2 4 0 4
 * Suma de los dígitos pares: 10
 */
public class DecirParesOrdenados {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        long numUs = s.nextInt();
        System.out.print("Los dígitos pares son: ");

        //int div = 10;
        long numBasura = numUs;
        long reves = 0;
        int numDig = 0;
        while (numBasura > 0){
            reves = ((reves*10) + (numBasura % 10));
            numBasura /=10;
            numDig++;
        }

        long dig;
        long suma = 0;
        for (int i = 0; i < numDig ; i++){
            dig = reves%10;
            if (dig%2 == 0){
                System.out.print(dig+" ");
                suma += dig;
            }
            reves /= 10;
        }
        System.out.print("La suma de los dígitos pares, es: "+suma);
    }
}
