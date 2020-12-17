import java.util.Scanner;

/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
 */
public class NumeroSemana {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese un numero (1-7): ");
        var diaS = s.nextInt();

        switch (diaS){
            case 1:
                System.out.println("el dia "+diaS+" es lunes");
                break;
            case 2:
                System.out.println("el dia "+diaS+" es Martes");
                break;
            case 3:
                System.out.println("el dia "+diaS+" es Miercoles");
                break;
            case 4:
                System.out.println("el dia "+diaS+" es Jueves");
                break;
            case 5:
                System.out.println("el dia "+diaS+" es Viernes");
                break;
            case 6:
                System.out.println("el dia "+diaS+" es sabado");
                break;
            case 7:
                System.out.println("el dia "+diaS+" es Domingo");
                break;
            default:
                System.out.println("el dia "+diaS+" No existe ese dia, error ");

        }
    }
}
