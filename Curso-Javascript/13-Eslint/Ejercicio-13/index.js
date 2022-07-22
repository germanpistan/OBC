/*Crea un nuevo proyecto de Node

- Instala la dependencia ESLint (https://www.npmjs.com/package/eslint)
- Duplica el archivo del ejercicio de la sesión 04-Textos
- Utiliza los tres estilos de comillas de forma alterna (comillas simples, dobles, backticks)
- Crea el fichero .eslintrc.json
- Cambia la configuración de ESLint para que la versión ecmaVersion sea "latest"
- Cambia la configuración de ESLint para que muestre un error cada vez que las comillas no sean dobles
- Crea un script en el package.json para corregir automáticamente todos los errores
- Ejecuta el script a través del terminal*/

const nombre = "Emanuel"
const apellido = "Tevez"
const estudiante = nombre.concat(" ").concat(apellido)

const estudianteMayus = estudiante.toUpperCase()
const estudianteMinus = estudiante.toLowerCase()

const estudianteLength = estudiante.length

console.log(estudianteMayus)
console.log(estudianteMinus)
console.log(estudianteLength)



const inicialNombre = nombre[0]
console.log(inicialNombre)


const finalApellido = apellido[apellido.length - 1]
console.log(finalApellido)


const estudianteSinEspacios = estudiante.replace(" ", "")
console.log(estudianteSinEspacios)


const nombreEnEstudiante = estudiante.includes(nombre)
console.log(nombreEnEstudiante)