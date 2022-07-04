#Escribe un programa que sea capaz de mostrar los números del 1 al 100 en orden inverso.

lista=[]

for n in range(100):
    lista.append((100-n))

print(lista)