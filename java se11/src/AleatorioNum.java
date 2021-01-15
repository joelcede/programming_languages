/**
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 */
public class AleatorioNum {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            int numerosA = ((int)(Math.random()*10)+1);
            System.out.print(numerosA+" ");
        }
    }
}
