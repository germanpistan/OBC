/*Enunciado del ejercicio:
Primera parte:
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.

Segunda parte:
Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.
*/
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
            int result = sum(3,4,5);
            System.out.println(result);

            Coche miCoche = new Coche();
            miCoche.agregaPuerta();
            System.out.println(miCoche.puertas);
    }

    public  static int sum(int a, int b, int c){
        int resulta= a + b + c;
        return resulta;
    }
}

class Coche{
    public int puertas = 0;

    public void agregaPuerta() {
        this.puertas++;
    }
}