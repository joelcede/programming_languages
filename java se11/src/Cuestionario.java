import java.util.Scanner;

/**
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario
 * a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
 * en las diferentes asignaturas del curso.
 */
public class Cuestionario {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Cuanto es 2 + 2?: ");
        var primeraP = s.nextInt();//4
        System.out.print("Cual es el nombre para importar en java?: ");
        var segundaP = s.next();//import
        System.out.print("True o False?: ");
        var terceraP = s.next();//true
        System.out.print("2 x 2?: ");
        var curataP = s.nextInt();//4
        System.out.print("materia de relleno?: ");
        var quintaP = s.next();//english
        System.out.print("3 x 3?: ");
        var sextaP = s.nextInt();//9
        System.out.print("2 x 3?: ");
        var sextimaP = s.nextInt();//6
        System.out.print("Sabes POO?: ");
        var octavaP = s.next();//si
        System.out.print("1 x 1?: ");
        var novenaP = s.nextInt();//1
        System.out.print("1 x 2?: ");
        var decimaP = s.nextInt();//2

        var contador = 0;

        if (primeraP == 4){
            contador = contador + 1;
        }if (segundaP.equals("import")) {
            contador = contador + 1;
        }if (terceraP.equals("True")){
            contador = contador + 1;
        }if (curataP == 4){
            contador = contador + 1;
        }if (quintaP.equals("English")){
            contador = contador + 1;
        }if (sextaP == 9){
            contador = contador + 1;
        }if (sextimaP == 6){
            contador = contador + 1;
        }if (octavaP.equals("si")){
            contador = contador + 1;
        }if (novenaP == 1){
            contador = contador + 1;
        }if (decimaP == 2){
            contador = contador + 1;
        }
        System.out.println("se obtuvieron: "+contador+" puntos");
    }
}
