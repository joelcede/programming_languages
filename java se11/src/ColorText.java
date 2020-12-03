public class ColorText {
    public static void main(String[] args) {
        /**
         * para elegir un color siempre se comienza con:
         * \003[el numero que se pone representa el color + m.
         * */

        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String blanco = "\033[37m";

        //println imprime con saltos de lineas
        System.out.println(rojo+"prueba");
        //print imprime datos sin saltos de lineas
        System.out.print(naranja + "mandarina" + verde + " hierba");
        System.out.print(naranja + " saltamontes" + rojo + " tomate");
        System.out.print(blanco + " sábanas" + azul + " cielo");
        System.out.print(morado + " nazareno" + azul + " mar");

    }
}
