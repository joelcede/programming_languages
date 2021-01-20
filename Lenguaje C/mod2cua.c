/*
Modifique el programa que escribió en el ejercicio 3.33 
de manera que despliegue el perímetro del cuadrado*/

#include<stdio.h>

int main(){
	int lado,contador=0;
	int y,almacen,menor,mayor;
	int contador2=0,contador3=0;
		
	printf("Escribe un lado del cuadrado(1-20): ");
	scanf("%d", &lado);
	
	menor = lado - 2;
	mayor = lado + 1;
	y = menor * menor;
	
	while (contador2 < lado){
		if (contador2%lado==0){
			printf("\n");
		}
		printf("*");
		contador2++;
	}
	while (contador < y){
		if (contador%menor==0){
			printf("\n");
		}if("\n"){
			printf("*");
		}
		printf(" ");
		contador++;
	}
	while (contador3 < lado){
		if (contador3%lado==0){
			printf("\n");
		}
		printf("*");
		contador3++;
	}	
	return 0;
}
