/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 */
public class ParesAleatorios {
    public static void main(String[] args) {
        int contador = 0;

        while (true){
            int numero = ((int)(Math.random()*100)+1);
            if (numero%2==0){
                System.out.print(numero+" ");
                if (numero == 24){
                    System.out.println("\nTe salio el 24");
                    break;
                }
            }
            contador++;
        }
        System.out.println("se ha generado "+contador+" numeros");
    }
}
