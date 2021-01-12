/*
Identifique y corrija los errores de cada uno de los siguientes ejercicios (Nota: Puede haber más de un error en cada ejercicio.)
a) scanf( “d”, valor ); 	|falta el % y el &
b) printf( “El producto de %d y %d es %d\n, x, y ); 	|faltan comillas
c) primerNumero + segundoNumero = sumaDeNumeros  |faltan ;
d) if ( numero => masGrande )
masGrande == numero; 	faltan{}
e) */ Programa para determinar el número más grande de tres enteros /*	|esta mal puesto el /* */
/*
f) Scanf( %d”, unEntero ); 	|scan esta mal escrito, es sensible a mayusculas
g) printf( “El residuo de %d entre %d es\n”, x, y, x % y ); error tiene mas parametros de lo normal y error en %
h) if ( x = y ); 	|no lleba; despues del if sino {
printf( %d es igual que %d\n”, x, y ); 	faltan comillas al principio y cerrar con }
i) printf( “La suma es %d\n,” x + y );	|no se puede sumar dentro de un lugar que contiene texto
j) Printf( “El valor que escribió es: %d\n, &valor ); falta cerrar comillas y no lleva &

Complete los espacios en blanco:

a) Los___*//*____ se utilizan para documentar un programa y para mejorar su legibilidad.
b) La función que se utiliza para desplegar información en la pantalla es___printf___ .
c) En C, una instrucción para tomar decisiones es ____if___.
d) En general, las instrucciones __matematicas___son quienes realizan los cálculos.
e) La función ___scanf___introduce valores desde el teclado.

2.9 Escriba una sola instrucción o línea de C que realice lo siguiente:

a) Imprima el mensaje “Escriba dos números”.
printf("imprima 2 numeros: ");
b) Asigne el producto de las variables b y c a la variable a.
int b,c = 12,23;
int a = b,c;
c) Indique que un programa realiza un cálculo de nómina (es decir, utilice texto que ayude a documentar un programa).
/*calculo de nominas*//*
d) Escriba tres valores enteros desde el teclado y coloque estos valores en las variables enteras a, b y c.
int a,b,c;
scanf("%d%d%d",a,b,c);
printf(a,b,c);

2.10 Indique cuáles de las siguientes oraciones son verdaderas y cuáles son falsas. Si son falsas, explique su respuesta.

a) Los operadores de C se evalúan de izquierda a derecha.
verdadero
b) Los siguientes son nombres de variables válidos: _guion_bajo_, m928134, t5, j7, sus_ventas,
su_cuenta_total, a, b, c, z, z2.
verdadero
c) La instrucción printf(“a = 5;”); es un típico ejemplo de una instrucción de asignación.
falso
d) Una expresión aritmética válida que no contiene paréntesis se evalúa de izquierda a derecha.
verdadero
e) Los siguientes son nombres no válidos de variables: 3g, 87, 67h2, h22, 2h.
verdadero
2.11 Complete los espacios en blanco:

a) ¿Qué operaciones aritméticas se encuentran en el mismo nivel de precedencia que la multiplicación?
.
la vivision
b) En una expresión aritmética, cuando los paréntesis están anidados, ¿qué conjunto de paréntesis se evalúa primero?
el primero de la izquirda
c) Una posición en la memoria de la computadora que contiene diferentes valores en diferentes momentos, a lo
largo de la ejecución de un programa se conoce como .
nose

¿Qué se imprime cuando se ejecuta cada una de las siguientes instrucciones? Si no se imprime algo, entonces responda “nada”. Suponga que x=2 y y=3.
a) printf( “%d”, x ); imprime 2
b) printf( “%d”, x + x ); nada
c) printf( “x=” ); nada
d) printf( “x=%d”, x );imprime x=2
e) printf( “%d = %d”, x + y, y + x ); imprime 6 = 6
f) z = x + y; nada
g) scanf( “%d%d”, &x, &y ); nada
h) /* printf( “x + y = %d”, x + y ); */ nada
/*
i) printf( “\n”); nada

¿Cuáles de las siguientes instrucciones de C contienen variables involucradas con la lectura destructiva?
a) scanf( “%d%d%d%d%d”, &b, &c, &d, &e, &f );
b) p = i + j + k + 7;
c) printf( “Lectura dest
la b

Dada la ecuación y = ax3
+7, ¿cuál de las siguientes son instrucciones correctas en C para esta ecuación?
a) y = a * x * x * x + 7;
b) y = a * x * x * ( x + 7 );
c) y = ( a * x ) * x * ( x + 7 );
d) y = ( a * x ) * x * x + 7;
e) y = a * ( x * x * x ) + 7;
f) y = a * x * ( x * x + 7 );
la d

Establezca el orden de evaluación de los operadores en cada una de las siguientes instrucciones de C, y muestre el
valor de x después de que se realice cada instrucción.
a) x = 7 + 3 * 6 / 2 – 1;
	1) primero se multiplica 3 * 6 = 18
	2)luego se divide 18 / 6 = 3
	3) despues se suma 7 + 3 = 10
	4) por ultimo se resta 10 - 1 = 9
	
b) x = 2 % 2 + 2 * 2 – 2 / 2;
	1) primero se saca el modulo de 2 % 2 = 0
	2) luego se multiplica 2 * 2 = 4
	3) se divide 2 / 2 = 1
	4) luego se resta 4 - 1 = 3
	
c) x = ( 3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) );
	1) se multiplica 9 * 3 = 27
	2) se destruye parentesis de 3 y se divide 27 / 3 = 9
	3) se destruye parentesis y se suma 3 + 9 = 12
	4)luego se multiplica  3 * 9 = 27
	5) se vuelve a multiplicar 27 * 12 = 324
*/
