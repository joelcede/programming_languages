public class VolZonCylinder {
    public static void main(String[] args) {
        //calcule el volumen y el area total de un cilindro de radio 5m y altura 4m..
        var radio = 5;
        var height = 4;

        //impresion del volumen y area del circulo
        System.out.println("Volume Cylinder: "+volumeCylinder(radio,height));
        System.out.println("Zona Cylinder: "+zonaCylinder(radio,height));
    }
    public static double volumeCylinder(int r1,int h1) {
        return Math.PI * Math.pow(r1, 2) * h1;
    }
    public static double zonaCylinder(int r2, int h2){
        return 2 * Math.PI * r2 * (r2+h2);
    }
}
