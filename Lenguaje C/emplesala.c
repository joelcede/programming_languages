/*
Desarrolle un programa que determine el pago bruto d
e cada uno de los empleados. Esta empresa paga 
“horas completas” por las primeras 40 horas trabajadas 
por cada empleado y paga “hora y media” por todas las horas extras
trabajadas después de las 40. Usted tiene una lista de los empleados 
de la empresa, el número de horas que trabajó cada empleado 
la semana pasada y el pago por hora de cada empleado. 
Su programa deberá introducir esta información para cada empleado, 
y deberá determinar y desplegar el pago bruto por empleado
*/

#include<stdio.h>

int main(){
	int horasLaboradas;
	float pagoHora,salario;
	
	while(horasLaboradas != -1){
		printf("Introduzca el no. de horas laboradas (-1 para terminar): ");
		scanf("%d", &horasLaboradas);
		if (horasLaboradas != -1){
			printf("Introduzca el pago por hora del empleado: ");
			scanf("%f", &pagoHora);
			
			salario = horasLaboradas * pagoHora;
			printf("El salario es: %.2f\n", salario);
		}
	}
	return 0;
}
