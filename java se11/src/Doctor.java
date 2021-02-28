public class Doctor {
    static int id = 0;
    String nombre;
    String especialidad;

    Doctor(){
        System.out.println("Hola bb");
        id++;
    }
    Doctor(String nombre){
        System.out.println("hola bb "+nombre);
    }
    //comportamientos
    public void mostarNombre(){
        System.out.println(nombre);
    }
    public void mostarId(){
        System.out.println("ID Doctor" + id);
    }
}
