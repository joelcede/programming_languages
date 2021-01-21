/*
Escriba un programa que utilice ciclos para producir la siguiente tabla de valores:
*/
#include<stdio.h>

int main(){
	int p, m2, m4, m6,contador = 3;
	
	printf("A\tA+2\tA+4\tA+6\n");
	
	while(contador < 16){
		m2 = contador + 2;
		m4 = m2 + 2;
		m6 = m4 + 2;
	
		printf("%d\t%d\t%d\t%d\n",contador,m2,m4,m6);
		contador+=3;
	}	
	return 0;
}
