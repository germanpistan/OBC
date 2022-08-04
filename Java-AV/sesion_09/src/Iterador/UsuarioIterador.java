package Iterator;
import Iterador.Usuario;

public interface UsuarioIterador {
    //Hay mas usuarios en el iterador??
    boolean hayMas();

    //Reinicia el contador (el iterador)
    void reinicia();

    //Obtiene el siguente
    Usuario siguente();
}
