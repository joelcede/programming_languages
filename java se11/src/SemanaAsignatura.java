import java.util.Scanner;

/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día..
 */
public class SemanaAsignatura {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese un dia de la semana: ");
        var dia = s.nextInt();

        switch (dia){
            case 1:
                System.out.println("toca matematica a la primera hora");
                break;
            case 2:
                System.out.println("toca english a la primera hora");
                break;
            case 3:
                System.out.println("toca programacion a la primera hora");
                break;
            case 4:
                System.out.println("toca base de datos a la primera hora");
                break;
            case 5:
                System.out.println("toca materia de relleno a la primera hora");
                break;
            default:
                System.out.println("dia libre");
        }
    }
}
