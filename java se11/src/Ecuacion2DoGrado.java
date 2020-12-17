import java.util.Scanner;

/**
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax2 + bx + c = 0)..
 */
public class Ecuacion2DoGrado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Lo se me falta documentar mejor esto, da pereza

        System.out.print("Ingresa  a: ");
        var a = s.nextInt();
        System.out.print("Ingresa  b: ");
        var b = s.nextInt();
        System.out.print("Ingresa  c: ");
        var c = s.nextInt();

        //calculos
        var contResta = resta(0,b);
        //contendor, esto esta dentro de la raiz
        var contEleva = elevar(b);
        var contMulti = multiplica(a,c);
        var contResta2 = resta(contEleva,contMulti);
        var contRaiz = raiz(contResta2);
        //sobre
        var debajo = multiplicaNormal(2,a);
        //suma x1
        var sumax1 = suma(contResta,contRaiz);
        //suma x2
        var restax1 = resta(contResta,contRaiz);

        System.out.println("resltado");
        System.out.println((int) sumax1+"/"+debajo);
        System.out.println((int) restax1+"/"+debajo);
    }
    public static double elevar(int eleva){
        return Math.pow(eleva,2);
    }
    public static int multiplicaNormal(int primero, int segundo){
        return primero * segundo;
    }
    public static int multiplica(int primero,int segundo){
        return 4 * primero * segundo;
    }
    public static double raiz(double sacar){
        return Math.sqrt(sacar);
    }
    public static double resta(double primero, double segundo){
        return primero - segundo;
    }
    public static double suma(double primero, double segundo){
        return primero + segundo;
    }
}
