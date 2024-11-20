package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    Java 10
 */
public class ExampleVar {

    //Puedes usar var en métodos, bloques de inicialización y controladores try-with-resources.
    public void metodo() {
        String nombre = "Alice"; // Válido: Variable local

        /*
        var nombre; // Error: Falta inicialización
        nombre = "Alice";
         */
    }

    //No se puede usar para variables de instancia, parámetros de métodos o retornos.
    /*
        public var metodoInvalido() { // No válido
            return "Hello";
        }

     */


    public void metodo2() {
        //Menos verboso
        Map<String, List<Integer>> mapa = new HashMap<>(); // Antes
        var mapa2 = new HashMap<String, List<Integer>>();   // Ahora

        int numero = 1;
        //Mas fácil de leer
        var nombres = List.of("Alice", "Bob", "Charlie");
    }

    public String metodo3() {
        return "daniel";
    }
}
