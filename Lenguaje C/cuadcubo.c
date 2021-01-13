/*
Utilice sólo las técnicas que aprendió en este capítulo 
para escribir un programa que calcule los cuadrados y 
los cubos de los números 0 a 10, y que utilice tabuladores 
para desplegar la siguiente tabla de valores:
*/

#include<stdio.h>

int main(){
	
	int p = 0;
	int s = 1;
	int t = 2;
	int c = 3;
	int q = 4;
	int se = 5;
	int set = 6;
	int o = 7;
	int n = 8;
	int d = 9;
	int on = 10;
	
	int cuad1 = t * t;
	int cuad2 = c * c;
	int cuad3 = q * q;
	int cuad4 = se * se;
	int cuad5 = set * set;
	int cuad6 = o * o;
	int cuad7 = n * n;
	int cuad8 = d * d;
	int cuad9 = on * on;
	
	int cubo1 = t * t * t;
	int cubo2 = c * c * c;
	int cubo3 = q * q * q;
	int cubo4 = se * se * se;
	int cubo5 = set * set * set;
	int cubo6 = o * o * o;
	int cubo7 = n * n * n;
	int cubo8 = d * d * d;
	int cubo9 = on * on * on;
	
	printf("numero\tcuadrado\tcubo\n");
	printf("%d\t  %d\t\t%d\n",p, p, p);
	printf("%d\t  %d\t\t%d\n",s, s, s);
	printf("%d\t  %d\t\t%d\n",t, cuad1, cubo1);
	printf("%d\t  %d\t\t%d\n",c, cuad2, cubo2);
	printf("%d\t  %d\t\t%d\n",q, cuad3, cubo3);
	printf("%d\t  %d\t\t%d\n",se, cuad4, cubo4);
	printf("%d\t  %d\t\t%d\n",set, cuad5, cubo5);
	printf("%d\t  %d\t\t%d\n",o, cuad6, cubo6);
	printf("%d\t  %d\t\t%d\n",n, cuad7, cubo7);
	printf("%d\t  %d\t\t%d\n",d, cuad8, cubo8);
	printf("%d\t  %d\t\t%\n",on, cuad9, cubo9);
	
	return 0;
}
