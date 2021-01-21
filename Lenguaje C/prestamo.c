/*
El inter�s simple para un pr�stamo se calcula mediante la f�rmula:
inter�s = pr�stamo * tasa * d�as / 365;
La f�rmula anterior asume que tasa es la tasa de inter�s anual, 
y por lo tanto incluye la divisi�n entre 365 (d�as). 
Desarrolle un programa que introduzca pr�stamo, 
tasa y d�as para varios pr�stamos, y que calcule y despliegue el
inter�s simple para cada pr�stamo, utilizando la f�rmula anterior
*/

#include<stdio.h>

int main(){
	float prestamo,interes,montoInteres;
	int periodoPrestamo;
	
	while (prestamo != -1){
		printf("Introduzca el prestamo (-1 para terminar): ");
		scanf("%f", &prestamo);
		
		if (prestamo != -1){
			printf("Introduzca la tasa de interes: ");
			scanf("%f", &interes);
			printf("Introduzca el periodo del prestamo en dias: ");
			scanf("%d", &periodoPrestamo);
			
			montoInteres =  (prestamo * interes * periodoPrestamo) / 365;
			
			printf("\nEll monto de interes es: %.2f\n", montoInteres);
		}
	}
	return 0;
}
