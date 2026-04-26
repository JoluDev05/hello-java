package basic.c08_oop.inheritanceExer;

public class AnimalExer {
    
    public static class Animal {
        private String name;
        
        public Animal(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
        
        public void makeSound() {
            System.out.println("Some generic animal sound");
        }
    }
    
    public static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }
        
        @Override
        public void makeSound() {
            System.out.println(getName() + " says: Woof!");
        }
    }
    
    public static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }
        
        @Override
        public void makeSound() {
            System.out.println(getName() + " says: Meow!");
        }
    }
}
