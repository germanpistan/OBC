package poo.Ejercicio_04;

/*
En este ejercicio tendréis que crear una clase SmartDevice.
Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
Agregaréis atributos tal cual tendrían esos objetos en la realidad.
Crear constructor vacío y con todos los parámetros para cada clase.
Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.*/

import poo.Ejercicio_04.SmartDevice;
import poo.Ejercicio_04.SmartPhone;
import poo.Ejercicio_04.SmartWatch;


public class Main {

        public static void main(String[] args) {

            SmartPhone smartPhone = new SmartPhone("Samsung", "S10", "Azul",
                    8, "Android");

            SmartWatch smartWatch = new SmartWatch("Xiaomi", "Mi Band 6", "Negro",
                    3.5, "Bluetooth");

            System.out.println("El smartphone es: " + smartPhone + "\nEl smartwatch es: " + smartWatch);

        }

}









