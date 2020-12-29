import java.util.Scanner;

/**
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 */
public class PosicionarDigito {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int cantidad;
        int contador = 0;

        System.out.println("Busqueda de un digito por la posicion.");
        System.out.print("Escribe un numero: ");
        int numero = s.nextInt();
        System.out.print("Ingresa un digito: ");
        int digito = s.nextInt();

        String str1 = String.valueOf(numero);
        cantidad = str1.length();

        String str2 = String.valueOf(digito);

        for (int i = 0; i < cantidad; i++) {
            int posicion = str1.indexOf(str2)+1;
            if (digito==posicion){
                System.out.println("madre mia willy");
            }else {
                System.out.println("el numero "+digito+" esta en la posicion: "+posicion+" del numero "+numero);
            }

        }

    }
}
