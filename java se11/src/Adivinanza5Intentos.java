import java.util.Scanner;

/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número introducido
 * es menor o mayor que el número secreto.
 */
public class Adivinanza5Intentos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int intentos = 5;
        int oportunidades = 5;
        int numero = ((int)(Math.random()*100)+1);

        System.out.println(numero);
        for (int i = 1; i < intentos+1; i++) {
            System.out.println("Tienes "+oportunidades+" intentos");
            System.out.print("Adivina el numero: ");
            int adivinarNumero = s.nextInt();

            if (adivinarNumero < numero){
                System.out.println("El numero es grande");
            }if (adivinarNumero > numero){
                System.out.println("El numero es pequeño");
            }if (adivinarNumero == numero) {
                System.out.println("Felicidades, Ganaste!!!!, el numero elegido es el: " + numero);
                break;
            }
            oportunidades--;
        }
    }
}
