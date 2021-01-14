/**
 * Realiza un programa que muestre al azar el nombre de una carta de la
 * baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
 * sería el 1). Para convertir un número en una cadena de caracteres podemos
 * usar String.valueOf(n).
 */
public class CartaAzar {
    public static void main(String[] args) {
        int random = ((int)(Math.random()*4)+1);
        var palabra1 = "J";
        var palabra2 = "Q";
        var palabra3 = "K";
        var palabra4 = "A";

        if (random == 1){
            //picas
            for (int i = 1; i < 2; i++) {
                int random2 = ((int)(Math.random()*14)+1);
                if (random2 == 11){ System.out.print(palabra1);}
                if (random2 == 12){ System.out.print(palabra2);}
                if (random2 == 13){ System.out.print(palabra3);}
                if (random2 == 14){ System.out.print(palabra4);}
                if (random2 < 11){System.out.print(random2);}
                System.out.print(" de picas");
            }
        }if (random == 2){
            //corazones
            for (int i = 1; i < 2; i++) {
                int random3 = ((int)(Math.random()*14)+1);
                if (random3 == 11){ System.out.print(palabra1);}
                if (random3 == 12){ System.out.print(palabra2);}
                if (random3 == 13){ System.out.print(palabra3);}
                if (random3 == 14){ System.out.print(palabra4);}
                if (random3 < 11){System.out.print(random3);}
                System.out.print(" de corazones");
            }
        }if (random == 3){
            //diamantes
            for (int i = 1; i < 2; i++) {
                int random4 = ((int)(Math.random()*14)+1);
                if (random4 == 11){ System.out.print(palabra1);}
                if (random4 == 12){ System.out.print(palabra2);}
                if (random4 == 13){ System.out.print(palabra3);}
                if (random4 == 14){ System.out.print(palabra4);}
                if (random4 < 11){System.out.print(random4);}
                System.out.print(" de diamantes");
            }
        }if (random == 4){
            //treboles
            for (int i = 1; i < 2; i++) {
                int random5 = ((int)(Math.random()*14)+1);
                if (random5 == 11){ System.out.print(palabra1);}
                if (random5 == 12){ System.out.print(palabra2);}
                if (random5 == 13){ System.out.print(palabra3);}
                if (random5 == 14){ System.out.print(palabra4);}
                if (random5 < 11){System.out.print(random5);}
                System.out.print(" de treboles");
            }
        }
    }
}
