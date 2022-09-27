public abstract class Airplane {
    public void land() {
        System.out.println("착륙");
    }

    public void fly() {
        System.out.println("일반비행");
    }

    public void takeoff() {
        System.out.println("차단");
    }

    public abstract void flymode();
}
