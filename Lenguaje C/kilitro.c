/*
Los conductores están preocupado por el kilometraje obtenido en sus automóviles. 
Un conductor mantiene el registro de muchos llenados de tanque de gasolina 
mediante el registro de miles de kilómetros conducidos y los
litros empleados durante cada llenado del tanque. 
El programa debe calcular y desplegar los kilómetros por litro
obtenidos durante cada llenado de tanque. Después de procesar 
toda la información, el programa debe calcular y
desplegar los kilómetros por litro combinados de todos los llenados de tanque.
*/

#include<stdio.h>

int main(){
	float litros,tanque,suma=0,resultado,division=0;
	int kilometros,contador=-1;
	
	while(litros != -1){
		
		printf("Introduzca los litros utilizados (-1 para terminar): ");
		scanf("%f", &litros);
		
		if (litros > 0){		
			printf("Introduzca los kilometros conducidos: ");
			scanf("%d", &kilometros);
			
			division  = kilometros / litros;
			printf("Los kilometros por litro de este tanque fueron: %.2f\n\n", division);
			
			if (contador > -2){
				suma = suma +division;			
			}	
		}
		++contador;
	}
	
	resultado = suma / contador;
	printf("El promedio general de kilometros/litro fue: %.2f\n", resultado);
	printf("%d %d",contador,suma);
		
	return 0;
}
