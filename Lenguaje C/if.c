#include<stdio.h>

int main(){
	int num1;
	int num2;
	
	printf("Introduze 2 numeros enteros, y le dire\n");
	printf("Las relaciones que se sastifacen: ");
	
	scanf("%d%d", &num1, &num2);
	
	if (num1 == num2){
		printf("%d es igual que %d\n", num1,num2);
	}
	if (num1 != num2){
		printf("%d no es igual a %d\n", num1, num2);
	}
	if (num1 < num2){
		printf("%d es menor a %d\n", num1, num2);
	}
	if (num1 > num2){
		printf("%d es mayor a %d\n", num1, num2);
	}
	if (num1 <= num2){
		printf("%d es menor o igual a %d\n", num1, num2);
	}
	if (num1 >= num2){
		printf("%d es mayor o igual a %d\n", num1, num2);
	}
	
	return 0;
}
