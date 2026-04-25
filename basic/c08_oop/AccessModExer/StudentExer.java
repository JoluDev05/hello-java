package basic.c08_oop.AccessModExer;

public class StudentExer {
    private int grade;


    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Nota inválida. Por favor, ingrese un valor entre 0 y 100.");
        }
    }
    public int getGrade() {
        return grade;
    }

    public boolean isPassed() {
        return grade >= 60;
    }

}
