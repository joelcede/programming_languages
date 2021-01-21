/*
Escriba un programa que demuestre la diferencia entre el 
predecremento y el posdecremento mediante el uso del operador --.
*/

#include<stdio.h>

int main(){
	int semana = 7,sueldo = 7,gastos;
	printf("Sueldo de un estudiante a la semana\n");
	
	while (sueldo > 0 ){
		printf("sueldo: %d\n", sueldo);
		sueldo--;
	}
	while (semana > 0){
		--semana;
		printf("dia: %d\n", semana);
	}
	return 0;
}
