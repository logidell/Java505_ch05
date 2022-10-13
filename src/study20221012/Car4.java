package study20221012;

public class Car4 {
    Tirei frontLefTirei = new HankookTire2();
    Tirei frontRightTirei = new HankookTire2();
    Tirei backLefTirei = new HankookTire2();
    Tirei backLRightTirei = new HankookTire2();

    void run() {
        frontLefTirei.roll();
        frontRightTirei.roll();
        backLefTirei.roll();
        backLRightTirei.roll();

    }

}
