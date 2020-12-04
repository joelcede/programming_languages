import java.util.Scanner;

/**
 *Escribe un programa que calcule el salario semanal de un empleado en base
 * a las horas trabajadas, a razón de 12 euros la hora.
 */
public class HorasTrabajadas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int eurosHora = 12;
        System.out.print("cuantas horas tiene trabajadas?: ");
        int horas = s.nextInt();

        System.out.println("la ganancia de la semana es de: "+calcula(eurosHora,horas)+" euros");

    }
    public static int calcula(int primer,int segundo){
        return primer * segundo;
    }
}
