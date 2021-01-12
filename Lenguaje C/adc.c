/*
Escriba un programa que lea el radio de un c�rculo 
y que imprima el di�metro, la circunferencia y el �rea de ese
c�rculo. Utilice el valor constante de 3.14159 para . 
Realice cada uno de estos c�lculos dentro de instrucci�n(es)
printf, y utilice el especificador de conversi�n %f. 
[Nota: En este cap�tulo s�lo explicamos constantes y variables enteras. 
En el cap�tulo 3 explicaremos los n�meros de punto flotante, es decir, 
valores que pueden tener puntos decimales.]
*/

#include<stdio.h>

int main(){
	int radio, diametro, circunferencia, area;
	float pi = 3.141592;
	
	printf("Escriba el radio de un circulo: ");
	scanf("%d", &radio);
	
	diametro = radio * 2;
	circunferencia = 2 * pi * radio;
	area = pi * (radio * radio);
	
	printf("area: %d\ndiametro: %d\ncircunferencia: %d",area, diametro, circunferencia);
	
	return 0;
}
