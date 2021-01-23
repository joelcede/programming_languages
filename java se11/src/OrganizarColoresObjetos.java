import java.util.Scanner;
public class OrganizarColoresObjetos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contador = 0;
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
                    contador++;
                }
            }
            palabras[i] = palGen;
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                if (palabras[i].equals(colores[j])){
                    for (int k = 0; k < contador; k++) {
                        palOrden[k] = palabras[i];
                        if (k == contador-1){
                            System.out.print(palOrden[k]+" ");
                        }
                    }
                    System.out.println();
                    for (int k = contador; k < 8; k++) {
                        System.out.print(palabras[i]+" ");
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.println(palOrden[i]+" ");
        }
    }
}
