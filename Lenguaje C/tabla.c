/*
Escriba un programa que utilice ciclos para imprimir la siguiente tabla de valores.
*/

#include<stdio.h>

int main(){
	int n = 1,diez,cien,mil;
	
	printf("N\t10*N\t100*N\t1000*N\n\n");
	
	while (n < 11){
		diez = n * 10;
		cien = n * 100;
		mil = n * 1000;
		
		printf("%d\t%d\t%d\t%d\n", n, diez, cien, mil);
		n++;
	}
	return 0;
}
