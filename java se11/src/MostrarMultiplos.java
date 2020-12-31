import java.util.Scanner;

/**
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 */
public class MostrarMultiplos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        int numero = s.nextInt();

        int contador = 0;
        int contenedor = 0;

        while (contador<numero){
            if (contador%2==1){
                contenedor = contenedor + contador;
                System.out.print(contador+" + ");
            }
            contador++;
        }
        System.out.println("es igual a:  "+contenedor);
    }
}
