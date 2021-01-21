import java.util.Scanner;
public class ParIm8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numero = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Escribe un numero: ");
            int num = s.nextInt();
            numero[i] = num;
        }
        for (int i = 0; i < 8; i++) {
            if (numero[i]%2==0){
                System.out.println(numero[i]+" Es par");
            }else {
                System.out.println(numero[i]+" Es impar");
            }
        }
    }
}
