import java.util.Scanner;

/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
 * euros la hora.
 */
public class SalarioXHora {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        var pago40 = 12;
        var hora41 = 16;

        System.out.print("cuantas horas a trabajado?: ");
        var horasTrabajadas = s.nextInt();

        if (horasTrabajadas < 41){
            System.out.println("El pago es de: "+multipHoras(pago40,horasTrabajadas)+
                    "$ por trabajar "+horasTrabajadas+" horas");
        }else {
            System.out.println("El pago es de: "+multipHoras(hora41,horasTrabajadas)+
                    "$ por trabajar "+horasTrabajadas+" horas");
        }
    }
    public static int multipHoras(int primero, int segundo){
        return primero * segundo;
    }
}
