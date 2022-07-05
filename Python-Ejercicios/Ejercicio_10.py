#Escribe una función que calcule el área de un triángulo, recibiendo la altura
# y la base como parámetros y
# otra función que calcule el área de un círculo recibiendo el radio del mismo.

def areaTrian(base,  altura):
    areaT = (base * altura)/2
    return areaT

def areaCircl(radio):
    areaC = 2 * 3.14 * radio
    return areaC

base = input("ingrese base del triangulo: ")
altura =input("ingrese altura del triangulo: ")

resuT = areaTrian(int(base),int(altura))
print("Area del tiangulo: ", resuT)

radio = input("ingrese radio del ciruclo: ")
resuC = areaCircl(int(radio))
print("Area del Circulo: ", resuC)