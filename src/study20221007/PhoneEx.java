package study20221007;

public class PhoneEx {
    public static void main(String[] args) {
    SmartPhone smartPhone = new SmartPhone("길동");
    smartPhone.turnOn();
    smartPhone.internatSearch();
    smartPhone.turnOff();

//    study20221007.Phone phone = new study20221007.Phone("길동"); //phone 클래스는 추상 클래스임. new 키워드 통해 객체 생성이 불가능. 그래서 오류남.
        Phone phone; // 변수는 생성할 수 있지만 new 키워드를 사용할 수 없다.



    }
}
