import java.util.Scanner;
/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
public class AbrirCajaFuerte {
    public static void main(String[] args) {
        Scanner clave = new Scanner(System.in);
        int combinacion = 1234;
        int intenos = 5;
        for (int i = 0; i <intenos ; i++) {
            System.out.print("Ingresa la clave de acceso: ");
            int claveAcceso = clave.nextInt();

            if (claveAcceso == combinacion){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }else {
                System.out.println("Lo siento, esa no es la combinación");
            }
        }
    }
}
