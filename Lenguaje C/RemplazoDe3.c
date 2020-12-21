/*Remplazar 3 numero*/

#include <stdio.h>

int main()
{
	int remplazo,n1,n2,n3;
	
	printf("Escribe el primer numero: ");
	scanf("%d",&n1);
	
	printf("Escribe el segundo numero: ");
	scanf("%d",&n2);
	
	printf("Escribe el tercer numero: ");
	scanf("%d",&n3);
	
	remplazo = n3;
	n3 = n2;
	n2 = n1;
	
	printf("primer numero: %d\n",remplazo);
	printf("segundo numero: %d\n",n3);
	printf("tercer numero: %d\n",n2);
	
	return 0;
}
