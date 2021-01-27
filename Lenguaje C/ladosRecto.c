/*
Escriba un programa que lea tres valores de tipo float 
diferentes de cero y que determine (y despliegue) si éstos
pueden representar los lados de un triángulo recto*/

#include<stdio.h>

int main(){
	float primero,segundo,tercero;
	int contador = 0;
	
	printf("Escribe un numero: ");
	scanf("%f",&primero);
	printf("Escribe otro numero: ");
	scanf("%f",&segundo);
	printf("Escribe el ultimo numero: ");
	scanf("%f",&tercero);
	
	if (primero == segundo && primero == tercero){
		printf("los lados representa al de un trinaguo recto\n");
	}else{
		printf("no representan al triangulo recto\n");
	}
	return 0;
}
