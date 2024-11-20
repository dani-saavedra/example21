package org.example;

/*
    Preview Java 15 confirmada Java 17
    Permiten restringir qué clases o interfaces pueden extender o implementar una clase o interfaz específica.
    Esto brinda un mayor control sobre la jerarquía de clases y mejora la seguridad del diseño del sistema.
 */

sealed class Shape permits Circle, Rectangle, Triangle {
    // Métodos o atributos comunes a todas las formas
}

// Subclase final
final class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Subclase sellada
sealed class Rectangle extends Shape permits Square {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

// Subclase final de Rectangle
final class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

// Subclase no sellada
non-sealed class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

public final class ExampleSealedClasses {
    public double getArea(Shape shape) {
        return switch (shape) {
            case Circle c -> c.getArea();
            case Rectangle r -> r.getArea();
            case Triangle t -> t.getArea();
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        };
    }
}