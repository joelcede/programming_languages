import java.util.Scanner;

/**
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado
 * que podrá ser una letra, un número o un símbolo como *, +,
 * -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
 * el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
 * izquierda o hacia la derecha..
 */
public class PintarPiramide {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingresa algun caracter: ");
        var caracter = s.next();

        System.out.println("[1] Arriba\n[2] Abajo\n[3] Izquierda\n[4] Derecha");
        System.out.print("Elige hacia donde apunta el vertice: ");
        int elecion = s.nextInt();

        final String x = " +" + caracter + caracter + caracter + caracter + caracter + caracter + caracter + "+";
        final String x1 = "*" + caracter + caracter + caracter + caracter + caracter + caracter + "*";
        switch (elecion){
            case 1:
                System.out.println("     +");
                System.out.println("    +"+caracter+"+   ");
                System.out.println("   +"+caracter+caracter+caracter+"+  ");
                System.out.println("  +"+caracter+caracter+caracter+caracter+caracter+"+ ");
                System.out.println(x);
                System.out.println("+++++++++++");
                break;
            case 2:
                System.out.println("+++++++++++");
                System.out.println(x);
                System.out.println("  +"+caracter+caracter+caracter+caracter+caracter+"+ ");
                System.out.println("   +"+caracter+caracter+caracter+"+  ");
                System.out.println("    +"+caracter+"+   ");
                System.out.println("     +");
                break;
            case 3:

                System.out.println("      *");
                System.out.println("    *"+caracter+caracter+"*");
                System.out.println("  *"+caracter+caracter+caracter+caracter+"*");
                System.out.println(x1);
                System.out.println("  *"+caracter+caracter+caracter+caracter+"*");
                System.out.println("    *"+caracter+caracter+"*");
                System.out.println("      *");
                break;
            case 4:
                System.out.println("*");
                System.out.println("*"+caracter+caracter+"*");
                System.out.println("*"+caracter+caracter+caracter+caracter+"*");
                System.out.println(x1);
                System.out.println("*"+caracter+caracter+caracter+caracter+"*");
                System.out.println("*"+caracter+caracter+"*");
                System.out.println("*");
        }

    }
}
