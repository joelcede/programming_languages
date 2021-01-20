/*Escriba un programa que lea un número entero 
y que determine y despliegue cuántos dígitos del 
entero son sietes*/

#include<stdio.h>

int main(){
	int entero;
	int divisor;
	int modulo;
	int contenedor1;
	int contenedor2;
	int contador=0;
	
	printf("Escriba un numero: ");
	scanf("%d", &entero);
	
	divisor = entero / 10;
	modulo = entero % 10;	
	
	while (true){
		contenedor1 = divisor;
		contenedor2 = modulo;
		
		divisor = contenedor1 / 10;
		modulo = contenedor2 % 10;
		
		if (contenedor2 == 7){
			contador++;
			break
		}
	}
	printf("%d", contador);
}
