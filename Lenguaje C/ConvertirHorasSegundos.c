/*Segundos de una hora*/

#include <stdio.h>

int main()
{
	int minutoSeg = 60;
	int hora,minutos,segundo,conversionHS,conversionMinS,seguntosT;
	
	printf("Introduzca horas: ");
	scanf("%d", &hora);
	
	printf("Introduzca minutos: ");
	scanf("%d", &minutos);
	
	printf("Introduzca segundos: ");
	scanf("%d", &segundo);
	
	conversionHS = (hora * minutoSeg) * minutoSeg;
	conversionMinS = minutos * minutoSeg;
	
	seguntosT = conversionHS + conversionMinS + segundo;
	
	printf("La cantidad de segundos es: %d segundos",seguntosT);
	
	return 0;
}
