package poo.Ejercicio_04;

import poo.Ejercicio_04.SmartDevice;

public class SmartPhone extends SmartDevice {
        int ram;
        String sistema;

        public SmartPhone() {
            super();
        }

        public SmartPhone(String marca, String modelo, String color, int ram, String sistema) {
            super(marca, modelo, color);
            this.ram = ram;
            this.sistema = sistema;

        }

        @Override
        public String toString() {
            return "marca=" + marca +
                    ", modelo=" + modelo +
                    ", color=" + color +
                    ", ram=" + ram +
                    ", sistema=" + sistema;
        }
}
