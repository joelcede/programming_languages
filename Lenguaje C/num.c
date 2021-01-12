/*
Escriba un programa que imprima los números del 1 al 4 en la misma línea. 
Escriba el programa utilizando los siguientes métodos:
a) Mediante una instrucción printf sin especificadores de conversión.
b) Mediante una instrucción printf con cuatro especificadores de conversión.
c) Mediante cuatro instrucciones printf
*/

#include<stdio.h>

int main(){
	int p = 1;
	int s= 2;
	int t = 3;
	int c = 4;
	
	printf("1 2 3 4\n");
	printf("%d%d%d%d\n",p, s, t, c);
	
	printf("%d",p);
	printf("%d",s);
	printf("%d",t);
	printf("%d",c);
	
	return 0;
}
