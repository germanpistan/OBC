import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        //la letra o delante indica objetos
        UserManager oUserManager = new UserManager();
    }
}

class ReverseString{

}

class UserManager{
    private int contador = 0;
    public void createUser(){
        //aNumeros la primera letra indica array
        int[]aNumeros ={1, 2, 3, 4};
        boolean bEsDeDia = false;
        char cLetra = 'a';
        double dValor = 5.1d;
        Hashtable<String,Integer> hUsuarios = new Hashtable();
        int iValores = 5;
        long iValoresLong = 5;

        String sCadena = "Hola, mundo";
        var vVariable = 5;
        byte byByte = 1;
        float flFloat = 1.5f;
    }
}


interface Iterable{}
interface Serializable{}
interface Iterador{}
interface Serializador{}
