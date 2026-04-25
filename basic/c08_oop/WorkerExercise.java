package basic.c08_oop;

public class WorkerExercise {
    private String name;
    private double salary;
    public WorkerExercise(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public void showSalary() {
        System.out.println("El salario de " + name + " es: " + salary + " pesos.");
    }
}
