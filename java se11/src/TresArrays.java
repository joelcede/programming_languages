/**
 * Define tres arrays de 20 números enteros cada una, con nombres numero,
 * cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
 * array cuadrado se deben almacenar los cuadrados de los valores que hay en el
 * array numero. En el array cubo se deben almacenar los cubos de los valores que
 * hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
 * en tres columnas.
 */
public class TresArrays {
    public static void main (String[] args){
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        System.out.println("N\tN**N\tN*N*N");

        for (int i = 0; i < 20; i++) {
            int aleatorio = ((int)(Math.random()*100));
            numero[i] = aleatorio;
            cuadrado[i] = aleatorio * aleatorio;
            cubo[i] = (int) Math.pow(aleatorio,2);
            System.out.print(numero[i]+"\t"+cuadrado[i]+"\t "+cubo[i]+"\n");
        }
    }
}
