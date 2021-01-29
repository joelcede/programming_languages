import java.util.Scanner;
public class AlfilPosicion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Indica la columa del alfil: ");
        String posicionAlfil  = s.next();
        int columnaAlfil = (int)(posicionAlfil.charAt(0)) - 96;
        int filaAlfil = (int)(posicionAlfil.charAt(1)) - 48;

        System.out.println("El alfil puede moverse a las siguientes posiciones:");

        for(int fila = 8; fila >= 1; fila--) {
            for(int columna = 1; columna <= 8; columna++) {
                if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
                        && (! ((filaAlfil == fila) && (columnaAlfil == columna)))) {
                    System.out.print((char)(columna + 96) + "" + fila + " ");
                }
            }
        }

    }
}
