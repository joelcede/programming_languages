/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 */
public class NumAleatorio2 {
    public static void main(String[] args) {
        int maximo=0,minimo=199,media=0;

        for (int i = 1; i < 51; i++) {
            int numerosA = ((int)(Math.random()*99)+100);
            if (numerosA>maximo){maximo=numerosA;}
            if (numerosA<minimo){minimo=numerosA;}
            media = media + numerosA;
            System.out.print(numerosA+" ");
        }
        System.out.println("\n"+maximo+" maximo");
        System.out.println(minimo+" minimo");
        System.out.println("la media de la suma total es: "+media);
    }
}
