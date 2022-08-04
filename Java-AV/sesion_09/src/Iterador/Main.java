package Iterador;

import Iterador.Usuarios;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.Crear(new Usuario("uno",5));
        usuarios.Crear(new Usuario("dos",25));
        usuarios.Crear(new Usuario("tres",10));
        usuarios.Crear(new Usuario("cuatro",8));

        while (usuarios.hayMas()) {
            Usuario usuario = usuarios.siguente();
            System.out.println("Usuario es: " + usuario.getNombre());
        }
        usuarios.Crear(new Usuario("cinco",18));
        Usuario usuario = usuarios.siguente();
        System.out.println("Usuario es: " + usuario.getNombre());

        usuarios.reinicia();
        while (usuarios.hayMas()) {
            usuario = usuarios.siguente();
            System.out.println("Usuario es: " + usuario.getNombre());
        }
    }
}