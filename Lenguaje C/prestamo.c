/*
El interés simple para un préstamo se calcula mediante la fórmula:
interés = préstamo * tasa * días / 365;
La fórmula anterior asume que tasa es la tasa de interés anual, 
y por lo tanto incluye la división entre 365 (días). 
Desarrolle un programa que introduzca préstamo, 
tasa y días para varios préstamos, y que calcule y despliegue el
interés simple para cada préstamo, utilizando la fórmula anterior
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
