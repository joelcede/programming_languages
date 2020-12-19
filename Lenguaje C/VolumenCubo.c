/*calcular el volumen de un cubo arista a la 3
Puede salir error de incompatibilidad con el pow
pero si funciona*/

#include <stdio.h>

int main()
{
	int arista;
	double potencia = 3;
	int resultado;
	printf("Introduzca una arista: ");
	scanf("%d", &arista);
	
	resultado = pow(arista,potencia);
	printf("El resultado es: %d",resultado);
	return 0;
}
