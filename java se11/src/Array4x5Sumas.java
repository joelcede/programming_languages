import java.util.Scanner;

/**
 * Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 */
public class Array4x5Sumas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] numeros = new int[4][5];
        int suma1F = 0,suma2F=0,suma3F=0,suma4F=0;
        int suma1C=0,suma2C=0,suma3C=0,suma4C=0,suma5C=0;
        int total;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                int numRand = ((int)(Math.random()*1000)+100);
                numeros[i][j] = numRand;
                if (j%5==0){
                    System.out.print("\n");
                }
                System.out.print(numeros[i][j]+" ");
            }
        }
        for (int k = 0; k < 1; k++) {
            for (int l = 0; l < 5; l++) {
                suma1F = suma1F + numeros[k][l];
            }
        }
        for (int k = 1; k < 2; k++) {
            for (int l = 0; l < 5; l++) {
                suma2F = suma2F + numeros[k][l];
            }
        }
        for (int k = 2; k < 3; k++) {
            for (int l = 0; l < 5; l++) {
                suma3F = suma3F + numeros[k][l];
            }
        }
        for (int k = 3; k < 4; k++) {
            for (int l = 0; l < 5; l++) {
                suma4F = suma4F + numeros[k][l];
            }
        }
        //COLUMNA
        for (int k = 0; k < 4; k++) {
            for (int l = 0; l < 1; l++) {
                suma1C = suma1C + numeros[k][l];
            }
        }
        for (int k = 0; k < 4; k++) {
            for (int l = 1; l < 2; l++) {
                suma2C = suma2C + numeros[k][l];
            }
        }
        for (int k = 0; k < 4; k++) {
            for (int l = 2; l < 3; l++) {
                suma3C = suma3C + numeros[k][l];
            }
        }
        for (int k = 0; k < 4; k++) {
            for (int l = 3; l < 4; l++) {
                suma4C = suma4C + numeros[k][l];
            }
        }
        for (int k = 0; k < 4; k++) {
            for (int l = 4; l < 5; l++) {
                suma5C = suma5C + numeros[k][l];
            }
        }
        total = suma1F+suma2F+suma3F+suma4F+suma1C+suma2C+suma3C+suma4C+suma5C;
        System.out.print("\nFila 1: "+suma1F+" ");
        System.out.print("\nFila 2: "+suma2F+" ");
        System.out.print("\nFila 3: "+suma3F+" ");
        System.out.print("\nFila 4: "+suma4F+" ");
        System.out.print("\nColumna 1: "+suma1C+" ");
        System.out.print("\nColumna 2: "+suma2C+" ");
        System.out.print("\nColumna 3: "+suma3C+" ");
        System.out.print("\nColumna 4: "+suma4C+" ");
        System.out.print("\nColumna 5: "+suma5C+" ");
        System.out.println("\nTotal: "+total);
    }
}
