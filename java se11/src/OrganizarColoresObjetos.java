import java.util.Scanner;
public class OrganizarColoresObjetos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contador = 0,contador2= 0;
        int resultado;
        String[] palabras = new String[8];
        String[] palOrden = new String[8];
        String [] colores = new String[9];
        colores[0]="verde";colores[1]="rojo";colores[2]="azul";
        colores[3]="amarillo";colores[4]="naranja";colores[5]="rosa";
        colores[6]="negro";colores[7]="blanco";colores[8]="morado";

        for (int i = 0; i < 8; i++) {
            System.out.print("Escribe una palabra(incluye colores): ");
            String palGen = s.next();

            for (int j = 0; j < 9; j++) {
                if (palGen.equals(colores[j])){
                    do {
                        palOrden[contador] = palGen;
                        contador++;
                    }while (contador < 1);
                    contador2++;
                }
            }
            palabras[i] = palGen;
        }
        System.out.println(contador2);
        System.out.println();
        for (int i = 0; i < contador2; i++) {
            System.out.print(palOrden[i]+" ");
        }
        //solo puedo ordenar los colores pero no los otros,pd: despues lo termino
    }
}
