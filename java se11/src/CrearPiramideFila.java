import java.util.Scanner;

/**
 * Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas como en la siguiente figura:
 *    1
 *   222
 *  33333
 * 4444444
 */
public class CrearPiramideFila {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        int numero = s.nextInt();
        System.out.print("Escribe un numero de filas: ");
        int filas = s.nextInt();

        int sumarFila = suma(filas,1);
        int columna = dividir(sumarFila,2);

        int encColum = dividir(resta(filas,1),2);

        int contador1 = 0;
        int contador2 = 1;
        int inicio = residuo(filas,2);
        String espacio = " ";

        while (contador1<columna){
            if (inicio<filas+2){
                inicio = suma(inicio,2);
                if (inicio-2 > inicio-4){
                    //String camString = int(numero);
                    String piramide = espacio.repeat(encColum)+ String.valueOf(contador2).repeat(inicio-2);
                    if (contador2<numero){
                        contador2++;
                    }else contador2--;
                    System.out.println(piramide);
                }
            }
            contador1++;
            encColum--;
        }

    }

    public static int resta(int num1, int num2){
        return num1 - num2;
    }
    public static int suma(int num1,int num2){
        return num1 + num2;
    }
    public static int dividir(int num1, int num2){
        return num1 / num2;
    }
    public static int residuo(int num1, int num2){
        return num1 % num2;
    }
}
