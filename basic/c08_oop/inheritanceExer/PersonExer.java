package basic.c08_oop.inheritanceExer;

public class PersonExer {
    
    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void introduce() {
            System.out.println("Hello, mi nombre es " + name + " y mi edad es de " + age + " ");
        }
    }

    public static class Student extends Person {
        private double grade;

        public Student(String name, int age, double grade) {
            super(name, age);
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        public void study() {
            System.out.println(getName() + " durisimo elmano");
        }

        public void displayInfo() {
            introduce();
            System.out.println("Grade: " + grade);
        }
    }
}
