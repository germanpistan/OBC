/*
Crea un archivo llamado objetos.js que contenga las siguientes líneas
- Un objeto con tus datos personales (nombre, apellido, edad, altura, eresDesarrollador)
- Una variable que obtenga tu edad a partir del objeto anterior
- Una lista que contenga el objeto con tus datos personales y un nuevo objeto con los datos personales de tus dos mejores amig@s
- Una nueva lista con los objetos de la lista anterior ordenados por edad, de mayor a menor
*/

const listaObjetos = [{
    nombre: "Jose", 
    apellido: "Perez",
    edad: 35,
    altura: 1.70,
    isDev: true 
    },{ 
    nombre: "Miguel", 
    apellido: "Angel",
    edad: 15,
    altura: 2.70,
    isDev: false },{
    nombre: "Pedro", 
    apellido: "Escamoso",
    edad: 70,
    altura: 1.30,
    isDev: true }]

    var edadMia = listaObjetos.find(o=>o.nombre = "Emanuel")
    console.log(edadMia.edad)

    const nuevoObjeto = listaObjetos.sort((a,b)=>a.edad-b.edad)
    console.log(nuevoObjeto)