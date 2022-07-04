/*Enunciado del ejercicio:
Enunciado del ejercicio:

En este ejercicio practicarás las estructuras de control, para ello deberás crear:
Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile
sea inferior a 3, el bloque de código que tendrá el bucle deberá:
Incrementar el valor de la variable en uno cada vez que se ejecute.
Mostrarlo por pantalla cada vez que se ejecute.
Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar
una vez.
Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será
que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y
deberá mostrarse por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro
estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola
informando de la estación en la que está. También habrá que poner un default para cuando el valor de la
variable no sea una estación.
*/
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int numeroIf = 0;
        int numeroWhile = 0;
        int numeroFor = 0;
        int estacion = 1;

    //SENTENCIA IF-------------------------------------------
        if (numeroIf == 0) {
            System.out.println("El numero es 0");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es positivo");
        }
        System.out.println("-----------SALI DEL IF------------");
    //SENTENCIA WHILE
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        System.out.println("-----------SALI DEL WHILE---------");
    //SENTENCIA DO
        do {
            System.out.println("-----------ENTRE EN DO------------");
        }while (numeroWhile < 3);
        System.out.println("-----------SALI DEL DO------------");
    //SENTENCIA FOR
        for (numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
        System.out.println("-----------SALI DEL FOR----------");
    //SENTENCIA SWITCH
        switch (estacion){
            case 1:
                System.out.println("La estacion es VERANO");
                break;
            case 2:
                System.out.println("La estacion es OTOÑO");
                break;
            case 3:
                System.out.println("La estacion es INVIERNO");
                break;
            case 4:
                System.out.println("La estacion es PRIMAVERA");
                break;
            default:
                System.out.println("Ese dato no es una estacion");
                break;
        }
        System.out.println("-----------SALI DEL SWITCH---------");
    }

}