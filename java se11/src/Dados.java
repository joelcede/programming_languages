/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 */
public class Dados {
    public static void main(String[] args) {
        int tiradas;
        int suma = 0;
        for (int i = 1; i < 4; i++) {
            tiradas = ((int)(Math.random()*3)+1);
            suma = suma + tiradas;
            System.out.println("tirada "+i+" : "+tiradas);
        }
        System.out.println("la suma de los 3 resultados es: "+suma);
    }
}
