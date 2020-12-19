/*Una conversion sencilla de euros a dolar*/

#include <stdio.h>

int main()
{
	float valorEuro = 1.23;
	int cantidad;
	int multiplicacion;
	
	printf("Escriba el cuanta cantidad va a converir a dolar: ");
	scanf("%d", &cantidad);
	
	multiplicacion = valorEuro * cantidad;
	
	printf("obtienes: %d",multiplicacion);	
	
	return 0;
}
