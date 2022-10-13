package study20221007;

public class HankookTire extends Tire { //타이어 상속받음
    public HankookTire(String location, int maxRotations) { //위치를 받아오고 , 최대 회전수 받아옴
        super(location, maxRotations); //super 에게 던저줌 -> 타이어 생성자에 던짐
    }

    @Override // 오버라이드됨
    public boolean roll() {
        ++accumulatedRotations;
        if (accumulatedRotations > maxRotations) {
            System.out.println(location + " 타이어 수명 : " + (maxRotations - accumulatedRotations) + "회");
            return true;

        } else {
            System.out.println("***" + location + " 타이어 펑크***");
            return false;
        }
    }
}
