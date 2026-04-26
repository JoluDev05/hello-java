package basic.c08_oop.inheritanceExer;

public class EmployeeExer {
    
    public static class Employee {
        private String name;
        private double salary;
        
        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
        
        public String getName() {
            return name;
        }
        
        public double getSalary() {
            return salary;
        }
        
        public void displayInfo() {
            System.out.println("Employee: " + name + ", Salary: $" + salary);
        }
    }
    
    public static class Manager extends Employee {
        private String department;
        
        public Manager(String name, double salary, String department) {
            super(name, salary);
            this.department = department;
        }
        
        public String getDepartment() {
            return department;
        }
        
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Department: " + department);
        }
    }
}
