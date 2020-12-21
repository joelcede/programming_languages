/*Calcular el perimetro de una circunferencia*/

#include<stdio.h>

#define PI 3.141592

int main()
{
	float radio,perimetro;
	
	
	printf("Ingresa el radio del circulo: ");
	scanf("%f", &radio);
	
	perimetro = 2 * PI * radio;
	
	printf("El perimetro es: %f", perimetro);
	return 0;
	
}
