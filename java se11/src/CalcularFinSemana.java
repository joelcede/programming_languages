import java.util.Scanner;

/**
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 */
public class CalcularFinSemana {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hora = 60;
        int dia = 24;


        // si alguien lee esto quiero decir que dejo esto a la mitad
        // por que no me sentia bien emocionalmente, gracias :)
        System.out.print("Que dia es hoy?: ");
        var dias = s.next();
        System.out.print("Que hora es?: ");
        var horas = s.nextInt();
        System.out.print("Que minuto es?: ");
        var minutos = s.nextInt();

        int minutosR = resta(hora, minutos);
        int horasR = resta(dia, horas);

        int container = 0;

        if (dias.equals("lunes")){
            container = container +4;
        }if (dias.equals("martes")){
            container = container +3;
        }if (dias.equals("miercoles")){
            container = container + 2;
        }if (dias.equals("jueves")){
            container = container + 1;
        }if (dias.equals("sabado")){
            container = container + 6;
        }if (dias.equals("domingo")){
            container = container + 5;
        }

        System.out.println("faltan: " + container + " dias con " + horasR + " horas y " + minutosR + " minutos");
    }
    public static int resta(int primero, int segundo){
        return primero - segundo;
    }
}
