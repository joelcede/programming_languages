/*
Escriba un programa que pida al usuario que introduzca dos enteros, 
que obtenga los números por parte del usuario, 
después que imprima las palabras “es más grande”. 
Si los números son iguales, que imprima el mensaje
“Estos números son iguales”. 
Solamente utilice la forma de selección simple de la instrucción if, que
aprendió en este capítulo
*/

#include<stdio.h>

int main(){
	int p, s;
	
	printf("Introduzca 2 numeros enteros: ");
	scanf("%d%d", &p, &s);
	
	if (p > s || s > p){
		printf("%d es mas grande que %d",p ,s);
	}
	if (p == s){
		printf("%d son iguales %d",p ,s);
	}
	
	return 0;
}
