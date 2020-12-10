import java.util.Scanner;

/**
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación
 * que se califica como apto o no apto, por tanto se debe preguntar al usuario
 * ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
 * resultado de la recuperación es apto, la nota será un 5; en caso contrario, se
 * mantiene la nota media anterior.
 */
public class CalcularTrimestre {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Primera nota: ");
        int control1 = s.nextInt();
        System.out.print("Segunda nota: ");
        int control2 = s.nextInt();
        var notaPromedio = nota(control1,control2);

        if (notaPromedio >= 5){
            System.out.println("El alumno esta aprobado con: "+notaPromedio);
        }else {
            System.out.println("Su nota es: "+notaPromedio);
            System.out.println("Esta para recuperacion");
            System.out.println("-----Examen de recuperacion-----");
            System.out.print("Cuanta es su nota de examen de recuperacion?: ");
            int notaRecuperacion = s.nextInt();
            if (notaRecuperacion >= 5){
                System.out.println("Usted es apto,su nota es de: "+notaRecuperacion);
            }else {
                System.out.println("No es apto, su nota es igual a la anterior: "+notaPromedio);
            }
        }
    }
    public static int nota(int primero, int segundo){
        int va = primero + segundo;
        return va / 2;
    }
}
