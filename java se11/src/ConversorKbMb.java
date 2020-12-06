import java.util.Scanner;
/**
 * Realiza un conversor de Kb a Mb.
 */
public class ConversorKbMb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double mb = 0.001;

        System.out.print("Cuantos deseas convertir a Mb?: ");
        int ingreso = s.nextInt();

        System.out.println(ingreso+" es igual a: "+conversor(ingreso,mb)+" mb");
    }
    public static double conversor(int n1,double n2){
        return n1 * n2;
    }
}
