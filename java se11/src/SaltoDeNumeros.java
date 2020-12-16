//Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
//do-while.
public class SaltoDeNumeros {
    public static void main(String[] args) {
        int numeroSuperior = 340;
        int numeroInferior = 169;

        do {
            numeroSuperior = numeroSuperior -20;
            System.out.println(numeroSuperior);
        }while (numeroSuperior > numeroInferior);
    }
}
