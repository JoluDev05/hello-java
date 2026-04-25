package basic.c08_oop.AccessModExer;

public class TemperatureExer {
    private double celsius;

    public void setCelsius(double celsius) {
        if (celsius >= -100 && celsius <= 100) {
            this.celsius = celsius;
        } else {
            System.out.println("Valor no válido. La temperatura debe estar entre -100 y 100 grados Celsius.");
        }
    }

    public double getCelsius() {
        return celsius;
    }
    
}
