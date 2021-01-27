import java.util.Scanner;

/**
 * Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere resaltar los
 * múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
 * array escribiendo los números que se quieren resaltar entre corchetes.
 */
public class Array527 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numero = new int[20];

        for (int i = 0; i < 20; i++) {
            int numAleatorios = ((int)(Math.random()*401));
            numero[i] = numAleatorios;
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(numero[i]+" ");
        }
        System.out.println();
        System.out.print("[1] Multiplo de 5y2 | [2] Multiplo de 7: ");
        int elegir = s.nextInt();

        for (int i = 0; i < 20; i++) {
            switch (elegir){
                case 1:
                    if (numero[i]%2==0 || numero[i]%5==0){
                        System.out.print("["+numero[i]+"] ");
                    }
                    else {
                        System.out.print(numero[i]+" ");
                    }
                    break;
                case 2:
                    if (numero[i]%7==0){
                        System.out.print("["+numero[i]+"] ");
                    }else {
                        System.out.print(numero[i]+" ");
                    }
                    break;
            }
        }
    }
}
