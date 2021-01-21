/*
Escriba un programa que utilice un ciclo para imprimir 
los números 1 a 10 dentro de la misma línea, 
separados cada uno por tres espacios en blanco.
*/

#include<stdio.h>

int main(){
	int numero = 1;
	
	while (numero < 11){
		printf("%d   ", numero);
		numero++;
	}
	return 0;
}
