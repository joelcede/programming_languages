/*
Escriba un programa que lea el radio de un c�rculo (como un valor float) 
y que calcule y despliegue el di�metro, la circunferencia y el �rea. 
Utilice el valor 3.14159 para p.
*/

#include<stdio.h>

int main(){
	float radio,diametro,
	circunferencia,area,pi=3.14;
	
	printf("Escriba el radio de un circulo: ");
	scanf("%f", &radio);
	
	diametro = radio * 2;
	circunferencia = 2 * pi * radio;
	area = pi * radio * radio;
	
	printf(
		"diametro: %.2f\ncircunferencia: %.2f\narea: %.2f",
		diametro,
		circunferencia,
		area
	);
	
	return 0;
}
