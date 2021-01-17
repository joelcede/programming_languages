#include<stdio.h>

int main(){
	int contador=0,calificacion,total=0;
	float promedio;
	
	printf("Introduzca la calificacion, -1 para terminar: ");
	scanf("%d", &calificacion);
	
	while(calificacion != -1){
		total = total + calificacion;
		contador = contador + 1;
		
		printf("Introduzca la calificacion, -1 para terminar: ");
		scanf("%d", &calificacion);
		printf("Introduzca la calificacion, -1 para terminar: ");
	}
	
	if (contador != 0){
		promedio = (float) total / contador;
		
		printf("El promedio es: %.2f\n", promedio);
	}
	else{
		printf("No se introdujeron calificaciones\n");
	}
	return 0;
}
