package org.example;

/*
    Java 16
 */
public class ExampleInstanceof {

    //"Pattern Matching for instanceof",
    // que combina la verificación de tipo (instanceof) y el cast en una sola operación.
    public void procesar(Object obj) {
        if (obj instanceof String str) { // Verifica el tipo y realiza el cast
            System.out.println(str.toUpperCase());
        }
    }

    public void procesar2(Object obj) {
        if (obj instanceof String str) {
            System.out.println("Es una cadena: " + str.toUpperCase());
        } else if (obj instanceof Integer num) {
            System.out.println("Es un entero: " + (num + 10));
        } else if (obj instanceof Double d) {
            System.out.println("Es un doble: " + (d * 2));
        } else {
            System.out.println("Tipo desconocido");
        }
    }
}
