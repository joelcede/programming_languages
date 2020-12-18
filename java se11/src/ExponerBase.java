import java.util.Scanner;

/**
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 * se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5
 */
public class ExponerBase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int contador = 1;
        int resultado;

        System.out.print("Escribe la base: ");
        int base = s.nextInt();

        System.out.print("Escribe el exponente: ");
        int exponente = s.nextInt();

        while (contador <= exponente){
            resultado = elevar(base,contador);
            System.out.println("base: "+base+" exponente: "+contador+" = "+resultado);
            contador++;
        }
    }
    public static int elevar(int primero, int segundo){
        return (int) Math.pow(primero,segundo);
    }
}
