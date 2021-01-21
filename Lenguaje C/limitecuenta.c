/*
Desarrolle un programa en C que determine si un cliente de una tienda 
departamental excede el l�mite de cr�dito
de su cuenta. Para cada cliente, se dispone de los siguientes datos:
1. N�mero de cuenta.
2. Saldo al inicio del mes.
3. Total de elementos cargados al cliente en este mes.
4. El total de los cr�ditos aplicados a la cuenta del cliente durante el mes.
5. El l�mite de cr�dito autorizado.
El programa debe introducir cada uno de estos datos, calcular el nuevo s
aldo (= saldo inicial + cargos � cr�ditos),
y determinar si el nuevo saldo excede el l�mite de cr�dito del cliente. 
Para aquellos clientes que excedan el l�mite
de cr�dito, el programa debe desplegar el n�mero de cuenta, el l�mite de cr�dito, 
el saldo nuevo y el mensaje �L�mite de cr�dito excedido�*/

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
