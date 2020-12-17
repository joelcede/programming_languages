import java.util.Scanner;
/**
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado..
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("------CALCULADORA------");
        System.out.print("primer numero: ");
        int primero = s.nextInt();
        System.out.print("segundo numero: ");
        int segundo = s.nextInt();

        int sum = suma(primero,segundo);
        int res = resta(primero,segundo);
        int mul = multiplica(primero,segundo);
        int div = divide(primero,segundo);

        System.out.println("la suma de: "+primero+" + "+segundo+" = "+sum);
        System.out.println("la resta de: "+primero+" - "+segundo+" = "+res);
        System.out.println("la multiplicacion de: "+primero+" x "+segundo+" = "+mul);
        System.out.println("la division de: "+primero+" / "+segundo+" = "+div);
    }
    public static int suma(int n1,int n2){
        return n1 + n2;
    }
    public static int resta(int n1,int n2){
        return n1 - n2;
    }
    public static int multiplica(int n1, int n2){
        return n1 * n2;
    }
    public static int divide(int n1, int n2){
        return n1 / n2;
    }
}
