package basic.c08_oop.inheritanceExer;

public class VehicleExer {
    
    public static class Vehicle {
        private String brand;
        private String model;
        private int year;

        public Vehicle(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public void move() {
            System.out.println("El vehículo se está moviendo.");
        }
    }
    
    public static class Car extends Vehicle {
        private int numberOfDoors;

        public Car(String brand, String model, int year, int numberOfDoors) {
            super(brand, model, year);
            this.numberOfDoors = numberOfDoors;
        }

        public int getNumberOfDoors() {
            return numberOfDoors;
        }

        @Override
        public void move() {
            System.out.println("El carro se esta moviendo en camino ");
        }

        public void honk() {
            System.out.println("pip pip");
        }

        public void describe() {
            System.out.println("Car: " + getBrand() + " " + getModel() + " (" + getYear() + ") - " + getNumberOfDoors() + " doors");
        }
    }
    
    public static class Bike extends Vehicle {
        private String bikeType;

        public Bike(String brand, String model, int year, String bikeType) {
            super(brand, model, year);
            this.bikeType = bikeType;
        }

        public String getBikeType() {
            return bikeType;
        }

        @Override
        public void move() {
            System.out.println("La bicicleta se está moviendo.");
        }

        public void describe() {
            System.out.println("Bike: " + getBrand() + " " + getModel() + " (" + getYear() + ") - " + bikeType);
        }
    }
    
    public static class Truck extends Vehicle {
        private double cargoCapacity;

        public Truck(String brand, String model, int year, double cargoCapacity) {
            super(brand, model, year);
            this.cargoCapacity = cargoCapacity;
        }

        public double getCargoCapacity() {
            return cargoCapacity;
        }

        @Override
        public void move() {
            System.out.println("El camión se está moviendo lentamente.");
        }

        public void describe() {
            System.out.println("Truck: " + getBrand() + " " + getModel() + " (" + getYear() + ") - Cargo capacity: " + cargoCapacity + " tons");
        }
    }
}
