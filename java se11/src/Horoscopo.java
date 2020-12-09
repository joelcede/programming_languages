import java.util.Scanner;

/**
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 */
public class Horoscopo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //A mi parecer es mucho codigo para simple kk
        System.out.print("Escribe el dia que naciste: ");
        int dia = s.nextInt();
        System.out.print("Escribe el mes que naciste: ");
        String mes = s.next();

        //horoscopos
        var capricornio = "Si ambos logran que las diferencias que existen en la pareja\n" +
                "se conviertan en puntos en común para aprender,\n" +
                "esta promete ser una relación muy pero que muy interesante.\n" +
                "Sin embargo, si la relación va por el lado tormentoso, \n" +
                "la historia promete ser digna de una tragedia griega.";

        var acuario = "Todos los días se aprueban leyes por todo el planeta.\n" +
                 "No cabe duda de que nos gustan las normas y los reglamentos.\n" +
                 "Es como si tuviésemos la necesidad de que nos digan qué hacer y\n" +
                 "cuándo hacerlo.";

        var picis = "Hace poco vi por primera vez la película Casablanca. \n" +
                "Sabía tanto de la trama que, conforme se iba desarrollando, \n" +
                "me preguntaba si no la habría visto hace mucho tiempo y \n" +
                "sencillamente lo había olvidado";

        var aries = "Su unión promete ser apasionada, nada aburrida y, sin duda, fuera de lo común.";

        var tauro = "Piscis ve en Tauro a una persona llena de recursos. \n" +
                "Le encanta su manera de enfocar la realidad, \n" +
                "sus pies siempre en el suelo y Tauro se siente intrigado \n" +
                "por un signo tan visceral y extraño.";

        var geminis = "Piscis se vuelve loco ante el carácter mental de Géminis \n" +
                "y este tampoco entiende ese halo tan soñador y como de otro mundo \n" +
                "del signo de los peces. Ambos intentan acercarse \n" +
                "pero el aire y el agua no mezclan bien.";

        var cancer = "Con estos dos signos se cumple el cuento de hadas con un final feliz incluido. \n" +
                "Ambos tienen un corazón sensible e inspirado y disfrutarán creando un hogar acogedor, \n" +
                "lleno de flores, animales domésticos y niños incluidos.";

        var leo = "Cuando el agua y el fuego se complementan en armonía aparece el Arco Iris,\n" +
                "y esta magia de colores es la que pueden lograr estos dos signos \n" +
                "si saben cómo alimentar su relación con cariño, confianza \n" +
                "y un estimulante reconocimiento de sus respectivos talentos.";

        var virgo = "La atracción complementaria que fluye entre ambos signos, \n" +
                "hará que la familiaridad y la sensación de ser antiguos conocidos, \n" +
                "les da buen rollo desde el primer momento.";

        var libra = "Delicadeza, sensibilidad y poco sentido práctico, \n" +
                "sería un encabezamiento aceptable para definir esta unión tan poética \n" +
                "donde las buenas formas y la sensibilidad sean la nota fundamental.";

        var escorpio = "Es una relación de dos almas que se entienden\n" +
                "y que fluyen por los mismos sentimientos.\n" +
                "Son además muy parecidos en lo que a \n" +
                "fidelidad, intensidad y compatibilidad sexual se refiere, \n" +
                "es por eso que dentro del mapa zodiacal estamos\n" +
                "ante una de las parejas más agraciadas por las conjunciones astrales.";

        var sagitario = "Como signo de agua, Piscis tiende a la introversión\n" +
                " y a expresar el lado más profundo del alma humana, Sagitario, \n" +
                "sin embargo, es puro fuego y todo lo expresa viajando y expandiendo el espíritu. ";

        if ("Enero".equals(mes)) {
            if (dia >= 20){
                System.out.println("Tu signo sodiacal es acuario");
                System.out.println(acuario);
            }else {
                System.out.println("Tu signo sodiacal es Capricornio");
                System.out.println(capricornio);
            }
        }
        System.out.println(horoscopovar("Marzo", mes, dia,
                "Picis", picis, "Aries", aries));

        System.out.println(horoscopovar("Febrero", mes, dia,
                "Acuario", acuario, "Picis", picis));

        System.out.println(horoscopovar("Marzo", mes, dia,
                "Picis", picis, "Aries", aries));

        System.out.println(horoscopovar("Abril", mes, dia,
                "Aries", aries, "Tauro", tauro));

        System.out.println(horoscopovar("Mayo", mes, dia,
                "Tauro", tauro, "Geminis", geminis));

        System.out.println(horoscopovar("Junio", mes, dia,
                "Geminis", geminis, "Cancer", cancer));

        System.out.println(horoscopovar("Julio", mes, dia,
                "Cancer", cancer, "Leo", leo));

        System.out.println(horoscopovar("Agosto", mes, dia,
                "Leo", leo, "Virgo", virgo));

        System.out.println(horoscopovar("Septiembre", mes, dia,
                "Virgo", virgo, "Libra", libra));

        System.out.println(horoscopovar("Octubre", mes, dia,
                "Libra", libra, "Escorpio", escorpio));

        System.out.println(horoscopovar("Noviembre", mes, dia,
                "Escorpio", escorpio, "Sagitario", sagitario));
        
        System.out.println(horoscopovar("Diciembre", mes, dia,
                "Sagitario", sagitario, "merenge", capricornio));
    }
    public static boolean horoscopovar(
                             String mesEquival, String mesEqui, int diaEquival,
                             String signo1, String mensaje1, String signo2,
                             String mensaje2) {
        if (mesEquival.equals(mesEqui)) {
            if (diaEquival <= 22) {
                System.out.println("tu signo sodiacal es: " + signo1);
                System.out.println(mensaje1);
            } else {
                System.out.println("tu signo sodiacal es: " + signo2);
                System.out.println(mensaje2);
            }
        }
        return false;
    }
}
