package basic.c08_oop;

import basic.c08_oop.ClassesExercises_files.*;

/*
Clase 58 - Ejercicios: Clases y objetos
Vídeo: https://youtu.be/JOAqpdM36wI?t=21434
*/

public class ClassesExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        System.out.println("Ejercicio 1:");
        Book book = new Book("Dune", "Frank Herbert");
        System.out.println("Título: " + book.getTitle());
        System.out.println("Autor: " + book.getAuthor());
        System.out.println("***********************************");

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        DogExercise dog = new DogExercise("Gala", "Woof!");
        System.out.println("Ejercicio 2:");
        System.out.println("Nombre: " + dog.getName());
        System.out.println("Sonido: " + dog.getBark());
        System.out.println("***********************************");


        // 3. Añade un constructor a la clase Book que reciba title y author.
        System.out.println("Ejercicio 3:");
        Book book2 = new Book("Dune messiah", "Frank Herbert");
        System.out.println("Título: " + book2.getTitle());
        System.out.println("Autor: " + book2.getAuthor());
        System.out.println("***********************************");

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        System.out.println("Ejercicio 4:");
        CarExercise car = new CarExercise("Nissan", "Frontier");
        car.showData();
        System.out.println("***********************************");
        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        System.out.println("Ejercicio 5:");
        StudentExercise student = new StudentExercise("Jorge", 90);
        System.out.println("Nombre: " + student.getName());
        System.out.println("Calificacion " + student.getScore());
        System.out.println("Aprobo? " + student.isPassed());
        System.out.println("***********************************");
        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        System.out.println("Ejercicio 6:");
        BankAccountExercise account = new BankAccountExercise("123456789", 1000);
        System.out.println("Número de cuenta: " + account.getAccountNumber());
        System.out.println("Saldo inicial: " + account.getBalance());
        account.deposit(500);
        System.out.println("Saldo después del depósito: " + account.getBalance());
        System.out.println("***********************************");
        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        System.out.println("Ejercicio 7:");
        RectangleExercise rectangle = new RectangleExercise(5, 3);
        System.out.println("Área: " + rectangle.calculateArea());
        System.out.println("Perímetro: " + rectangle.calculatePerimeter());
        System.out.println("***********************************");

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        System.out.println("Ejercicio 8:");
        WorkerExercise worker = new WorkerExercise("Jorge", 2000);
        worker.showSalary();
        System.out.println("***********************************");
        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        System.out.println("Ejercicio 9:");
        java.util.ArrayList<Person> people = new java.util.ArrayList<>();
        people.add(new Person("Brais", 38, "123456789A"));
        people.add(new Person("MoureDev", 18, "123456789B"));
        for (Person person : people) {
            person.sayHello();
        }
        System.out.println("***********************************");

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        System.out.println("Ejercicio 10:");
        ProductExercise product = new ProductExercise("Laptop", 1000);
        System.out.println("Producto: " + product.getName());
        System.out.println("Precio original: " + product.getPrice());
        product.applyDiscount(20);
        System.out.println("***********************************");
    }
}
