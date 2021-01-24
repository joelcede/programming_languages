/*
 Escriba un programa por separado que introduzca 
 un entero encriptado de cuatro dígitos y lo 
 desencripte para formar el número original.
*/

#include<stdio.h>

int main(){ 
	int desencriptar;
	int div1,div2,div3,div4;
	int cont1,cont2,cont3,cont4;
	
	printf("Desencriptar: ");
	scanf("%d", &desencriptar);
	
	div1 = desencriptar / 10;
	div2 = div1 / 10;
	div3 = div2 / 10;
	div4 = div3 / 10;

	printf("%d\n%d\n%d\n%d", div1,div2,div3,div4);
	

	return 0;
}
