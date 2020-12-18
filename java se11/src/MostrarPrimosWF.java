/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 */
public class MostrarPrimosWF {
    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) {
            if (i%2 == 1){
                System.out.println(i+" Es primo");
            }
        }
    }
}
