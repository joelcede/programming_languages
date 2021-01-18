/*
Desarrolle un programa en C que determine si un cliente de una tienda 
departamental excede el límite de crédito
de su cuenta. Para cada cliente, se dispone de los siguientes datos:
1. Número de cuenta.
2. Saldo al inicio del mes.
3. Total de elementos cargados al cliente en este mes.
4. El total de los créditos aplicados a la cuenta del cliente durante el mes.
5. El límite de crédito autorizado.
El programa debe introducir cada uno de estos datos, calcular el nuevo s
aldo (= saldo inicial + cargos – créditos),
y determinar si el nuevo saldo excede el límite de crédito del cliente. 
Para aquellos clientes que excedan el límite
de crédito, el programa debe desplegar el número de cuenta, el límite de crédito, 
el saldo nuevo y el mensaje “Límite de crédito excedido”*/

#include<stdio.h>

int main(){
	int numCuenta,
	saldoInicioMes,
	totalElementos,
	totalCreditos,
	limiteCredito,
	resultado;
	
	while (numCuenta != -1){
		printf("Introduzca el numero de cuenta: ");
		scanf("%d", &numCuenta);
		
		if (numCuenta != -1){
			printf("Introduzca el saldo inicial: ");
			scanf("%d", &saldoInicioMes);
			printf("Introduzca el total de cargos: ");
			scanf("%d", &totalElementos);
			printf("Introduzca el total de credito: ");
			scanf("%d", &totalCreditos);
			printf("Introduzca el limite de credito: ");
			scanf("%d", &limiteCredito);
			
			resultado = (saldoInicioMes + totalElementos) - totalCreditos;
			
			printf("cuenta: %d\nLimite de credito: %d\nSaldo: %d\n",saldoInicioMes,limiteCredito,resultado);
			
			if (resultado > limiteCredito){
				printf("Limite de credito excedido\n");
			}
		}
	}
	
	return 0;
}
