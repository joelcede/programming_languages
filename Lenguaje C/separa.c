/*
Escriba un programa que introduzca un número de cinco dígitos, 
que separe el número en sus dígitos individuales
y que despliegue los dígitos separados entre sí mediante 
tres espacios cada uno. [Pista: Utilice combinaciones de
la división entera y el operador módulo.] Por ejemplo, 
si el usuario escribe 42139, el programa debe imprimir
*/

#include<stdio.h>

int main(){
	int numero, div1, div2, div3, div4, div5, div6, div7, div8, div9;

	printf("Escriba un numero de 5 digitos: ");
	scanf("%d", &numero);
	
	div1 = numero % 10;
	div2 = numero / 10;
	div3 = div2 % 10;
	div4 = div2 / 10;
	div5 = div4 % 10;
	div6 = div4 / 10;
	div7 = div6 % 10;
	div8 = div6 / 10;
	div9 = div8 % 10;
	
	printf("%d   %d   %d   %d   %d", div9, div7, div5, div3, div1);
	
	return 0;
}
