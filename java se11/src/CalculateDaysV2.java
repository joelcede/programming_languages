//dado un dato con la cantidad de dias. encuentre el equivalente en meses,
//semanas y dias sobrantes. suponga que cada mes tiene 30 dias.
public class CalculateDaysV2 {
    public static void main(String[] args) {
        int dias = 15;
        int meses = 30;
        int semana = 7;
        int dia = 1;

        //vuelvo a decir que con while quedaria mejor(?.
        int div1 = cantdias(dias,meses);
        int res1 = divddias(dias,meses);
        int div2 = cantdias(res1,semana);
        int res2 = divddias(res1,semana);
        int div3 = cantdias(res2,dia);

        System.out.println(dias+" dia(s) tiene: "+div1+" mes(es) con "+div2+" semana(s) y "+div3+" dia(s)");
    }
    public static int cantdias(int a1, int a2){
        return a1 / a2;
    }
    public static int divddias(int b1, int b2){
        return b1 % b2;
    }
}
