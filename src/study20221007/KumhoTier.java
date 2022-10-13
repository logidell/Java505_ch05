package study20221007;

public class KumhoTier extends Tire {
    public KumhoTier(String location, int maxRotations) {
        super(location, maxRotations);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotations;
        if (accumulatedRotations > maxRotations) {
            System.out.println(location + " 금호 타이어 수명 : " + (maxRotations - accumulatedRotations) + "회");
            return true;

        } else {
            System.out.println("***" + location + " 금호 타이어 펑크 ***");
            return false;
        }
    }
}
