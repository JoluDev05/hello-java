package basic.c08_oop.ClassesExercises_files;

public class RectangleExercise {
    private double width;
    private double height;

    public RectangleExercise(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
