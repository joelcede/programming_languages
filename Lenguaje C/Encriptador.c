/*
El programa debe leer un entero de cuatro d�gitos y 
encriptar la informaci�n de la siguiente manera: 
reemplace cada d�gito con el residuo de la
divisi�n entre 10 de la suma de dicho d�gito m�s 7. 
 */
 
#include<stdio.h>

int main(){
	int entero4;
	int div1,div2,div3;
	int contenedor1,contenedor2,
	contenedor3,contenedor4;
	
	printf("Escriba un numero de 4 digitos: ");
	scanf("%d",&entero4);
	
	div1 = entero4 / 10;	
	div2 = div1 / 10;	
	div3 = div2 / 10;

	contenedor4 = (entero4 % 10) + 7;
	contenedor3 = (div1 % 10) + 7;
	contenedor2 = (div2 % 10) + 7;
	contenedor1 = (div3 % 10) + 7;
	printf("%d%d%d%d",contenedor3,contenedor4,contenedor1,contenedor2);

	return 0;
}
