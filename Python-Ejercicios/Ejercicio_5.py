#Para este ejercicio tenéis que crear en la consola de python variables que
# representen los siguientes datos de un contacto:
#Nombre
#Apellidos
#Edad
#Email
#Teléfono
#Casado (verdadero o falso)
#Con Hijos (verdadero o falso)
# Lista de amigos
# Películas vistas (diccionario con clave y valor. El valor será el título de la película)
# Una vez hayas creado todas las variables, muéstralas por consola haciendo
# uso de la función print().

nombre = 'Jose'
apellido = 'Pedro'
edad = 37
email = 'email@email.com'
telefono = 123123
casado = True
con_hijos = True
lista_amigos: list = ['amigo1', 'amigo2', 'amigo3']
peliculas_vistas = {
    "peli1": "Pelicula Nombre1",
    "peli2": "Pelicula Nombre2",
    "peli3": "Pelicula Nombre3"
}

print(nombre)
print(apellido)
print(edad)
print(email)
print(telefono)
print(casado)
print(con_hijos)
print(lista_amigos)
print(peliculas_vistas)