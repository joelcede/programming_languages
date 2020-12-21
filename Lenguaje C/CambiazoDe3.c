/*
1º) Pida por teclado tres números (datos enteros) y sean almacenados en tres variables, llamadas a, b y c.
2º) Cambie los valores de las variables del siguiente modo:
El contenido de a pasa a ser el doble de c.
El contenido de b pasa a ser la suma de a más c.
El contenido de c pasa a ser el triple de b.
3º) Muestre por pantalla los valores contendidos en las variables*/

#include<stdio.h>

int main()
{
	int doble,suma,triple,a,b,c;
	
	printf("Escriba el primer numero: ");
	scanf("%d", &a);
	
	printf("Escriba el segundo numero: ");
	scanf("%d", &b);
	
	printf("Escriba el tercer numero: ");
	scanf("%d", &c);
	
	doble = c * c;
	suma = a + c;
	triple = b * b * b;
	/*cambio*/
	a = doble;
	b = suma;
	c = triple;
	
	printf("primer numero: %d\n",a);
	printf("primer numero: %d\n",b);
	printf("primer numero: %d\n",c);
	
	return 0;	
}
