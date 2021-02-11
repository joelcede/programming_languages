import java.util.Scanner;

public class UiMenu {
    public static String[] MES = {"enero","febrero","marzo","abril","mayo"};
    static void mostarMenu(){
        System.out.println("Bienvenido a mi menu");
        System.out.println("Seleciona la opcion deseada");

        int respuesta = 0;
        do {
            System.out.println("1. doctor");
            System.out.println("2. paciente");
            System.out.println("0. salir");
            Scanner s = new Scanner(System.in);
            respuesta = Integer.parseInt(s.nextLine());
            switch (respuesta){
                case 1:
                    System.out.println("Doctor .V");
                    break;
                case 2:
                    respuesta = 0;
                    mostarMenuPaciente();
                    break;
                case 0:
                    System.out.println("Gracias..");
                    break;
                default:
                    System.out.println("Escoje la respuesta correcta.");
            }
        }while (respuesta != 0);
    }
    static void mostarMenuPaciente(){
        int respuesta;
        do {
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("1. book an appintment");
            System.out.println("2. my appointments");
            System.out.println("0. return");
            Scanner s = new Scanner(System.in);
            respuesta = Integer.parseInt(s.nextLine());

            switch (respuesta){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i+"."+MES[i]);
                    }
                    break;
                case 2:
                    System.out.println("::medicaments xd");
                    break;
                case 0:
                    System.out.println("gracias");
                    mostarMenu();
                    break;
                default:
                    System.out.println("intenta de nuevo");
            }
        }while (respuesta != 1);
    }
}
