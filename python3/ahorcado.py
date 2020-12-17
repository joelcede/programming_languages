import random

img = ['''
   +---+
   |   |
   O   |
       |
       |
       |
  =========''','''
   +---+
   |   |
   O   |
   |   |
       |
       |
  =========''','''
   +---+
   |   |
   O   |
  /|   |
       |
       |
  =========''','''
   +---+
   |   |
   O   |
  /|\  |
       |
       |
  =========''','''
   +---+
   |   |
   O   |
  /|\  |
  /    |
       |
  =========''','''
   +---+
   |   |
   O   |
  /|\  |
  / \  |
       |
  ========='''

]

palabrasA = [
		'hola',
		'licuadora',
		'pluma',
		'telefono',
		'computador',
		'teclado',
		'hacking',
		'libro',
		'mochila',
		'cerebro'
]

def azar():
	return random.choice(palabrasA)

def imagen(intentos,longitud):
	print(img[intentos])
	print()
	print(longitud)

def posicion(letra,palabra_buscada):
	letra = letra
	palabra_buscada = palabra_buscada
	if letra in palabra_buscada:
		return palabra_buscada.index(letra)

def remplazar(longitud,posicion,letra):
	longitud[posicion] = letra
	return longitud

def run():
	palabra_azar = azar()
	intentos = 0
	longitud = ['_'] * len(palabra_azar)
	while True:
		imagen(intentos,longitud)
		letra = input('Escribe una letra: ')
		x = posicion(letra,palabra_azar)
		if letra in palabra_azar:
			r = remplazar(longitud,x,letra)
			if '_' in longitud:
				intentos = intentos
			else:
				print(r)
				print('ganastes,la palabra es: {}'.format(palabra_azar))
				break
		else:
			intentos = intentos + 1
			if intentos == 6:
				print(r)
				print("perdiste, la palabra corecta es: {}".format(palabra_azar))
				break
run()

