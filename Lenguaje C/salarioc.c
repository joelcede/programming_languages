/*
Una gran empresa de productos químicos le paga a sus vendedores 
mediante un esquema de comisiones. Los vendedores reciben $200 
semanales más el 9% de sus ventas totales durante la semana. 
Por ejemplo, un vendedor que vende $5000 de productos químicos 
durante la semana recibe $200 más el 9% de $5000, o un total de $650. 
Desarrolle un programa que introduzca las ventas totales de cada vendedor 
durante la última semana y que calcule y despliegue los ingresos de ese vendedor. 
Procese las cantidades de un vendedor a la vez.
*/

#include<stdio.h>

int main(){
	/*9 % de comisiones*/
	int ventasSemanales = 200,comision = 9;
	float salario,ventas;
	
	while (ventas != -1){
		printf("Introduzca lasventas en pesos (-1 para terminar): ");
		scanf("%f", &ventas);
		
		if (ventas != -1){
			salario = ((ventas * comision) / 100) + ventasSemanales;
			printf("El salario es: $ %.2f\n", salario);
		}
	}
	
	return 0;
}
