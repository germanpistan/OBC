package poo.Ejercicio_05;

/** Crear una interfaz CocheCRUD.
 Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
 Como métodos de CocheCRUD podemos poner:
 save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
 Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
 Ejemplo:
 CocheCRUD cocheCrud = new CocheCRUDImpl()
 **/
import poo.Ejercicio_05.CocheCRUD;

public class Main {

    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        System.out.println(cocheCrud);
    }
}









