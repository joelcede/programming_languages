import java.util.Scanner;

/**
 * Escribe un programa que ordene tres números enteros introducidos por
 * teclado..
 */
public class OrdenarNumerosIf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Primer numero: ");
        var primer = s.nextInt();
        System.out.print("segundo numero: ");
        var segundo = s.nextInt();
        System.out.print("tercer numero: ");
        var tercero = s.nextInt();

        if ((primer > segundo) && (segundo > tercero)){
            System.out.println(tercero+" "+segundo+" "+primer);
        }else if ((primer > tercero) && (tercero > segundo)){
            System.out.println(segundo+" "+tercero+" "+primer);
        }else if ((segundo > primer) && (primer > tercero)){
            System.out.println(tercero+" "+primer+" "+segundo);
        }else if ((segundo > tercero) && (tercero > primer)){
            System.out.println(primer+" "+tercero+" "+segundo);
        }else if ((tercero > primer) && (primer > segundo)){
            System.out.println(segundo+" "+primer+" "+tercero);
        }else if ((tercero > segundo) && (segundo > primer)){
            System.out.println(primer+" "+segundo+" "+tercero);
        }

    }
}
