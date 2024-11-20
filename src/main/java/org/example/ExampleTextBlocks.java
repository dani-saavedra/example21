package org.example;

/*
    Los Text Blocks, introducidos en Java 15,
    son una característica que permite manejar cadenas de texto multilínea de manera más legible y limpia.
    Se utilizan para evitar la complejidad de manejar múltiples concatenaciones o caracteres de escape cuando trabajamos con textos largos,
    como consultas SQL o un JSON.
 */
public class ExampleTextBlocks {
    public String basic() {
        return """
                Line 1: This is a tab: \t
                Line 2: This is a quote: \"
                Line 3: This is a backslash: \\
                """;


    }

    public String query(boolean active) {
        return """
                SELECT id, name, email
                FROM users
                WHERE status = active
                ORDER BY name;
                """;
    }

    public String json() {
        return """
                {
                    "name": "Alice",
                    "age": 30,
                    "isActive": true
                }
                """;
    }

    public String antes() {
        return "{\n" +
                "    \"name\": \"Alice\",\n" +
                "    \"age\": 30,\n" +
                "    \"isActive\": true\n" +
                "}";
    }
}
