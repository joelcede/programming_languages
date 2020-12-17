import java.util.Scanner;

/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado..
 */
public class CuadradoAndCubo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double cuadradoCubo;
        double cuboCuadrado;
        int numero;
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un numero: ");
            numero = s.nextInt();
            cuadradoCubo = cuadrado(numero);
            cuboCuadrado = cubo(numero);
            System.out.println("numero: "+numero+"\tcuadrado: "+cuadradoCubo+"\tcubo: "+cuboCuadrado);
        }

    }
    public static double cuadrado(int numero){
        return Math.pow(numero,2);
    }
    public static double cubo(int numero){
        return Math.pow(numero,3);
    }
}
