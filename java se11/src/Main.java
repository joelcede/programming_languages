public class Main {
    public static void main(String[] args){
        Doctor miDoctor = new Doctor();
        miDoctor.nombre = "Joel Cedeño";
        miDoctor.mostarNombre();
        miDoctor.mostarId();
        System.out.println(Doctor.id);

        Doctor.id++;

        Doctor DoctorMio = new Doctor();
        miDoctor.mostarId();
        System.out.println(Doctor.id);

        UiMenu.mostarMenu();
    }
}
