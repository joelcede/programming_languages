import java.util.Scanner;

/**
 * Realiza un programa que calcule la media de tres notas.
 */
public class CalcularMedia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        var primero = s.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        var segundo = s.nextInt();
        System.out.print("Ingresa el tercer numero: ");
        var tercero = s.nextInt();

        var resultadoSuma = suma(primero,segundo,tercero);
        var resultadoFinal = dividir(resultadoSuma);
        System.out.println("la media es: "+resultadoFinal);
    }
    public static int suma(int primero, int segundo, int tercero){
        return primero + segundo + tercero;
    }
    public static int dividir(int primero){
        return primero / 3;
    }
}
