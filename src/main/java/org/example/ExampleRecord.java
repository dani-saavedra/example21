package org.example;

//@JsonProperty("first_name")
public record ExampleRecord(String firstName, String lastName, String email,
                            String documentType, String document, String house, Integer neighborhood, Integer id) {
}