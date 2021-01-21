/*
 ¿Cómo puede determinar la rapidez real con la que opera su propia computadora? Escriba un programa mediante un
ciclo while que cuente de 1 a 300,000,000 por unos. Cada vez que la cuenta alcance un múltiplo de 100,000,000
despliegue dicho número en la pantalla. Utilice su reloj para determinar cuánto tarda cada millón de repeticiones del
ciclo
*/
//Espero mi computadora no muera//
#include<stdio.h>

int main(){
	int numero=1;
	int k300 = 300000000;
	int p3 = k300 / 3;
	
	while (numero < k300+1){
		if (numero%p3==0){
			printf(" \n ---> %d <---\n\n",numero);
		}if (numero%1000000==0){
			printf("%d\n",numero);
		}
		numero++;
	}
	
}
