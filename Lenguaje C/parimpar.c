/*
Escriba un programa que lea un entero y que determine 
e imprima si es par o impar. [Pista: Utilice el operador
m�dulo. Un n�mero par es un m�ltiplo de dos. 
Cualquier m�ltiplo de 2 arroja un residuo de cero, cuando se divide
entre 2.]
*/
#include<stdio.h>

int main(){
	int numero;
	
	printf("escribe un numero: ");
	scanf("%d", &numero);
	
	if (numero%2==0){
		printf("El numero %d es par", numero);
	}
	if (numero%2==1){
		printf("El numero %d es impar",numero);
	}
	
	return 0;
}
