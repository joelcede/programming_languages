/*
Escriba un programa que lea cinco enteros y que despu�s 
imprima el n�mero m�s grande y el m�s peque�o del grupo. 
Utilice s�lo t�cnicas de programaci�n que haya aprendido en este cap�tulo.
*/

#include<stdio.h>

int main(){
	int p, s, t, c, q;
	
	printf("Escriba 5 numeros: ");
	scanf("%d%d%d%d%d", &p, &s, &t, &c, &q);
	
	if (p < s && p < t && p < c && p < q){
		printf("El numero mas peque�o es: %d\n",p);
	}
	if (s < p && s < t && s < c && s < q){
		printf("El numero mas peque�o es: %d\n",s);
	}
	if (t < p && t < s && t < c && t < q){
		printf("El numero mas peque�o es: %d\n",t);
	}
	if (c < p && c < t && c < s && c < q){
		printf("El numero mas peque�o es: %d\n",c);
	}
	if (q < p && q <t && q < s && q < c){
		printf("El numero mas peque�o es: %d\n",q);
	}
	/*se busca al mas grande*/
	if (p > s && p > t && p > c && p > q){
		printf("El numero mas grande es: %d\n",p);
	}
	if (s > p && s > t && s > c && s > q){
		printf("El numero mas grande es: %d\n",s);
	}
	if (t > p && t > s && t > c && t > q){
		printf("El numero mas grande es: %d\n",t);
	}
	if (c > p && c > t && c > s && c > q){
		printf("El numero mas grande es: %d\n",c);
	}
	if (q > p && q > t && q > s && q > c){
		printf("El numero mas grande es: %d\n",q);
	}
	return 0;
}
