/**
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:
 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
 * figuras posibles: corazón, diamante, herradura, campana y limón.
 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
 * ha perdido”.
 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
 * ha recuperado su moneda”.
 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
 * 10 monedas”.
 */
public class TragaPerras {
    public static void main(String[] args) {
        var figura1 = "corazon";
        var figura2 = "diamante";
        var figura3 = "herradura";
        var figura4 = "campana";
        var figura5 = "limon";
        
        int numero = 0,numero2 = 0,numero3 = 0;

        for (int i = 0; i < 1; i++) {
            numero = ((int)(Math.random()*5)+1);
            if (numero==1){ System.out.print(figura1+" "); }
            if (numero==2){ System.out.print(figura2+" "); }
            if (numero==3){ System.out.print(figura3+" "); }
            if (numero==4){ System.out.print(figura4+" "); }
            if (numero==5){ System.out.print(figura5+" "); }
            for (int j = 0; j < 1; j++) {
                numero2 = ((int)(Math.random()*5)+1);
                if (numero2==1){ System.out.print(figura1+" "); }
                if (numero2==2){ System.out.print(figura2+" "); }
                if (numero2==3){ System.out.print(figura3+" "); }
                if (numero2==4){ System.out.print(figura4+" "); }
                if (numero2==5){ System.out.print(figura5+" "); }
                for (int k = 0; k < 1; k++) {
                    numero3 = ((int)(Math.random()*5)+1);
                    if (numero3==1){ System.out.print(figura1+" "); }
                    if (numero3==2){ System.out.print(figura2+" "); }
                    if (numero3==3){ System.out.print(figura3+" "); }
                    if (numero3==4){ System.out.print(figura4+" "); }
                    if (numero3==5){ System.out.print(figura5+" "); }

                }
            }
        }

        if (numero == numero2 || numero == numero3 || numero2 == numero3){
            System.out.print("\nBien,ha recuperado su moneda");
        }if (numero == numero2 && numero == numero3){
            System.out.print("\nEnhorabuena, ha ganado 10 monedas");
        }else {
            System.out.println("\nlo siento ha perdido");
        }
    }
}
