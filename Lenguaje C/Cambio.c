/*Intercambio de los valores de dos variables*/

#include <stdio.h>

int main()
{
	int variable1;
	int variable2;
	
	printf("Introduzca el valor v1: ");
	scanf("%d", &variable1);
	printf("Introduzca el valor v2: ");
	scanf("%d", &variable2);
	
	printf("\n");
	printf("Intercambiando valores.....\n");
	printf("\n");
	printf("Ahora, el valor de v1 es: %d\n", variable2);
	printf("Ahora el valor de v2 es: %d",variable1);
	
	return 0;
}
