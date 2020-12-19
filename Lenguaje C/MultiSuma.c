/*Suma y multiplicación de dos números*/

#include <stdio.h>

int main()
{
	int entero1;
	int entero2;
	int suma;
	int multip;
	
	printf("Escribe el primer numero: ");
	scanf("%d", &entero1);
	
	printf("Escribe el segundo numero: ");
	scanf("%d", &entero2);
	
	suma = entero1 + entero2;
	multip = entero1 * entero2;
	
	printf("\n");
	printf("La suma total es: %d\n", suma);
	printf("la multiplicacion es: %d", multip);
	
	return 0;
}
