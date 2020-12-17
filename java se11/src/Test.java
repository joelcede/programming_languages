import java.util.Scanner;

/**
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
 * nos está siendo infiel. El programa irá haciendo preguntas que el usuario
 * contestará con verdadero o falso. Cada pregunta contestada como verdadero
 * sumará 3 puntos. Las preguntas contestadas con falso no suman puntos..
 */
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Entre mas puntos tengas mas infiel eres xd");
        System.out.print("Eres infiel?: "); var pregunta1 = s.next();
        System.out.print("Te gusta poner cachos?: "); var pregunta2 = s.next();
        System.out.print("Cuantos novios tienes?: "); int pregunta3 = s.nextInt();
        System.out.print("tienes amante? xd: "); var pregunta4 = s.next();
        System.out.print("Hola?: "); var pregunta5 = s.next();

        int contador = 0;
        if (pregunta1.equals("si")){
            contador = contador + 3;
        }if (pregunta2.equals("si")){
            contador = contador + 3;
        }if (pregunta3 > 1){
            contador = contador + 3;
        }if (pregunta4.equals("si")){
            contador = contador + 3;
        }if (pregunta5.equals("hola")){
            contador = contador + 3;
        }
        System.out.println("tienes alrededor de: "+contador+" puntos");
    }
}
