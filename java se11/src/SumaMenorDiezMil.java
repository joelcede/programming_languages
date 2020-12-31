import java.util.Scanner;

public class SumaMenorDiezMil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int dMil = 10000;

        System.out.print("Ingrese un numero: ");
        int primero = s.nextInt();

        System.out.print("Ingrese un numero: ");
        int segundo = s.nextInt();

        int suma = suma(primero,segundo);

        while (suma<dMil){
            System.out.print("Ingrese un numero: ");
            int tercer = s.nextInt();
            suma = suma + tercer;
            //System.out.println(suma);
        }
        System.out.println(suma);
    }
    public static int suma (int primero, int segundo){
        return primero + segundo;
    }
}
