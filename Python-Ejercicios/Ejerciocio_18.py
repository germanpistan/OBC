#En este segundo ejercicio, tendréis que crear un archivo py y dentro crearéis
# una clase Vehículo, haréis un objeto de ella, lo guardaréis en un archivo y
# luego lo cargamos.

from pickle import *

class Vehiculo:

    def __init__(self, color, puertas):
        self.color = color
        self.puertas = puertas

    def __str__(self):
        return self.color + " " + self.puertas


corsa = Vehiculo("Azul", "4")
print(corsa)

file = open('vehiculo_objeto', 'w+b')

dump(corsa, file)

file.seek(0)
nuevo_corsa = load(file)

print(nuevo_corsa)
file.close()