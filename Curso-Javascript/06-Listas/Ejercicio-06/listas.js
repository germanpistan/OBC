/*Crea un archivo JS que contenga las siguientes líneas
- Una variable que contenga la lista de la compra (mínimo 5 elementos)
- Modifica la lista de la compra y añádele "Aceite de Girasol"
- Vuelve a modificar la lista de la compra eliminando "Aceite de Girasol"
- Una lista de tus 3 películas favoritas (objetos con propiedades: titulo, director, fecha)
- Una nueva lista que contenga las películas posteriores al 1 de enero de 2010 (utilizando filter)
- Una nueva lista que contenga los directores de la lista de películas original (utilizando map)
- Una nueva lista que contenga los títulos de la lista de películas original (utilizando map)
- Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando concat)
- Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando el factor de propagación)*/

const compra = ["Leche", "Harina", "Huevos", "Manteca", "Queso", "Agua"]

compra.push("Aceite de Girasol")
console.log(compra)
compra.pop()
console.log(compra)
const peliculas = [
    {
        titulo: "El efecto mariposa",
        director: "Eric Bress",
        fecha: new Date(2004, 3, 30)
    },
    {
        titulo: "Spider-Man: No Way Home",
        director: "Jon Watts",
        fecha: new Date(2021, 11, 16)
    },
    {
        titulo: "Pulp Fiction",
        director: "Quentin Tarantino",
        fecha: new Date(1995, 0, 13)
    }
]

const peliculasNuevas = peliculas.filter(pelicula => pelicula.fecha > new Date(2010, 0, 1))
console.log(peliculasNuevas)

const directores = peliculas.map(pelicula => {
    return pelicula.director
})
console.log(directores)

const titulos = peliculas.map(pelicula => {
    return pelicula.titulo
})
console.log(titulos)


const directores_titulos = directores.concat(titulos)
console.log(directores)
const directores_titulos_prop = [...directores, ...titulos]
console.log(directores_titulos_prop)