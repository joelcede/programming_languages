/*
El proceso para encontrar el n�mero m�s grande 
(es decir, el m�ximo de un grupo de n�meros) 
se utiliza con frecuencia en aplicaciones para computadora. 
Por ejemplo, un programa que determina el ganador de un concurso de
unidades vendidas por cada vendedor. El vendedor que vende el 
mayor n�mero de unidades gana. Escriba un programa en pseudoc�digo 
y posteriormente un programa que introduzca una serie de 10 n�meros 
y determine e imprima el mayor de �stos. [Clave: 
Su programa debe utilizar tres variables de la siguiente manera]:
contador: Un contador para contar los n�meros de 1 a 10 
(es decir, para llevar la cuenta de cu�ntos n�meros 
se han introducido y determinar si ya se procesaron los 10 n�meros).
numero: El n�mero actual que se introduce al programa.
mayor: El n�mero m�s grande encontrado hasta el momento.
*/

#include<stdio.h>

int main(){
	int contador=1,numero,mayor=0,ventas;
	
	while(contador < 11){
		printf("Introduzca la venta del vendedor %d: ",contador);
		scanf("%d", &numero);
		
		
		if (numero > mayor){
			mayor = numero;
		}
		contador++;
	}
	printf("EL numero mayor es: %d",mayor);
	return 0;
}
