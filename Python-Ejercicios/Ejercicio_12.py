#Escribe una función que pueda decirte si un año (número entero) es bisiesto o no.

def esbisiesto():
  anio = int(input("Introduce un año a evaluar: "))

  if(anio % 4 == 0 and (anio % 100 != 0 or anio % 400 == 0)):
      print(f"¡El año {anio} es bisiesto!")
  else:
      print(f"Lo siento. El año {anio} NO es bisiesto!")

print({esbisiesto()})