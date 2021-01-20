/*
Escriba un programa que lea números de cinco dígitos 
y que determine si es o no, un palíndromo
*/
#include<stdio.h>

int main(){
	int contador = 0;
	int numero,total,totol;
	int alamacen1,almacen2;
	int dividir1,modulo1,
		dividir2,modulo2,
		dividir3,modulo3,
		dividir4,modulo4,
		dividir5,modulo5;
	
	while (numero > 10000 || numero < 99999 && numero != -1){
		printf("Escribe un numero de 5 digitos(-1 para terminar): ");
		scanf("%d", &numero);
		if (numero != -1){
			dividir1 = numero/10;
			modulo1 = numero%10;
			
			dividir2 = dividir1/10;
			modulo2 = dividir1%10;
			
			dividir3 = dividir2/10;
			modulo3 = dividir2%10; 
			
			dividir4 = dividir3/10;
			modulo4 = dividir3%10;
			
			dividir5 = dividir4/10;
			modulo5 = dividir4%10;
			if (modulo1==modulo5 & modulo2==modulo4 && modulo3==modulo3){		
				printf("Es palidromo\n");
			}else{
				printf("No es palidromo\n");
	}	
		}
	}
	return 0;
}
