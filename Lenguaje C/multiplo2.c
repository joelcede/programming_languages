/*
Escriba un programa que despliegue los múltiplos del número entero 2, 
a saber 2, 4, 8, 16, 32, 64, y así sucesivamente. 
Su ciclo no debe terminar (es decir, debe crear un ciclo infinito)
*/
#include<stdio.h>

int main(){
	int contador = 0;
	
	while(contador >= 0){
		if(contador%2==0){
			printf("%d ", contador);
		}
		contador++;
	}
}
