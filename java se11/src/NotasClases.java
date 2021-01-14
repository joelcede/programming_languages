/**
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc
 */
public class NotasClases {
    public static void main(String[] args) {
        int suspenso=0,suficiente=0,bien=0;
        int notable=0,sobresaliente=0;

        System.out.println("Notas");
        for (int i = 0; i < 20; i++) {
            int notas = ((int)(Math.random()*10)+1);
            if (notas<3){ suspenso++;}
            if (notas >=3 && notas <=5){ suficiente++;}
            if (notas>=6 && notas<=7){  bien++;}
            if (notas==8){  notable++;}
            if (notas>8){ sobresaliente++;}
            System.out.print(notas+" ");
        }
        System.out.println("\nFinales");
        System.out.println("en suspenso: "+suspenso);
        System.out.println("suficiente: "+suficiente);
        System.out.println("bien: "+bien);
        System.out.println("notable: "+notable);
        System.out.println("sobresalientes: "+sobresaliente);
    }
}
