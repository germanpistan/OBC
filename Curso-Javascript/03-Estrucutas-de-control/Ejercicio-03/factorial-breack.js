/*Crea los siguientes archivos JS:
- factorial-for.js -> Este archivo debe calcular el factorial de 10 utilizando un solo bucle for
- factorial-while.js -> Este archivo debe calcular el factorial de 10 utilizando un bucle while
- factorial-break.js -> Este archivo debe calcular el factorial de 10 utilizando un bucle while, una bifurcación if y una sentencia break*/

let num=10;
let factorial = 1;
while (true) {
    factorial *= num;
    num--;
    if(num===1){
        break;
    }
}
// Factorial de 10 = 3628800
console.log(factorial);
    