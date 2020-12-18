import java.util.Scanner;

/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 */
public class PiramidePintarWF {
    public static void main(String[] args) {

        // si alguien ve esto, esto es el mayor logro que e tenido programando en java por el
        // momento fecha: 18/12/2020
        // la conclusion es que tengo que ingresa el tamaño de la piramide y hacer la piramide
        // por arte de magia con colores :V, gracias ya se que esta mal comentado

        Scanner s = new Scanner(System.in);

        String colorAmarillo = "\033[033m";
        String colorVerde = "\033[032m";
        String colorAzul = "\033[034m";
        String colorMorado = "\033[037m";

        String caracter = "*";
        String espacio = " ";

        System.out.print("Escriba la altura de la piramide: ");
        int altura = s.nextInt();

        int restarAltura = resta(altura,1);
        int puntaPiramide = resta(altura,restarAltura); //aqui siempre va a dar igual a 1

        int baseMenor = resta((altura+altura),1);
        int baseMayor = suma(baseMenor,2);

        int contador = 0;
        int xd = restarAltura;

        System.out.println("Lista de  colores \n[ ] amarillo\n[ ] verde\n[ ] azul\n[ ] morado");
        System.out.print("De que color quieres la piramide?: ");
        String color = s.next();
        System.out.println(" ");

        while (contador < altura){
            if (puntaPiramide<baseMayor) {
                puntaPiramide = suma(puntaPiramide, 2);
                //String contenedor = caracter.repeat(puntaPiramide);
                if (puntaPiramide-2 > puntaPiramide-4){
                    //espacio.repeat(baseMayor);
                    String piramide = espacio.repeat(xd)+caracter.repeat(puntaPiramide - 2);
                    if (color.equals("amarillo")){
                        System.out.println(colorAmarillo+piramide);
                    }if (color.equals("verde")){
                        System.out.println(colorVerde+piramide);
                    }if (color.equals("azul")){
                        System.out.println(colorAzul+piramide);
                    }if (color.equals("morado")){
                        System.out.println(colorMorado+piramide);
                    }
                }
            }
            contador++;
            xd--;
        }

    }
    public static int resta(int primero, int segundo){
        return primero - segundo;
    }
    public static int suma (int primero, int segundo){
        return primero + segundo;
    }
}
