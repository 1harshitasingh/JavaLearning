package com.harshita.lecture12;

class Shape1 {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle1 extends Shape1 {
    public void area(int h, int b) {
        // Corrected division issue by using 0.5
        System.out.println(0.5 * b * h);
    }
}

class Circle extends Shape1 {
    double radius;

    // Constructor to initialize radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of a circle
    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class OOPS7 {
    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.area();

        // Create a Triangle object and call its method
        Triangle triangle = new Triangle();
        triangle.area(10, 5);

        // Create a Circle object and call its method
        Circle circle = new Circle(7);
        circle.area();  // Calculates and displays the area of the circle
    }
}
