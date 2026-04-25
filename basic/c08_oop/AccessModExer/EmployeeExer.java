package basic.c08_oop.AccessModExer;

public class EmployeeExer {
    private double salary;

    public EmployeeExer() {
        this.salary = 2500; // Salario inicial por defecto
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100);
        } else {
            System.out.println("El aumento debe ser positivo.");
        }
    }
    
}
