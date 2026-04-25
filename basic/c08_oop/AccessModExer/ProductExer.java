package basic.c08_oop.AccessModExer;

public class ProductExer {
    private String name;
    private double price;

    public ProductExer(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }
}
