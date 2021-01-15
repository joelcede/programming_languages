/**
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria
 * entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
 * aleatoria entre 1 y 40 caracteres.
 */
public class DiezLineas {
    public static void main(String[] args) {
        var caracter1 = "*";
        var caracter2 = "-";
        var caracter3 = "=";
        var caracter4 = ".";
        var caracter5 = "|";
        var caracter6 = "@";

        for (int i = 0; i < 10; i++) {
            int caracterAleatorio = ((int)(Math.random()*6)+1);
            int longitud = ((int)(Math.random()*40)+1);
            switch (caracterAleatorio){
                case 1:
                    System.out.println(caracter1.repeat(longitud));
                    break;
                case 2:
                    System.out.println(caracter2.repeat(longitud));
                    break;
                case 3:
                    System.out.println(caracter3.repeat(longitud));
                    break;
                case 4:
                    System.out.println(caracter4.repeat(longitud));
                    break;
                case 5:
                    System.out.println(caracter5.repeat(longitud));
                    break;
                case 6:
                    System.out.println(caracter6.repeat(longitud));
            }


        }

    }
}
