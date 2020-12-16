#include <stdio.h>

int main()
{
	int entero1;
	int entero2;
	int suma;
	
	printf("Introduzca un numero: ");
	scanf("%d",&entero1);
	printf("Introduzca otro numero: ");
	scanf("%d",&entero2);
	
	suma = entero1 + entero2;
	
	printf("la suma es: %d",suma);
	return 0;
}
