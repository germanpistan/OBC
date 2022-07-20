var variable;

let variableLet;

const constante = "Soy una constante";
console.log(constante);

//var afecta todo el programa
var a=1;
console.log(a);
a = 4;
console.log(a);


//let afecta solo el bloque
let b=1;
console.log(b);
b = 5;
console.log(b);

var variables = "hola soy una VAR";
for(var i=0; i<3;i++){
    var variables = "Soy la segunda VAR"
}
console.log(variables)

let variablesLets = "hola soy una LET";
for(var i=0; i<3;i++){
    let variablesLets = "Soy la segunda LET"
}
console.log(variablesLets);

/////////////////
console.log(typeof(variablesLets))