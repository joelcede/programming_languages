/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as
 */
public class BarajaEspanola {
    public static void main(String[] args) {
        int random = ((int)(Math.random()*4)+1);
        var palabra1 = "Sota";
        var palabra2 = "Caballo";
        var palabra3 = "Rey";
        var palabra4 = "As";

        if (random == 1){
            //picas
            for (int i = 1; i < 2; i++) {
                int random2 = ((int)(Math.random()*10)+1);
                if (random2 == 7){ System.out.print(palabra1);}
                if (random2 == 8){ System.out.print(palabra2);}
                if (random2 == 9){ System.out.print(palabra3);}
                if (random2 == 10){ System.out.print(palabra4);}
                if (random2 < 7){System.out.print(random2);}
                System.out.print(" de picas");
            }
        }if (random == 2){
            //corazones
            for (int i = 1; i < 2; i++) {
                int random3 = ((int)(Math.random()*10)+1);
                if (random3 == 7){ System.out.print(palabra1);}
                if (random3 == 8){ System.out.print(palabra2);}
                if (random3 == 9){ System.out.print(palabra3);}
                if (random3 == 10){ System.out.print(palabra4);}
                if (random3 < 7){System.out.print(random3);}
                System.out.print(" de corazones");
            }
        }if (random == 3){
            //diamantes
            for (int i = 1; i < 2; i++) {
                int random4 = ((int)(Math.random()*10)+1);
                if (random4 == 7){ System.out.print(palabra1);}
                if (random4 == 8){ System.out.print(palabra2);}
                if (random4 == 9){ System.out.print(palabra3);}
                if (random4 == 10){ System.out.print(palabra4);}
                if (random4 < 7){System.out.print(random4);}
                System.out.print(" de diamantes");
            }
        }if (random == 4){
            //treboles
            for (int i = 1; i < 2; i++) {
                int random5 = ((int)(Math.random()*10)+1);
                if (random5 == 7){ System.out.print(palabra1);}
                if (random5 == 8){ System.out.print(palabra2);}
                if (random5 == 9){ System.out.print(palabra3);}
                if (random5 == 10){ System.out.print(palabra4);}
                if (random5 < 7){System.out.print(random5);}
                System.out.print(" de treboles");
            }
        }
    }
}
