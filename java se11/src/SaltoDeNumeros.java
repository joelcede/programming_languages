//Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
//utilizando un bucle while.
public class SaltoDeNumeros {
    public static void main(String[] args) {
        int numeroSuperior = 340;
        int numeroInferior = 169;
        while (numeroSuperior > numeroInferior){
            numeroSuperior = numeroSuperior - 20;
            System.out.println(numeroSuperior);
        }
    }
}
