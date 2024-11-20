package org.example;

import java.util.Arrays;
import java.util.List;

/*
    Java 9
 */
public class ExampleListOf {

    public void metodo1() {
        //Totalmente inmutable.
        //Más eficiente en memoria que Arrays.asList para listas pequeñas.
        List<String> lista = List.of("Java", "Python", "Kotlin");

        //en lugar de aslist que viene desde java 1.2
        List<String> lista2 = Arrays.asList("Java", "Python", "Kotlin");
        //No completamente inmutable: Aunque el tamaño de la lista no puede cambiar,
        // puedes modificar los elementos existentes.


    }
}
