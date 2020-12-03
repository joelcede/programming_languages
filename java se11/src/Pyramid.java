/**
 * Escribe un programa que pinte por pantalla una pirámide rellena a base de
 * asteriscos. La base de la pirámide debe estar formada por 9 asteriscos.
 */
public class Pyramid {
    public static void main(String[] args) {
        String color = "\033[033m";
        System.out.println(color+"\t*");
        System.out.println("   * *");
        System.out.println("  *   *");
        System.out.println(" *     *");
        System.out.println("*********");
    }
}
