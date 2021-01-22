import java.util.Scanner;
public class MaxMinArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numero = new int[100];
        int contador = 1;
        String almacen;
        int almaceni = 0;

        for (int i = 0; i < 100; i++) {
            int numAleatorio = ((int)(Math.random()*500));
            numero[i] = numAleatorio;
        }
        for (int i = 0; i < 100; i++) {
            if (i%25==0){
                System.out.print("\n");
            }
            System.out.print(numero[i]+" ");
        }

        System.out.println();
        System.out.print("Que quiere destacar? (1 -minimo, 2 -maximo): ");
        int elegido = s.nextInt();

        switch (elegido){
            case 1:
                for (int i = 0; i < 100; i++) {
                    if (numero[i] < numero[contador]){
                        System.out.print(numero[i]+" ");
                    }
                    contador++;
                }
                break;
            case 2:
                System.out.println("puta");
                break;
        }
        System.out.println(almaceni);
    }
}
