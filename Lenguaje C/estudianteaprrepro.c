/*
Modifique el programa de la figura 3.10 para validar sus entradas.
Para cualquier entrada, si el valor introducido es diferente a 1 o 2, 
continúe el ciclo hasta que el usuario digite un valor correcto.
*/

#include<stdio.h>

int main(){
	int aprobado=0,reprobado=0,estudiante=1,resultado;
	
	while (estudiante <= 10){
		printf("Indica el resultado(1=aprobado, 2=reprobado): ");
		scanf("%d",&resultado);
		
		if (resultado == 1){
			aprobado++;
		}else if (resultado == 2){
			reprobado++;
		}else{
			printf("Intentos: %d\n",estudiante);
			estudiante--;
		}
		estudiante++;
	}
	printf("Aprobados: %d\n",aprobado);
	printf("Reprobados: %d\n",reprobado);
	
	if (aprobado > 8){
		printf("Objectivo alcanzado\n");
	}
	return 0;
}
