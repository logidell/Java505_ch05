package study20221007;

public class Car2 {
    Tire frontLeftTier = new Tire("앞왼쪽", 6);
    Tire frontRightTier = new Tire("앞오른쪽", 2);
    Tire backLeftTier = new Tire("뒤왼쪽", 3);
    Tire backRightTier = new Tire("뒤오른쪽", 4);



    int run() {
        System.out.println("[자동차가 달립니다.]");
        if (frontLeftTier.roll() == false) {
            stop();
            return 1;
        }
        if (frontRightTier.roll() == false) {
            stop();
            return 2;
        }
        if (backLeftTier.roll() == false) {
            stop();
            return 3;
        }
        if (backRightTier.roll() == false) {
            stop();
            return 4;
        }
        return 0;

    }

    private void stop() {
        System.out.println("[운행을 멈췄습니다.]");
    }
}
