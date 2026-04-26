package basic.c08_oop;

import basic.c08_oop.inheritanceExer.PersonExer;
import basic.c08_oop.inheritanceExer.VehicleExer;
import basic.c08_oop.inheritanceExer.AnimalExer;
import basic.c08_oop.inheritanceExer.EmployeeExer;
import basic.c08_oop.inheritanceExer.ShapeExer;
import basic.c08_oop.inheritanceExer.BirdExer;
import basic.c08_oop.inheritanceExer.DeviceExer;
import basic.c08_oop.inheritanceExer.AccountExer;

/*
Clase 62 - Ejercicios: Herencia
Vídeo: https://youtu.be/JOAqpdM36wI?t=24373
*/

public class InheritanceExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        System.out.println("Ejercicio 1:");
        VehicleExer.Vehicle vehicle = new VehicleExer.Vehicle("Tesla", "Model 3", 2024);
        vehicle.move();
        
        VehicleExer.Car car = new VehicleExer.Car("Toyota", "Corolla", 2023, 4);
        car.move();
        car.honk();
        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
        System.out.println("Ejercicio 2:");
        PersonExer.Person person = new PersonExer.Person("Jorge", 22);
        person.introduce();
        PersonExer.Student student = new PersonExer.Student("Luis", 22, 8.5);
        student.displayInfo();
        student.study();

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga "Woof" y Cat diga "Meow" sobrescribiendo ese método.
        System.out.println("\nEjercicio 3:");
        AnimalExer.Dog dog = new AnimalExer.Dog("Max");
        dog.makeSound();
        AnimalExer.Cat cat = new AnimalExer.Cat("Whiskers");
        cat.makeSound();
        
        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        System.out.println("\nEjercicio 4:");
        EmployeeExer.Employee employee = new EmployeeExer.Employee("John", 3000);
        employee.displayInfo();
        EmployeeExer.Manager manager = new EmployeeExer.Manager("Sarah", 5000, "IT");
        manager.displayInfo();

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
        System.out.println("\nEjercicio 5:");
        ShapeExer.Circle circle = new ShapeExer.Circle(5);
        circle.displayArea();
        ShapeExer.Rectangle rectangle = new ShapeExer.Rectangle(4, 6);
        rectangle.displayArea();

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        System.out.println("\nEjercicio 6:");
        BirdExer.Bird bird = new BirdExer.Bird("Sparrow");
        bird.fly();
        BirdExer.Eagle eagle = new BirdExer.Eagle("Bald Eagle");
        eagle.fly();

        // 7. Haz una clase Device con un constructor que imprima "Device created". Luego crea Phone que herede de Device y en su constructor imprima "Phone ready".
        System.out.println("\nEjercicio 7:");
        DeviceExer.Device device = new DeviceExer.Device();
        DeviceExer.Phone phone = new DeviceExer.Phone();

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
        System.out.println("\nEjercicio 8:");
        AccountExer.Account account = new AccountExer.Account(1000);
        account.deposit(500);
        account.withdraw(200);
        AccountExer.SavingsAccount savingsAccount = new AccountExer.SavingsAccount(2000, 2.5);
        savingsAccount.withdraw(300);
        savingsAccount.addInterest();

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
        System.out.println("\nEjercicio 9:");
        VehicleExer.Car car2 = new VehicleExer.Car("Honda", "Civic", 2023, 4);
        car2.describe();
        VehicleExer.Bike bike = new VehicleExer.Bike("Trek", "FX 3", 2024, "Mountain Bike");
        bike.describe();
        VehicleExer.Truck truck = new VehicleExer.Truck("Volvo", "FH16", 2022, 25);
        truck.describe();

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        System.out.println("\nEjercicio 10:");
        java.util.ArrayList<AnimalExer.Animal> animals = new java.util.ArrayList<>();
        animals.add(new AnimalExer.Dog("Rex"));
        animals.add(new AnimalExer.Cat("Mittens"));
        animals.add(new AnimalExer.Dog("Buddy"));
        animals.add(new AnimalExer.Cat("Fluffy"));
        
        for (AnimalExer.Animal a : animals) {
            a.makeSound();
        }
    }
}
