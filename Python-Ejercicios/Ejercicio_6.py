#Escribe un programa en la consola de python que pida al usuario su peso (en kg)
# y estatura (en metros), calcule el índice de masa corporal y lo almacene en una variable,
# e imprima por pantalla la frase Tu índice de masa corporal es donde es el índice de masa
# corporal calculado redondeado con dos decimales. Tienes que subir capturas de pantalla
# en una carpeta comprimida zip.

#pide peso
peso = int(input("Introdusca peso en Kg :"))
altura = float(input("Introdusca su altura mtrs :"))

print("Ud ingreso un peso de " + str(peso) + "Kg")
print("Y una altura de " + str(altura) + "mtrs")

imc = round(peso / (altura * altura),2)
print("Su IMC es de: " + str(imc))