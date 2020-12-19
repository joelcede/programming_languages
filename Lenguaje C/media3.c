/* nota media de 3 examenes
cada ves me familiarizo mas con la sintaxis <3*/

#include <stdio.h>

int main()
{
	int nota1;
	int nota2;
	int nota3;
	int resultado;
	
	printf("Escribe la primera nota: ");
	scanf("%d", &nota1);
	printf("Escribe la segunda nota: ");
	scanf("%d", &nota2);
	printf("Escribe la tercera nota: ");
	scanf("%d", &nota3);
	
	resultado = (nota1+nota2+nota3) / 3;
	
	printf("El resultado de las 3 notas es: %d",resultado);
	
	return 0;
}
