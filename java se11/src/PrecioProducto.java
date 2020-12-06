import java.util.Scanner;

/**
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos promocionales
 * pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
 * muestran los valores correctos, aunque los números no estén tabulados.
 */
public class PrecioProducto {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introdusca la base imponible: ");
        int bi = s.nextInt();
        System.out.print("Introduszca el tipo de IVA(general): ");
        var tipo_inva = s.next();
        System.out.print("Introduzca el codigo promocional (jioska o joel): ");
        var codigo_p = s.next();

        double iva = 0.10;
        double sacaIva = calculaIva(bi,iva);
        double sumaTotal = suma(bi,sacaIva);
        double descuento = division(sumaTotal);

        System.out.println("base imponible:\t"+ bi);
        System.out.println(tipo_inva+" IVA (10%):\t"+sacaIva);
        System.out.println("Precio con IVA:\t"+sumaTotal);
        System.out.println(codigo_p+" Cod. promo (jioska):\t-"+descuento);//jioska da la mitad de descuento
        System.out.println("Total:\t"+resta(sumaTotal,descuento));
    }
    public static double calculaIva(double precio, double iva10){
        return precio * iva10;
    }
    public static double suma(double primer, double segundo){
        return primer + segundo;
    }
    public static double division(double divi){
        return divi / 2;
    }
    public static double resta(double primero, double segundo){
        return primero - segundo;
    }
}
