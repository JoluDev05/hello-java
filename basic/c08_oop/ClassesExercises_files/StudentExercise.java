package basic.c08_oop.ClassesExercises_files;

public class StudentExercise {
    private String name;
    private int score;

    public StudentExercise(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public boolean isPassed() {
        return score >= 60;
    }
    
}
