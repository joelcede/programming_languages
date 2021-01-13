/*
Escriba un programa que pida al usuario escribir dos números, 
que obtenga los dos números por parte del usuario,
y que imprime la suma, el producto, la diferencia, 
el cociente y el residuo de los dos números
*/

#include<stdio.h>

int main(){
	int p, s, suma, producto,
	diferencia, conciente, residuo;
	
	printf("Escriba 2 numeros: ");
	scanf("%d%d", &p, &s);
	
	suma = p + s;
	producto = p * s;
	diferencia = p - s;
	conciente = p / s;
	residuo = p % s;
	
	printf("suma: %d\nproducto: %d\ndiferencia: %d\ncociente: %d\nresiduo: %d\n", 
	suma, producto, diferencia, conciente, residuo);
	return 0;
}
