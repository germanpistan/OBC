#Escribe una función que pueda decirte si un número (número entero) es primo o no.


def numeroprimo():
  numero = int(input("Introduce un número entero: "))

  if numero > 1:
    # Buscamos los factores de número
    for i in range(2,int(numero)):
        if (int(numero) % i) == 0:
            print(f"Lo siento, el {numero} NO ES PRIMO. Es divisible entre {i}")
            break
        else:
            print(f"¡GENIAL!, el {numero} ES PRIMO")
  else:
    print(f"Lo siento, el {numero} NO ES PRIMO. Los números primos son mayores que 1")

print({numeroprimo()})