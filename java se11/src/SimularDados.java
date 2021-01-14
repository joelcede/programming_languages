/**
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 */
public class SimularDados {
    public static void main(String[] args) {

        while (true){
            int dado1 = ((int)(Math.random()*6)+1);
            int dado2 = ((int)(Math.random()*6)+1);

            System.out.println("dado 1: "+dado1+" dado 2: "+dado2);
            
            if (dado1 == dado2){
                break;
            }
        }
    }
}
