// Sentencia Switch

let nota = 2;

switch(nota){
    case 5:
        console.log("Felicidades, has obtenido sobresaliente");
        break;
    case 4: 
        console.log("Buen trabajo, podrias mejorar");
        break;
    case 3: 
        console.log("Has obtenido un suficiente");
        break;
    case 2:
        console.log("No has aprobado");
        break;
    case 1:
        console.log("No estudiaste nada!");
        break;
    default:
        console.log("Error, ingrese una nota ente 1  y 5");
        break;
}
