package Refactor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ConstructorLargoBuilder cosa =new ConstructorLargoBuilder("marca")
                .conModelo("A")
                .conMotor("Electrico")
                .conPuertas(5)

        int []numeros={12,23,-45,1,9};
                imprimeMayoryMenor(numeros);
    }

    private static void imprimeMayoryMenor(int[] numeros) {
       /* int mayor=0;
        int menor=numeros[0];

         for(int i :numeros) {
           if (mayor<numeros[i]) {
                mayor=numeros[i];
            }

            if (menor>numeros[i]) {
                menor=numeros[i];
            }*///REFACTORIZANDO CODIGO
           /* mayor = mayor < i ? i :mayor;
            menor = menor > i ? i :menor;}*/
            ///Otra manera programacion funcional
        int mayor = Arrays.stream(numeros).reduce(0,(a, b)-> a > b ? a : b);
        int menor = Arrays.stream(numeros).reduce(0,(a, b)-> a < b ? a : b);




        System.out.println("Mayor: " + mayor + " y menor: " + menor);
    }


}