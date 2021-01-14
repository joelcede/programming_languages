import java.util.Scanner;
/**
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número
 * entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 * programa debe preguntar si el número que estás pensando es mayor o menor
 * que el que te acaba de decir.
 */
public class Inversa6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int intentos = 1;

        while (intentos < 6){
            int numero =((int)(Math.random()*100)+1);
            System.out.print("Adivina el numero: ");
            int adivina = s.nextInt();
            if (adivina > numero){
                System.out.println("El numero es mmenor");
            }
            if (adivina < numero){
                System.out.println("el numero es mayor");
            }
            if (adivina == numero){
                System.out.println("Correcto acabas de pasar la vida");
            }


            intentos++;
        }
    }
}
