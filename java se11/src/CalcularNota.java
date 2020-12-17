import java.util.Scanner;
/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 * Ejemplo 1:
 * Introduce la nota del primer examen: 7
 * ¿Qué nota quieres sacar en el trimestre? 8.5
 * Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
 * Ejemplo 2:
 * Introduce la nota del primer examen: 8
 * ¿Qué nota quieres sacar en el trimestre? 7
 * Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen..
 */
public class CalcularNota {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //porcentajes
        var cuarenta = 0.4;
        var sesenta = 0.6;

        //ingrso de datos por el teclado
        System.out.print("Introduce la nota del primer examen: ");
        var primeraNota = s.nextDouble();
        System.out.print("Que nota quieres sacar en el reimestre?: ");
        var sacarNota = s.nextDouble();

        //Primero se multiplico la primera nota con el porcentaje del 40%(0.04)
        var porc40 = multiplica(primeraNota,cuarenta);
        //Despues se resto la nota que se queria sacar en el trimestre con la nota obtenida del porcentaje
        var resultadoResta = resta(sacarNota,porc40);
        //por ultimo se dividio la nota sacada de la resta con el porcentaje del 60%(0.06) para obtener la segunda nota
        var resutadoSegundaNota = divide(resultadoResta,sesenta);

        //salida de calculos por la pantalla
        System.out.println("para tener un "+sacarNota+" en el trimestre necesitas sacar un" +
                " "+resutadoSegundaNota+" en el segundo examen");

    }
    public static double multiplica (double primero,double porcentaje){
        return primero * porcentaje;
    }
    public static double resta( double primero, double segundo){
        return primero - segundo;
    }
    public static double divide(double primero, double segundo){
        return primero / segundo;
    }
}
