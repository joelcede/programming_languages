/*
Escriba un programa que introduzca tres diferentes enteros desde el teclado, 
después que imprima la suma, el promedio, el producto, 
el número más pequeño y el más grande de éstos. Solamente utilice la forma de selección
simple de la instrucción if, que aprendió en este capítulo. 
El diálogo en la pantalla debe aparecer de la siguiente forma:
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
