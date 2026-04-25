package basic.c08_oop.AccessModExer;

public class PersonExer {
    private String name;
    private int age;
    public PersonExer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
    public void setName(String name) {
        this.name = name;
    }
}
