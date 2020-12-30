import java.util.Scanner;

/**
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 * El día de la semana se puede pedir como un número (del 1 al 7) o como
 * una cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario
 * introduce los datos correctamente y que el segundo día es posterior al primero.
 * A continuación se muestra un ejemplo:
 *
 * Por favor, introduzca la primera hora.
 * Día: lunes
 * Hora: 18
 * Por favor, introduzca la segunda hora.
 * Día: martes
 * Hora: 20
 * Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 */
public class HorasTranscurridas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduzca la primera hora: "); int pHora = s.nextInt();
        System.out.print("Dia 1: ");int dia1 = s.nextInt();

        System.out.print("Por favor, introduzca la segunda hora: "); int sHora = s.nextInt();
        System.out.print("Dia 2: ");int dia2 = s.nextInt();
        int contadorH1 = 0;

        int contadorD = 24;
        int contador = 0;

        while (dia1<dia2) {
            dia1++;
            contador++;
        }
        while (pHora<contadorD){
            pHora++;
            contadorH1++;
        }
        int restoDia = multiplica(contadorD,contador);
        int segundo = resta(contadorD,sHora);
        int primerTiempo = suma(contadorH1,restoDia);
        int ResultadoT = resta(primerTiempo,segundo);
        System.out.println(
                "Entre las "+pHora+":00h del dia "+dia1+" y las "+sHora+":00h del "+dia2+" hay "+ResultadoT+" hora/s");

    }
    public static int multiplica(int num1, int num2) {
        return num1 * num2;
    }
    public static int resta(int num1, int num2){
        return num1 - num2;
    }
    public static int suma(int num1,int num2){
        return num1 + num2;
    }
}
