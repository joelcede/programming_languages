import java.util.Scanner;
/**
Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos.

 */
public class MaxMinArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numero = new int[100];
        int menor = 500;
        int mayor = 0;

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
                    if (i%25==0){
                        System.out.print("\n");
                    }
                   if (numero[i] == menor){
                       System.out.print("**"+menor+"** ");
                   }else {
                       System.out.print(numero[i]+" ");
                   }
                }
                break;
            case 2:
                for (int i = 0; i < 100; i++) {
                    if (i%25==0){
                        System.out.print("\n");
                    }
                    if (numero[i] == mayor){
                        System.out.print("**"+mayor+"** ");
                    }else {
                        System.out.print(numero[i]+" ");
                    }
                }
                break;
        }
    }
}
