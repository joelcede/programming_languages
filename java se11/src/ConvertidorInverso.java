import java.util.Scanner;
/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 */
public class ConvertidorInverso {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double euros = 0.006; //equivalente de 1 peseta a euro

        System.out.print("ingresa la cantidad de pesetas: ");
        double pesetas = s.nextDouble();

        System.out.println(pesetas+"es igual a: "+convetidor(pesetas,euros)+" euros");
    }
    public static double convetidor(double primero,double segundo){
        return primero * segundo;
    }
}
