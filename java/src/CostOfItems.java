//El costo mensual C en dolares al fabricar una cantidad x de articulos esta dado por:
//C = 50 + 2x, mientras que el ingreso por la venta de X articulos esta dada por V = 2.4x
//a) Calcule la ganacia que se obtendra al fabricar y vender 400 articulos
//b) Determine cuantos articulos deben fabricarse y venderse para que el ingreso iguale a los gastos.
public class CostOfItems {
    public static void main(String[] args) {
        var madeArticles = 400;
        //puesto de forma directa y sin formula
        var direct = 125;

        System.out.println("ganancias obtenidas mensualmente: "+earningsArticles(madeArticles));
        System.out.println("Dinero gastado mensualmente: "+createdArticules(madeArticles));
        System.out.println("Ganancias mensuales: " +total(madeArticles));
        System.out.println();
        System.out.println("ganado al mes: "+earningsArticles(direct));
        System.out.println("gastado al mes: "+createdArticules(direct));
        System.out.println("total de 125 articulos: "+total(direct));
    }
    //aqui se calcula el total de la ganancia o la perdida
    public static double total(int x1){
        return (2.4 * x1) - (50 + 2 * x1) ;
    }
    //aqui solo se calcula la ganancia
    public static double earningsArticles(int x2){
        return 2.4 * x2;
    }
    //aqui solo se calcula lo gastado
    public static double createdArticules(int x3){
        return 50 + 2 *x3;
    }
}
