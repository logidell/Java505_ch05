package study20221007;

public class Car {
    public int speed;

    public void speedUp() {
        speed+=1;
    }
    public final void stop() {
        System.out.println("stop car!");
        speed = 0;

    }
}
