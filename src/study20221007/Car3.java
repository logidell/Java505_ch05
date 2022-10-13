package study20221007;

public class Car3 {
    //    study20221007.Tire frontLeftTier = new study20221007.Tire("앞왼쪽", 6);
//    study20221007.Tire frontRightTier = new study20221007.Tire("앞오른쪽", 2);
//    study20221007.Tire backLeftTier = new study20221007.Tire("뒤왼쪽", 3);
//    study20221007.Tire backRightTier = new study20221007.Tire("뒤오른쪽", 4);
    Tire[] tires = {
            new Tire("앞왼쪽", 6),
            new Tire("앞오른쪽", 2),
            new Tire("뒤왼쪽", 3),
            new Tire("뒤오른쪽", 4)
    };

    int run() {
        System.out.println("[자동차가 달립니다. ]");
        for (int i = 0; i < tires.length; i++) {
            if (tires[i].roll() == false) {
                stop();
                return (i + 1);
            }
        }
        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈췄습니다. ]");
    }
}