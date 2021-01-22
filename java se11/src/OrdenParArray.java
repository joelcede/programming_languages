/*
Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
es necesario
 */
public class OrdenParArray {
    public static void main (String[] args){
        int[] numero1 = new int[20];

        for (int i = 0; i < 20; i++) {
            int numAleatorios = ((int)(Math.random()*100));
            numero1[i] = numAleatorios;
        }
        System.out.println("\nLista Ordenada");
        for (int i = 0; i < 20; i++) {
            if (numero1[i]%2==0){
                System.out.print(numero1[i]+" ");
            }
        }
        for (int i = 0; i < 20; i++) {
            if (numero1[i]%2==1){
                System.out.print(numero1[i]+" ");
            }
        }
        System.out.println("\nLista desordenada");
        for (int i = 0; i < 20; i++) {
            System.out.print(numero1[i]+" ");
        }
    }
}
