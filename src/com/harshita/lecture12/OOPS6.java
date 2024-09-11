package com.harshita.lecture12;

class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

class Triangle extends Shape {
    public void area(int h, int b) {
        // Corrected division issue by using 0.5
        System.out.println(0.5 * b * h);
    }
}

class EquilateralTriangle extends Triangle {
    int side;

    // Constructor to initialize side
    EquilateralTriangle(int side) {
        this.side = side;
    }

    // Method to calculate the area of an equilateral triangle
    public void area() {
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area of Equilateral Triangle: " + area);
    }
}

public class OOPS6 {
    public static void main(String[] args) {
        // Create a Shape object and call its method
        Shape shape = new Shape();
        shape.area();  // Displays Area of Shape

        // Create a Triangle object and call its method
        Triangle triangle = new Triangle();
        triangle.area(10, 5);

        // Create an EquilateralTriangle object and call its method
        EquilateralTriangle eqTriangle = new EquilateralTriangle(6);
        eqTriangle.area();  // Calculates and displays the area of the equilateral triangle
    }
}
