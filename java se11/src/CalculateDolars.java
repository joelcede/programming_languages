/*
* Dado un numero entero(cantidad de dolares), mostrar el valor quivalente
* usando la menor cantidad de billetes de 100,50,20,10,5,1
*  **/
public class CalculateDolars {
    public static void main(String[] args) {
        //billetes xd
        int cantidadDolars = 352;
        int de100 = 100;
        int de50 = 50;
        int de20 = 20;
        int de10 = 10;
        int de1 = 1;

        int div1 = cantdDolar(cantidadDolars,de100);
        int res1 = divdDolar(cantidadDolars,de100);
        int div2 = cantdDolar(res1,de50);
        int res2 = divdDolar(res1,de50);
        int div3 = cantdDolar(res2,de20);
        int res3 = divdDolar(res2,de20);
        int div4 = cantdDolar(res3,de10);
        int res4 = divdDolar(res3,de10);
        int div5 = cantdDolar(res4,de1);

        System.out.println(
                cantidadDolars+" es igual "
                +div1+" billetes de 100, "
                +div2+" billetes de 50, "
                +div3+" billetes de 20, "
                +div4+" billetes de 10, "
                +div5+" billetes de 1."
        );
    }
    public static int cantdDolar(int a1, int a2){
        return a1 / a2;
    }
    public static int divdDolar(int b1, int b2){
        return b1 % b2;
    }
}
