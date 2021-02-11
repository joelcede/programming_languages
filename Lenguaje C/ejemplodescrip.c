/*decencriptar*/

#include<stdio.h>

int main(){
	int desencriptar;
	int div1,div2,div3,div4;
	int mod1,mod2,mod3,mod4;
	int cont1,cont2,cont3,cont4;
	
	printf("Descencriptar: ");
	scanf("%d", &desencriptar);
	
	div1 = desencriptar / 10;
	mod1 = desencriptar % 10;
	
	if (mod1 < 8){
		div1 = desencriptar / 100;
		mod1 = desencriptar % 100 -7;
	}else if (mod1 > 7){
		div1 = desencriptar / 10;
		mod1 = desencriptar % 10 - 7;
	}
	
	div2 = div1 / 10;
	mod2 = div1 % 10;
	
	if (mod2 < 8){
		div2 = div1 / 100;
		mod2 = div1 % 100 -7;
	}else if (mod2 > 7){
		div2 = div1 / 10;
		mod2 = div1 % 10 - 7;
	}
	div3 = div2 / 10;
	mod3 = div2 % 10;
	
	if (mod3 < 8){
		div3 = div2 / 100;
		mod3 = div2 % 100 -7;
	}else if (mod3 > 7){
		div3 = div2 / 10;
		mod3 = div2 % 10 - 7;
	}
	div4 = div3 / 10;
	mod4 = div3 % 10;
	
	if (mod4 < 8){
		div4 = div3 / 100;
		mod4 = div3 % 100 -7;
	}else if (mod4 > 7){
		div4 = div3 / 10;
		mod4 = div3 % 10 - 7;
	}
	
	printf("%d%d%d%d", mod2, mod1, mod4, mod3);
	
	return 0;
}
