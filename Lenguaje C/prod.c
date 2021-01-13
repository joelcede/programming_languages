/*calcular el producto de 3 enteros*/
#include<stdio.h>

int main(){
	int p, s, t, resultado;
	
	printf("Introduzca 3 numeros enteros: ");
	scanf("%d%d%d", &p, &s, &t);
	
	resultado = p * s * t;
	printf("el producto es: %d", resultado);
	
	return 0;
}
