import java.util.Scanner;

/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula
 * t =(√2h/g) siendo g = 9.81m/s(elvado a 2).
 */
public class CalcularTiempo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        var gMetros = 9.81;

        System.out.print("Indique la altura: ");
        var altura = s.nextDouble();

        //variables
        var contentmultip = multiplica(altura);
        var contentElevar = elevar(gMetros);
        var contentdivi = dividir(contentmultip,contentElevar);
        var resultado = raiz(contentdivi);

        System.out.println("El objeto tarda en caer en: "+(float) resultado+" minutos");
    }
    public static double multiplica(double h){
        return 2 * h;
    }
    public static double elevar(double g){
        return Math.pow(g,2);
    }
    public static double dividir(double h, double g){
        return h / g;
    }
    public static double raiz(double raizdiv){
        return Math.sqrt(raizdiv);
    }
}
