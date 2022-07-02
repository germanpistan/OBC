/*Enunciado del ejercicio:
Crea una clase Persona con las siguientes variables:

La edad
El nombre
El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono,
el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
y con una variable salario que solo tenga la clase Trabajador.

*/
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(35);
        cliente.setNombre("JOSE");
        cliente.setTelefono(123123);
        cliente.setCredito(123123);

        System.out.println("NOMBRE: " + cliente.getNombre() + "\nEDAD: " + cliente.getEdad() +
                "\nTELEFONO: " + cliente.getTelefono() + "\nCREDITO: " + cliente.getCredito());

        System.out.println("------------------------------------------------");
        Tranajador trabajador = new Tranajador();
        trabajador.setEdad(35);
        trabajador.setNombre("JOSE");
        trabajador.setTelefono(123123);
        trabajador.setSalario(123123);

        System.out.println("NOMBRE: " + trabajador.getNombre() + "\nEDAD: " + trabajador.getEdad() +
                "\nTELEFONO: " + trabajador.getTelefono() + "\nSALARIO: " + trabajador.getSalario());
    }
}
class Persona{
        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad(int edad){
            this.edad=edad;
        }
        public int getEdad(){
            return this.edad;
        }

        public void setNombre(String nombre){
            this.nombre=nombre;
        }

        public String getNombre(){
            return this.nombre;
        }

        public void setTelefono(int telefono){
            this.telefono=telefono;
        }

        public int getTelefono(){
            return this.telefono;
        }
 }

 class Cliente extends Persona{
        private int credito;

        public void setCredito(int credito){
         this.credito=credito;
     }

        public int getCredito(){
         return this.credito;
     }

 }
class Tranajador extends Persona{
        private int salario;

        public void setSalario(int salario){
            this.salario=salario;
        }

        public int getSalario(){
            return this.salario;
        }

}