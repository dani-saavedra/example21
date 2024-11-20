package org.example;

import static java.lang.StringTemplate.STR;

import java.text.MessageFormat;
/*
Introduce in Java 21 with preview
 */
public class ExampleStringTemplate {

    /*
            simplify the process of expressing Strings with values that can be compiled at run time
            enhanced readability of String compositions, overcome the verbosity associated with StringBuilder and StringBuffer classes
     */
    String composeUsingPlus(String feelsLike, String temperature, String unit) {
        return "Today's weather is " + feelsLike +
                ", with a temperature of " + temperature + " degrees " + unit;
    }

    String composeUsingStringBuilder(String feelsLike, String temperature, String unit) {
        return new StringBuilder()
                .append("Today's weather is ")
                .append(feelsLike)
                .append(", with a temperature of ")
                .append(temperature)
                .append(" degrees ")
                .append(unit)
                .toString();
    }

    String composeUsingFormatters(String feelsLike, String temperature, String unit) {
        return String.format("Today's weather is %s, with a temperature of %s degrees %s",
                feelsLike, temperature, unit);
    }

    String composeUsingMessageFormatter(String feelsLike, String temperature, String unit) {
        return MessageFormat.format("Today''s weather is {0}, with a temperature of {1} degrees {2}",
                feelsLike, temperature, unit);
    }

    String basic() {
        String name = "Alice";
        int age = 30;
        // Uso de un String Template
        return STR."Hello, my name is \{name} and I am \{age} years old.";
    }

    String operaciones() {
        int x = 5;
        int y = 10;
        // Interpolación de expresiones
        return STR."The sum of \{x} and \{y} is \{x + y}.";

    }

    String combinandoConTextBlock() {
        String language = "Java";
        int year = 21;

        // Uso combinado con bloques de texto
        return STR."""
                Welcome to \{language} \{year}!
                This feature makes string handling much easier.
                """;
    }

    String sqls() {
        String table = "users";
        String column = "age";
        int minAge = 18;

        return STR."SELECT * FROM \{table} WHERE \{column} > \{minAge};";
    }
    /*
        Legibilidad Mejorada: Código más limpio y fácil de leer.
        Menos Propenso a Errores: Evita problemas comunes como concatenaciones erróneas.
        Seguridad de Tipos: Las expresiones dentro de \{} son validadas por el compilador.
        Interpolación Directa: No necesitas usar String.format o concatenaciones manuales.

     */


}
