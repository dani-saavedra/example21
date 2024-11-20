package org.example;

/*
    Java 12 preview
    Java 14 Confirm
 */
public class SwitchImprovment {
    /*

    Característica	                Java 8	                             Java 14
    Soporte para Expresiones	Solo como sentencia (statement).	    Puede ser usado como expresión.
    Retorno de Valores          Manual usando variables intermedias.	Uso directo de yield para retornar valores.
    Pattern Matching	        No disponible.	                        Disponible con case (ej. instanceof).
    Fallthrough	                Por defecto. Necesita break.	        Eliminado en el nuevo formato de switch.
    Tipos de Datos Soportados	Limitado.	                            Mayor flexibilidad con sealed classes, records, etc.
    Exhaustividad	            No verificado por el compilador.	    El compilador asegura exhaustividad.

     */
    public void ejemploJava8(int day) {
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            default:
                dayName = "Unknown";
        }

        System.out.println("Day: " + dayName);
    }

    public void ejemploJava21(int day) {

        // Switch como expresión
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown";
        };

        System.out.println("Day: " + dayName);
    }

    //Uso de yield Permite devolver valores dentro de switch de manera más intuitiva.
    public void usoYield(int day) {
        //¿Qué hace yield?
        //Devuelve un valor desde un bloque de código dentro de un switch.
        //Reemplaza el uso de variables temporales o intermedias para asignar valores en bloques complejos.
        //En lugar de usar return (que no es válido dentro de un switch como expresión) o manejar lógicas redundantes,
        // yield asegura que cada bloque pueda proporcionar un valor de manera directa.
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> {
                // Bloque con lógica compleja
                yield "Invalid day";
            }
        };

        System.out.println("Day type: " + dayType);
    }

    //sin yield
    public void sinYield(int day) {
        String dayType;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;
            default:
                dayType = "Unknown";
        }
        System.out.println("Day type: " + dayType);
    }

    //Con yield
    void conYield(int day) {
        // Usamos switch como expresión con yield
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Unknown";
        };
        System.out.println("Day type: " + dayType);
    }


    //Patter matching
    //Combina instanceof con switch.
    //Detecta automáticamente el tipo y lo asigna a una variable (i, s).
    public void patterMatching(Object obj) {

        String result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case null -> "Null value";
            default -> "Unknown type";
        };

        System.out.println(result);
    }
}
