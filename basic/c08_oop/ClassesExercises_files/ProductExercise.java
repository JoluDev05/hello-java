package basic.c08_oop.ClassesExercises_files;

public class ProductExercise {
    private String name;
    private double price;

    public ProductExercise(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double percentage) {
        double discountAmount = price * (percentage / 100);
        price -= discountAmount;
        System.out.println("Precio con descuento del " + percentage + "%: " + price);
    }
    
}
