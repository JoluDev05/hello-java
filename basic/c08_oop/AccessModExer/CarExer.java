package basic.c08_oop.AccessModExer;

public class CarExer {
    private int speed;

    public void accelerate(int amount) {
        speed += amount;
        if (speed > 120) {
            speed = 120;
        }
    }

    public void brake(int amount) {
        speed -= amount;
        if (speed < 0) {
            speed = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }
}
