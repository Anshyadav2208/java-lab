/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Shape {
    public double area() {
        return 0.0; // Default implementation for area
    }
    
    public double perimeter() {
        return 0.0; // Default implementation for perimeter
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius; // Override area for circle
    }

    
    public double perimeter() {
        return 2 * Math.PI * radius; // Override perimeter for circle
    }
}


class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

  
    public double area() {
        return side * side; 
    }

  
    public double perimeter() {
        return 4 * side; 
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
    }
}