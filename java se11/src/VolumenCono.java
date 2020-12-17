import java.util.Scanner;
/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =
 * ( π * r(2) * h ) / 3.
 */
public class VolumenCono {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("ingrese el radio: ");
        int r = s.nextInt();
        System.out.print("ingrese la altura: ");
        int h = s.nextInt();

        System.out.println("el volumen del cono es de: "+calcula(r,h));
    }
    public static double calcula(float radio,float altura){
        return (Math.PI * Math.pow(radio,2) * altura) / 3;
    }
}
