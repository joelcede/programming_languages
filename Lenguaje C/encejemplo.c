/*Encriptador*/

#include<stdio.h>

int main(){
	int ent4;
	int div1,div2,div3;
	int cont1,cont2,cont3,cont4;
	
	printf("Escriba un numero de 4 digitos: ");
	scanf("%d", &ent4);
	
	div1 = ent4 / 10;
	div2 = div1 / 10;
	div3 = div2 / 10;
	
	cont4 = (ent4 % 10) + 7;
	cont3 = (div1 % 10) + 7;
	cont2 = (div2 % 10) + 7;
	cont1 = (div3 % 10) + 7;
	
	printf("%d%d%d%d",cont3,cont4,cont1,cont2);
	
	return 0;
}
