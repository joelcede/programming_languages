/*Escribaun programa que pida la duracio en 
minutos y calcle la tarifa de la llamada*/

#include <stdio.h>

int main()
{
	int tiempo;
	float dolar;
	
	printf("Tiempo de la llamada: ");
	scanf("%d", &tiempo);
	
	dolar = tiempo * 0.30;
	
	printf("El coste de la llamadaes: %f", dolar);
	return 0;
}
