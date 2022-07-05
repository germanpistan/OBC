#En este ejercicio tendréis que crear un módulo que contenga las operaciones básicas de una calculadora:
# sumar, restar, multiplicar y dividir.
# Este módulo lo importaréis a un archivo python y llamaréis a las funciones creadas.
# Los resultados tenéis que mostrarlos por consola.

import Anex_15 as an

a = float(input("Ingrese primer nùmero"))
b = float(input("Ingrese otro nùmero"))

print("Suma : " , an.suma(a,b))
print("Resta : " , an.resta(a,b))
print("Multiplicacion : " , an.multi(a,b))
print("Division : " , an.divi(a,b))