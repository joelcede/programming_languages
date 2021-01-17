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
        
        int almacen1=0,almacen2=0,almacen3=0,numero;

        for (int i = 1; i < 4; i++) {
            numero = ((int)(Math.random()*5)+1);
            if (i == 1){ almacen1 = numero; }
            if (i == 2){ almacen2 = numero; }
            if (i == 3){ almacen3 = numero; }

            if (numero==1){ System.out.print(figura1+" "); }
            if (numero==2){ System.out.print(figura2+" "); }
            if (numero==3){ System.out.print(figura3+" "); }
            if (numero==4){ System.out.print(figura4+" "); }
            if (numero==5){ System.out.print(figura5+" "); }
        }
        if (almacen2 == almacen3 && almacen1 == almacen2){
            System.out.println("\nEnhorabuena, ha ganado 10 monedas");
        }if (almacen1 == almacen2 || almacen1 == almacen3 || almacen2 == almacen3){
            System.out.print("\nBien,ha recuperado su moneda");
        }else {
            System.out.println("\nLo siento ha perdido");
        }

    }
}
