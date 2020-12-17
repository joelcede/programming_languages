import java.util.Scanner;

/**
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 */
public class ListarNumeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int contador = 0;
        int contadorPositivo = 0;
        int contadorNegativo = 0;

        while (contador < 11){
            System.out.print("Ingrese un numero: ");
            int numero = s.nextInt();
            if (numero<0){
                contadorNegativo++;
            }else {
                contadorPositivo++;
            }
            contador++;
        }
        System.out.println("Se ingresaron "+contadorPositivo+" contadores positivos y "
                +contadorNegativo+" contadores negativos");
    }
}
