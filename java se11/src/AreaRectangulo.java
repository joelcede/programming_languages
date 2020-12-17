import java.util.Scanner;

/**
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado..
 */

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("ingresa la base: ");
        int base = s.nextInt();

        System.out.print("Ingresa la altura: ");
        int altura = s.nextInt();

        System.out.println("El area es: "+area(base,altura));
    }
    public static int area(int b,int a){
        return b * a;
    }
}
