import java.util.Scanner;

//Realiza un conversor de Mb a Kb..

public class ConversonMbKb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int kb = 8000;

        System.out.print("cuantos MB va a convetir?: ");
        int coversorkb = s.nextInt();

        System.out.println(coversorkb+" es igual a: "+conversor(coversorkb,kb)+" Kb");
    }
    public static int conversor(int n1, int n2){
        return n1 * n2;
    }
}
