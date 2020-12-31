import java.util.Scanner;

/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y
 * que calcule la potencia.
 */
public class BaseExpP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int expoenenteN;

        while (true){
            System.out.print("Escriba la base: ");
            int base = s.nextInt();

            System.out.print("Escriba el exponente: ");
            int exponente = s.nextInt();

            if (exponente > 0){
                expoenenteN = exponente(base,exponente);
                System.out.println("El exponente es: "+expoenenteN);
                break;
            }else {
                System.out.println("Tiene que ser positivo, vuelve a ejecutar el programa");
            }
        }
    }
    public static int exponente(int primero, int segundo){
        return (int) Math.pow(primero,segundo);
    }
}
