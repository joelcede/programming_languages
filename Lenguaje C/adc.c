/*
Escriba un programa que lea el radio de un círculo 
y que imprima el diámetro, la circunferencia y el área de ese
círculo. Utilice el valor constante de 3.14159 para . 
Realice cada uno de estos cálculos dentro de instrucción(es)
printf, y utilice el especificador de conversión %f. 
[Nota: En este capítulo sólo explicamos constantes y variables enteras. 
En el capítulo 3 explicaremos los números de punto flotante, es decir, 
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
