/*
Crea un archivo JS que contenga las siguientes líneas
- Una variable que contenga tu altura en centímetros (entero)
- Una variable que contenga tu altura en metros (número de coma flotante)
- Una variable que contenga tu peso en kilogramos (número de coma flotante)
- Una variable que contenga tu altura en metros redondeada hacia arriba
- Una variable que contenga tu peso en kilogramos redondeado hacia abajo
- Una variable que contenga si "el máximo valor que se puede obtener en Javascript + 1" es igual al máximo valor que se puede obtener en Javascript
*/

const altura_cm = 171
const altura_m = 1.71
const peso_kg = 70.2

const altura_red = Math.ceil(altura_m)
const peso_red = Math.floor(peso_kg)

console.log(altura_red)
console.log(peso_red)

const sonIguales = Number.MAX_VALUE + 1 === Number.MAX_VALUE
console.log(sonIguales)