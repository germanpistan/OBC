package Strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       UsuariosFichero usuarios = new UsuariosFichero();
       //UsuariosMemoria usuarios = new UsuariosMemoria();

        crear(usuarios,"fulano");
        crear(usuarios,"mengano");
        crear(usuarios,"pepe");

        for (String usuario: listar(usuarios)){
            System.out.println(usuario);
        }
    }

    public static void crear(Usuarios usuarios, String nombre){
        usuarios.crear(nombre);
    }

    public static ArrayList<String> listar(Usuarios usuarios){
        return  usuarios.listar();
    }
}
