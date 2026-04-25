package basic.c08_oop;

public class CarExercise {
    private String brand;
    private String model;

    public CarExercise(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void showData() {
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
    }
}
