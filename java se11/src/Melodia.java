import java.util.Arrays;

/**
 * Realiza un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa,
 * sol, la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual
 * a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 * compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
 * con dos barras.
 * d) La última nota de la melodía debe coincidir con la primera.
 * Ejemplo 1:
 * do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
 * Ejemplo 2:
 * la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
 */
public class Melodia {
    public static void main(String[] args) {
        var nota1="do";
        var nota2="re";
        var nota3="mi";
        var nota4="fa";
        var nota5="sol";
        var nota6="la";
        var nota7="si";
        int contador = 1;

        int tamanoMelodia = ((int)(Math.random()*5)+1);

        for (int i = 0; i < tamanoMelodia; i++) {
            for (int j = 0; j <4 ; j++) {
                int nota = ((int)(Math.random()*28)+4);

                if (nota%4==0){
                    if (nota==4){ System.out.print(" "+nota1+" "); }
                    if (nota==8){ System.out.print(" "+nota2+" "); }
                    if (nota==12){ System.out.print(" "+nota3+" "); }
                    if (nota==16){ System.out.print(" "+nota4+" "); }
                    if (nota==20){ System.out.print(" "+nota5+" "); }
                    if (nota==24){ System.out.print(" "+nota6+" "); }
                    if (nota==28){ System.out.print(" "+nota7+" "); }
                }else {
                    j--;
                }
            }
            System.out.print("/");
        }
        System.out.print("/");
        /*
        "\nLo siento no se como hacer que el primero sea igual al ulimo" +
                "intente de muchas formas\n, como iterarar desde los for i y j hasta dividir los" +
                "el contador puesto y luego asignando ese valor al primer y ultimo lugar" +
                "pero no puede, ahora no tengo internet asi que despues investigo"

         */
    }
}
