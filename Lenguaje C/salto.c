#include<stdio.h>

int main(){
	int caracter = 8;
	int total = caracter * caracter;
	int dividir = total / 4;
	int contador = 0;
	
	while (contador < total){
		if(contador%8==0){
			printf("\n");
		}if(contador%dividir==8){
			printf(" ");
		}
		printf("* ");
		contador++;
	}
}
