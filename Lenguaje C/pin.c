/*Escriba un programa que lea la medida de uno de los lados 
de un cuadrado y que despliegue dicho cuadrado con asteriscos. 
Su programa debe trabajar con cuadrados de tamaño entre 1 y 20.*/

#include<stdio.h>

int main(){
	int lado,contador=0,contador2=0;
	int x,y;
	
	
	printf("Escribe un lado del cuadrado(1-20): ");
	scanf("%d", &lado);
	
	y = lado * lado;
	x = lado - 2;
	
	while (contador < y){
		if (contador%lado==0){
			printf("\n");
		}
		printf("*");
		contador++;
	}
	return 0;
}
