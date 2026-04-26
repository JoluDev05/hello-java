package basic.c08_oop.inheritanceExer;

public class BirdExer {
    
    public static class Bird {
        private String name;
        
        public Bird(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
        
        public void fly() {
            System.out.println(name + " is flying gracefully.");
        }
    }
    
    public static class Eagle extends Bird {
        public Eagle(String name) {
            super(name);
        }
        
        @Override
        public void fly() {
            super.fly();
            System.out.println(getName() + " is soaring high in the sky with powerful wings!");
        }
    }
}
