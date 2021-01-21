import java.util.Scanner;
/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter
 */
public class TemperaturaAnual {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] caracteres = new String[12];

        System.out.println("LA TEMPERATURA SE MIDE HASTA 11");
        for (int i = 0; i < 12; i++) {
            System.out.print("Indique la temperatura del mes " + (i + 1) + ": ");
            int mes = s.nextInt();
            caracteres[i] = " * ".repeat(mes);
        }
        System.out.println();
        for (int i = 0; i < 12; i++) {
            if (i < 9){
                System.out.print("MES "+(i+1)+"  | "+caracteres[i]+"\n");
            }else {
                System.out.print("MES "+(i+1)+" | "+caracteres[i]+"\n");
            }
        }
        System.out.print("TEMP:  |--1--2--3--4--5--6--7--8--9--10--11--| ");
    }
}
