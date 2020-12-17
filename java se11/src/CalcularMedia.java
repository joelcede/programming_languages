import java.util.Scanner;

/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente)..
 */
public class CalcularMedia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        var primero = s.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        var segundo = s.nextInt();
        System.out.print("Ingresa el tercer numero: ");
        var tercero = s.nextInt();

        var resultadoSuma = suma(primero,segundo,tercero);
        var resultadoFinal = dividir(resultadoSuma);
        System.out.println("la nota es: "+resultadoFinal);

        if (resultadoFinal < 4){
            System.out.println("tiene una nota insuficiente");
        }if ((resultadoFinal >=5) && (resultadoFinal <= 6)){
            System.out.println("tiene una nota suficiente");
        }if (resultadoFinal == 7){
            System.out.println("tiene buena nota");
        }if (resultadoFinal == 8){
            System.out.println("Su nota es notable");
        }if (resultadoFinal >= 9){
            System.out.println("Su nota es sobresaliente");
        }
    }
    public static int suma(int primero, int segundo, int tercero){
        return primero + segundo + tercero;
    }
    public static int dividir(int primero){
        return primero / 3;
    }
}
