public class CalculateDays {
    public static void main(String[] args) {
        //valores representados en dias mes años.
        int dias = 10000;
        int ano = 365;
        int mes = 30;
        int dia = 1;

        //esto quedaria mejor con un while
        int div1 = cantAnos(dias,ano);
        int res1 = residuo(dias,ano);
        int div2 = cantAnos(res1,mes);
        int res2 = residuo(res1,mes);
        int div3 = cantAnos(res2, dia);
        int res3 = cantAnos(res2,dia);

        //impresion de los dias representados en años, meses y dias
        System.out.println(dias+" dia(s) tiene: "+div1+" año(s) con "+div2+" mes(es) y "+div3+" dia(s)");
    }
    //retorno de valores
    public static int cantAnos (int a, int dividendo){
        return a / dividendo;
    }
    //retoeno de valores x2
    public static int residuo(int x, int resi){
        return x % resi;
    }
}
