package study20221007;

public class Tire {
    public int maxRotations; // 최대 회전수
    public int accumulatedRotations; // 누적 회전수
    public String location; //타이어 위치

    public Tire(String location, int maxRotations) {
        this.location = location;
        this.maxRotations = maxRotations;
    }

    public boolean roll() { //roll 실행
        ++accumulatedRotations; // 누적실행 추가
        if (accumulatedRotations < maxRotations) {
            System.out.println(location + " Tier 수명 : " + (maxRotations - accumulatedRotations) + " 회");
            return true;
        } else {
            System.out.println(" *** " + location + " study20221007.Tire 평크 ** ");
            return false;
        }
    }
}

