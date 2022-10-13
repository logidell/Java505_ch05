package study20221012;

public class Car5 {
    Tirei[] tires = new Tirei[4];

    //    study20221012.Tirei[]tires={
////            new study20221012.HankookTire2(),new study20221012.HankookTire2(),new study20221012.HankookTire2(),new study20221012.HankookTire2()
    public Car5() {
        for (int i = 0; i < tires.length; i++) {
            tires[i] = new HankookTire2();
        }
    }

    void run() {
        for (Tirei item : tires) {
            item.roll();
        }
    }

}

