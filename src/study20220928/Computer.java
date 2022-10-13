package study20220928;

public class Computer extends Calculator1 {

    @Override
    public double areaCircle(double r) {
        System.out.println("study20220928.Computer 객체의 areaCircle() 실행 ");
        System.out.println("수정된 내용");
        return Math.PI * r * r;
    }

    @Override
    int sum() {
        System.out.println("오버라이딩해 출력하기 : " + (20 + 10));
        return 20 + 10;
    }

    int sub() {
        System.out.println("오버라이딩해 출력하기 : " + (10 - 3));
        return 10 - 3;
    }

}