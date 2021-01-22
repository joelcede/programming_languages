import java.util.Scanner;
public class MaxMinArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numero = new int[100];
        int menor = 500;
        int mayor = 0;
        String almacen;

        for (int i = 0; i < 100; i++) {
            int numAleatorio = ((int)(Math.random()*500));

            if (numAleatorio > mayor){
                mayor = numAleatorio;
            }if (numAleatorio < menor){
                menor = numAleatorio;
            }

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
                    if (numero[i] == menor){

                    }
                }
        }

    }
}
