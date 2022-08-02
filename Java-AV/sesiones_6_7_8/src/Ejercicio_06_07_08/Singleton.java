/*Identifica las características principales de los patrones de diseño más conocidos,
 indica para qué valen y un caso de uso para cada uno de ellos.

Crea una pequeña aplicación implementando el patrón Singlenton y demuestra que, efectivamente,
no crea instancias nuevas. Puedes tomar la sesión 7 como referencia.
* */

package Ejercicio_06_07_08;

public final class Singleton {
        private static Singleton instance;
        public String value;

        private Singleton(String value) {
            // The following code emulates slow initialization.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            this.value = value;
        }

        public static Singleton getInstance(String value) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
}
