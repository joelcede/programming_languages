/*
Escriba un programa que lea cinco enteros y que después 
imprima el número más grande y el más pequeño del grupo. 
Utilice sólo técnicas de programación que haya aprendido en este capítulo.
*/

#include<stdio.h>

int main(){
	int p, s, t, c, q;
	
	printf("Escriba 5 numeros: ");
	scanf("%d%d%d%d%d", &p, &s, &t, &c, &q);
	
	if (p < s && p < t && p < c && p < q){
		printf("El numero mas pequeño es: %d\n",p);
	}
	if (s < p && s < t && s < c && s < q){
		printf("El numero mas pequeño es: %d\n",s);
	}
	if (t < p && t < s && t < c && t < q){
		printf("El numero mas pequeño es: %d\n",t);
	}
	if (c < p && c < t && c < s && c < q){
		printf("El numero mas pequeño es: %d\n",c);
	}
	if (q < p && q <t && q < s && q < c){
		printf("El numero mas pequeño es: %d\n",q);
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
