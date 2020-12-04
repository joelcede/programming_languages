import java.util.Scanner;

/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 */

public class Convertor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double peseta = 166.386; //esto equivale a 1 euro 

        System.out.print("Ingresa la cantidad de Euros: ");
        int euros = s.nextInt();

        System.out.println(euros+" euros equivale a: "+convertir(euros,peseta));
    }

    public static double convertir(int primero,double segundo){
        return primero * segundo;
    }
}
