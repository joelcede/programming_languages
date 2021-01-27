import java.util.Scanner;
public class Array4x5Sumas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] numeros = new int[4][5];
        int suma1C = 0,suma2C=0,suma3C=0,suma4C=0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                int numRand = ((int)(Math.random()*11));
                numeros[i][j] = numRand;
                if (j%6==0){
                    System.out.print("\n");
                }
                System.out.print(numeros[i][j]+" ");
            }
        }
        for (int k = 0; k < 1; k++) {
            for (int l = 0; l < 5; l++) {
                suma1C = suma1C + numeros[k][l];
            }
        }
        for (int k = 1; k < 2; k++) {
            for (int l = 0; l < 5; l++) {
                suma2C = suma2C + numeros[k][l];
            }
        }
        for (int k = 2; k < 3; k++) {
            for (int l = 0; l < 5; l++) {
                suma3C = suma3C + numeros[k][l];
            }
        }
        for (int k = 3; k < 4; k++) {
            for (int l = 0; l < 5; l++) {
                suma4C = suma4C + numeros[k][l];
            }
        }
        System.out.print("\nColumna 1: "+suma1C+" ");
        System.out.println("\nColumna 2: "+suma2C+" ");
        System.out.print("\nColumna 3: "+suma3C+" ");
        System.out.println("\nColumna 4: "+suma4C+" ");
    }
}
