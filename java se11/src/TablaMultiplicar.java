import java.util.Scanner;

//Muestra la tabla de multiplicar de un número introducido por teclado..

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Tabla hasta del 1 al 10");
        System.out.print("Ingrese un numero: ");
        int numeroTabla = numero.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(numeroTabla+" * "+i+" = "+(numeroTabla*i));
        }
    }
}
