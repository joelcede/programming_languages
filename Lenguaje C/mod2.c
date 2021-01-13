/*
Escriba un programa que lea dos enteros y que determine 
e imprima si el primero es múltiplo del segundo. [Pista:
Utilice el operador módulo.]
*/

#include<stdio.h>

int main(){
	int p, s;
	
	printf("Escriba 2 numeros: ");
	scanf("%d%d", &p, &s);
	
	if (p%s==0){
		printf("%d es multiplo de %d", p, s);
	}
	if (p%s==1){
		printf("%d no es multiplo de %d", p, s);
	}
	return 0;
}
