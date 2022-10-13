package study20221012;

public class Car4Ex {
    public static void main(String[] args) {
        Car4 myCar = new Car4();

        myCar.run();
        myCar.frontLefTirei = new KumhoTire2();
        myCar.frontRightTirei = new KumhoTire2();
        myCar.run();
        System.out.println("==============================");

        Car5 car5 = new Car5();
        car5.run();

        car5.tires[2] = new KumhoTire2();
        car5.tires[3] = new KumhoTire2();
        car5.run();

    }
}
