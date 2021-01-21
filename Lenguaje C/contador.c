/*
Escriba un programa que despliegue 100 asteriscos, 
uno a la vez. Después de cada diez asteriscos, 
el programa debe desplegar un carácter de nueva línea. 
*/

#include<stdio.h>

int main(){
	int contador=0;
	
	while (contador < 100){
		if (contador%10==0){
			printf("\n");
		}
		printf("*");
		contador++;
	}
}
