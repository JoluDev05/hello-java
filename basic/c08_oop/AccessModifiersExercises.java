package basic.c08_oop;

import basic.c08_oop.AccessModExer.BankAccountExer;
import basic.c08_oop.AccessModExer.BookExer;
import basic.c08_oop.AccessModExer.CarExer;
import basic.c08_oop.AccessModExer.EmployeeExer;
import basic.c08_oop.AccessModExer.PersonExer;
import basic.c08_oop.AccessModExer.ProductExer;
import basic.c08_oop.AccessModExer.RectangleExer;
import basic.c08_oop.AccessModExer.TemperatureExer;
import basic.c08_oop.AccessModExer.UserExer;
import basic.c08_oop.AccessModExer.StudentExer;

/*
Clase 60 - Ejercicios: Modificadores de acceso
Vídeo: https://youtu.be/JOAqpdM36wI?t=23202
*/

public class AccessModifiersExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        System.out.println("Ejercicio 1:");
        PersonExer person = new PersonExer("Jorge", 22);
        System.out.println("Nombre: " + person.getName() + ", Edad: " + person.getAge());
        person.setName("Jorge Luis");
        person.setAge(23);
        System.out.println("Nombre actualizado: " + person.getName() + ", Edad actualizada: " + person.getAge());
        System.out.println("***********************************");


        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        System.out.println("Ejercicio 2:");
        ProductExer product = new ProductExer("Macbook air m5", 999.99);
        System.out.println("Producto: " + product.getName() + ", Precio: " + product.getPrice());
        product.setPrice(899.99);
        System.out.println("Precio con descuento: " + product.getPrice());
        System.out.println("***********************************");


        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        System.out.println("Ejercicio 3:");
        BankAccountExer account = new BankAccountExer("123456789", 1000);
        System.out.println("Número de cuenta: " + account.getAccountNumber() + ", Saldo: " + account.getBalance());
        account.deposit(500); // monto del depósito
        System.out.println("Saldo después del depósito: " + account.getBalance());
        account.withdraw(200); // monto del retiro
        System.out.println("Saldo después del retiro: " + account.getBalance());
        System.out.println("***********************************");


        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        System.out.println("Ejercicio 4:");
        BookExer book = new BookExer("Childrens of dune", "Frank Herbert");
        System.out.println("Título: " + book.getTitle() + ", Autor: " + book.getAuthor());
        System.out.println("***********************************");

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        System.out.println("Ejercicio 5:");
        TemperatureExer temp = new TemperatureExer();
        temp.setCelsius(25);
        System.out.println("Temperatura en Celsius: " + temp.getCelsius());
        System.out.println("***********************************");

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        System.out.println("Ejercicio 6:");
        UserExer user = new UserExer();
        user.setUsername("jorge123");
        user.setPassword("securePassword");
        System.out.println("Username: "  + user.getUsername());
        System.out.println("Password: "  + user.getPassword());
        System.out.println("¿Contraseña correcta? " + user.checkPassword("wrongPassword"));
        System.out.println("¿Contraseña correcta? " + user.checkPassword("securePassword"));
        System.out.println("***********************************");


        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        System.out.println("Ejercicio 7:");
        EmployeeExer employee = new EmployeeExer();
        System.out.println("Salario inicial: " + employee.getSalary());
        employee.raiseSalary(10); // aumento del 10%
        System.out.println("Salario después del aumento: " + employee.getSalary());

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        System.out.println("Ejercicio 8:");
        RectangleExer rectangle = new RectangleExer();
        rectangle.setWidth(5);
        rectangle.setHeight(3);
        System.out.println("Área del rectángulo: " + rectangle.calculateArea());
        System.out.println("***********************************");

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        System.out.println("Ejercicio 9:");
        StudentExer student = new StudentExer();
        student.setGrade(85);
        System.out.println("Nota: " + student.getGrade());
        System.out.println("¿Aprobado? " + student.isPassed());
        System.out.println("***********************************");

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        System.out.println("Ejercicio 10:");
        CarExer car = new CarExer();
        car.accelerate(50);
        System.out.println("Velocidad después de acelerar: " + car.getSpeed() + " km/h");
        car.accelerate(80); // intenta acelerar más allá del límite
        System.out.println("Velocidad después de intentar acelerar más: " + car.getSpeed() + " km/h");
        car.brake(30);
        System.out.println("Velocidad después de frenar: " + car.getSpeed() + " km/h");
        car.brake(100); // intenta frenar más allá del límite
        System.out.println("Velocidad después de intentar frenar más: " + car.getSpeed() + " km/h");
        System.out.println("***********************************");
    }
}
