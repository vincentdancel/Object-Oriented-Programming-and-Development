package hierarchy;

class Shape {

    private double area;
    private double perimeter;
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {

       return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void displayCircleInfo() {
        System.out.println("\nCircle:");
        System.out.println("Area:" + getArea());
        System.out.println("Perimeter:" + getPerimeter());
        System.out.println("Color:" + getColor());

    }
}

class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void displayRectangleInfo() {
        System.out.println("\nRectangle:");
        System.out.println("Area:" + getArea());
        System.out.println("Perimeter:" + getPerimeter());
        System.out.println("Color:" + getColor());

    }
}

class Triangle extends Shape {

    private double base;
    private double height;
    private double side1;
    private double side2;

    public Triangle(String color, double base, double height, double side1, double side2) {
        super(color);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getArea() {
        return (base * height) / 2;

    }

    public double getPerimeter() {
        return base + side1 + side2;
    }

    public void displayTriangleInfo() {
        System.out.println("\nTriangle:");
        System.out.println("Area:" + getArea());
        System.out.println("Perimeter:" + getPerimeter());
        System.out.println("Color:" + getColor());

    }
}

public class Hierarchy {

    public static void main(String[] args) {

        Circle circle = new Circle("Red", 10);
        Rectangle rectangle = new Rectangle("Blue", 5, 4);
        Triangle triangle = new Triangle("Green", 3, 4, 4, 5);

        circle.displayCircleInfo();
        rectangle.displayRectangleInfo();
        triangle.displayTriangleInfo();

    }

}
