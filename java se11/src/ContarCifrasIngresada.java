import java.util.Scanner;
//Realiza un programa que nos diga cuántos dígitos tiene un número introducido
//por teclado.
public class ContarCifrasIngresada {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = s.nextInt();
        int contador = 0;

        while (numero != 0){
            numero = division(numero);
            contador++;
        }
        System.out.println(contador);
    }
    public static int division(int primero){
        return primero / 10;
    }
}
