/*
encuentre los dos valores m�s grandes de los 10 n�meros. [Nota:
Debe introducir un n�mero a la vez.]
*/

#include<stdio.h>

int main(){
	int contador=1,numero,mayor1=0,mayor2=0;
	
	while (contador < 11){
		printf("Introduce un numero: ");
		scanf("%d", &numero);
		
		if (numero > mayor1){
			mayor1 = numero;
			if (numero < mayor1 && numero > mayor2){
				mayor2 = numero;
				printf("%d\n",mayor2);
		}
		}
		contador++;
	}
	printf("Los 2 numeros mayores son: %d y %d",mayor1, mayor2);
	
	return 0;
}
