//Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
public class Multiplo5 {
    public static void main(String[] args) {
        int numero = 0;
        do {
            numero++;
            if (numero%5 == 0){
                System.out.println(numero);
            }
        }while (numero < 101);
    }
}
