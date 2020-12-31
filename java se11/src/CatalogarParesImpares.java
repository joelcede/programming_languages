import java.util.Scanner;

/**
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando
 * los dígitos de la siguiente manera: primer dígito del primer número, primer
 * dígito del segundo número, segundo dígito del primer número, segundo
 * dígito del segundo número, tercer dígito del primer número… Para facilitar
 * el ejercicio, podemos suponer que el usuario introducirá dos números de la
 * misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
 * long en lugar de int donde sea necesario para admitir números largos.
 * Ejemplo 1:
 * Por favor, introduzca un número: 9402
 * Introduzca otro número: 6782
 * El número formado por los dígitos pares es 640822
 * El número formado por los dígitos impares es 97
 * cabe recalcar que de todos los ejercicios que e hecho solo a 2 le e copiado codigo,zorry
 */
public class CatalogarParesImpares {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número: ");
        int num1 = s.nextInt();
        System.out.print("Introduzca otro número: ");
        int num2 = s.nextInt();

        int numpares = 0;
        int numimpares = 0;
        // Cuenta las cifras de los dos números y los pone al revés
        int numBasura = num1;
        int reves1 = 0;
        int numDig1 = 0;
        while (numBasura > 0){
            reves1 = ((reves1*10) + (numBasura % 10));
            numBasura /=10;
            numDig1++;
        }
        numBasura = num2;
        int reves2 = 0;
        int numDig2 = 0;
        while (numBasura > 0){
            reves2 = ((reves2*10) + (numBasura % 10));
            numBasura /=10;
            numDig2++;
        }
        // Los mezcla y clasifica
        int revpar1;
        int revpar2;
        for (int i = 1; i <= numDig1+numDig2; i++){
            revpar1 = (reves1%10)%2;
            revpar2 = (reves2%10)%2;
            if ((revpar1 == 0) && (i%2 != 0)){
                numpares = ((numpares*10) + (reves1 % 10));
                reves1 /=10;
            } else if ((revpar1 != 0) && (i%2 != 0)){
                numimpares = ((numimpares*10) + (reves1 % 10));
                reves1 /=10;
            } else if ((revpar2 == 0) && (i%2 == 0)){
                numpares = ((numpares*10) + (reves2 % 10));
                reves2 /=10;
            } else {
                numimpares = ((numimpares*10) + (reves2 % 10));
                reves2 /=10;
            }
        }
        System.out.println("El número formado por las cifras pares es: "+numpares);
        System.out.println("El número formado por las cifras impares es: "+numimpares);
        }
    }
