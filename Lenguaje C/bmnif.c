/*
Escriba un programa que introduzca tres diferentes enteros desde el teclado, 
despu�s que imprima la suma, el promedio, el producto, 
el n�mero m�s peque�o y el m�s grande de �stos. Solamente utilice la forma de selecci�n
simple de la instrucci�n if, que aprendi� en este cap�tulo. 
El di�logo en la pantalla debe aparecer de la siguiente forma:
*/

#include<stdio.h>

int main(){
	int p, s, t;
	int suma, promedio, producto,
		pequeno, grande;
	
	printf("Escriba 3 numeros diferentes: ");
	scanf("%d%d%d", &p, &s, &t);
	
	suma = p + s+ t;
	promedio = suma / 3;
	producto = p * s * t;
	
	printf("la suma es: %d\n", suma);
	printf("el promedio es: %d\n", promedio);
	printf("el producto es: %d\n", producto);
	
	/* aqui se busca al menor*/
	if (p < s && p < t){
		printf("El producto mas pequeno es: %d\n", p);
	}
	if (s < p && s < t){
		printf("El producto mas pequeno es: %d\n", s);
	}
	if (t < p && t < s){
		printf("El producto mas pequeno es: %d\n", t);
	}
	/*aqui se busca el mayor*/
	if (p > s && p > t){
		printf("El producto mas grande es: %d\n", p);
	}
	if (s > p && s > t){
		printf("El producto mas grande es: %d\n", s);
	}
	if (t > p && t > s){
		printf("El producto mas grande es: %d\n", t);
	}
	
	return 0;
}
