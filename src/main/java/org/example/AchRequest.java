package org.example;

import java.time.LocalDateTime;

//Para trabajar  nuestros DTO
// Cuando queramos mover datos dentro de la aplicacion que sea inmutable.
public record AchRequest(String nombre,
                         Integer id,
                         LocalDateTime fecha) {

}
