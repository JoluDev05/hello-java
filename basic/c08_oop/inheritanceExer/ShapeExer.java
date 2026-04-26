package basic.c08_oop.inheritanceExer;

public class ShapeExer {
    
    public static abstract class Shape {
        public abstract double calculateArea();
    }
    
    public static class Circle extends Shape {
        private double radius;
        
        public Circle(double radius) {
            this.radius = radius;
        }
        
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
        
        public void displayArea() {
            System.out.println("Circle Area: " + String.format("%.2f", calculateArea()));
        }
    }
    
    public static class Rectangle extends Shape {
        private double width;
        private double height;
        
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        
        @Override
        public double calculateArea() {
            return width * height;
        }
        
        public void displayArea() {
            System.out.println("Rectangle Area: " + String.format("%.2f", calculateArea()));
        }
    }
}
