/*
Escriba un programa que pida al usuario que introduzca dos enteros, 
que obtenga los n�meros por parte del usuario, 
despu�s que imprima las palabras �es m�s grande�. 
Si los n�meros son iguales, que imprima el mensaje
�Estos n�meros son iguales�. 
Solamente utilice la forma de selecci�n simple de la instrucci�n if, que
aprendi� en este cap�tulo
*/

#include<stdio.h>

int main(){
	int p, s;
	
	printf("Introduzca 2 numeros enteros: ");
	scanf("%d%d", &p, &s);
	
	if (p > s || s > p){
		printf("%d es mas grande que %d",p ,s);
	}
	if (p == s){
		printf("%d son iguales %d",p ,s);
	}
	
	return 0;
}
