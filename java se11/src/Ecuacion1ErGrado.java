import java.util.Scanner;

/**
 * Realiza un programa que resuelva una ecuación de primer grado
 * (del tipo ax + b = 0).
 */
public class Ecuacion1ErGrado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingresa el valor a: ");
        int valorA = s.nextInt();
        System.out.print("Ingresa el valor b: ");
        int valorB = s.nextInt();
        System.out.print("Ingresa el resultado: ");
        int resultado = s.nextInt();

        var suma = primerProceso(resultado,valorB);
        var resultadoFinal = segundoProceso(suma,valorA);

        System.out.println("el resultado es: "+resultadoFinal);
    }
    public static int primerProceso(int primero, int segundo){
        return primero - segundo;
    }
    public  static int segundoProceso(int primero, int segundo){
        return primero / segundo;
    }
}
