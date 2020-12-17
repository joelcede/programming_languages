public class ZoneTriangle {
    public static void main(String[] args) {
        var base = 5;
        var  height = 4;
        //h
        System.out.println(calculateZona(base,height));
    }
    public static double calculateZona(int b, int h){
        return Math.floorDiv((b*h),2);
    }
}
