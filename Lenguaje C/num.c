/*
Escriba un programa que imprima los n�meros del 1 al 4 en la misma l�nea. 
Escriba el programa utilizando los siguientes m�todos:
a) Mediante una instrucci�n printf sin especificadores de conversi�n.
b) Mediante una instrucci�n printf con cuatro especificadores de conversi�n.
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
