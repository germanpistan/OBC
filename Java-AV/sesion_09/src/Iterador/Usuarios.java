package Iterador;

import Iterador.Usuario;
import java.util.ArrayList;

public class Usuarios implements Iterator.UsuarioIterador {

    private ArrayList<Usuario> usuarios = new ArrayList();
    private int posicion = 0;
    public void Crear(Usuario usuario){
        usuarios.add(usuario);
    }


    @Override
    public Usuario siguente(){
        Usuario usuario = usuarios.get(posicion);
        posicion = posicion + 1;
        return usuario;
    }

    @Override
    public boolean hayMas() {
        return posicion < usuarios.size();
    }

    @Override
    public void reinicia() {
        posicion=0;
    }


}
