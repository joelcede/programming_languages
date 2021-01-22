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
