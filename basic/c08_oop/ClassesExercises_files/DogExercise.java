package basic.c08_oop.ClassesExercises_files;

public class DogExercise {
    private String name;
    private String bark;
    public DogExercise(String name, String bark) {
        this.name = name;
        this.bark = bark;
    }
    public String getName() {
       return name;
    }
    public String getBark() {
        return bark;
    }
}
