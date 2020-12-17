import java.util.Scanner;

/**
 * Escribe un programa que dada una hora determinada (horas y minutos),
 * calcule los segundos que faltan para llegar a la medianoche..
 */
public class CalcularMediaNoche {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        var hora = 60; //representa los 60 minutos
        var dia = 24;  //representa las 24 horas

        System.out.print("Escribe la hora que es: ");
        var pminutos = s.nextInt();
        System.out.print("Escibe los mintos que son: ");
        var phora = s.nextInt();

        System.out.println("Hora: "+pminutos+":"+phora);
        var horasRestantes = tiempoRestantes(dia,pminutos);
        var minutosRestantes = tiempoRestantes(hora,phora);
        System.out.println("Faltan: "+horasRestantes+":"+minutosRestantes+" para llegar a las 24:00 h");
    }
    public static int tiempoRestantes(int primero, int segundo){
        return primero - segundo;
    }
}
