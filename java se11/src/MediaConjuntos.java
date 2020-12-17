import java.util.Scanner;

/**
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo..
 */
public class MediaConjuntos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        System.out.println("Esto solo suma. Si ingresas un numero negativo se acaba.");
        while (true){
            System.out.print("Ingrese un numero: ");
            int numeroI = s.nextInt();
            if (numeroI <= -1){
                break;
            }else {
                numero = numero + numeroI;
                contador++;
            }
        }
        System.out.println("la media de los "+contador+" numeros son: "+(numero/contador));
    }
}
