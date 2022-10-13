package study20221012;

public interface RemoteControl {
//    인터페이스의 멤버는 상수, 정적 멤버 메서드, 추상 메서드, 디폴트 메서드만 사용이 가능하다.
//    인터페이스에서 사용할 수 있는 멤버는 일반 멤버 변수와 메서드는 불가능하기 때문에 static 및 abstract 생략 가능

//    인터페이스는 객체 사용 설명서이기 때문에 상수, 정적 멤버 메서드, 추상 메서드, 디폴트 메서드만 사용 가능
//    정적 메서드 및 디폴트 메서드는 자바 버전 8부터 사용이 가능해졌다.
    public final static int MAX_VALUE = 10;
    public int MIN_VALUE = 0;

//    추상 메서드 생략
    void turnOn(); // 몸체 없으니 추상메소드.
    void turnOff();
    void setVolume(int volume);

//    디폴트 메서드
    default  void setMute(boolean mute){
        if (mute){
            System.out.println("Mute");
        }else {
            System.out.println("Mute 해제");
        }
    }
//    정적 메소드
    static void changeBattery(){
        System.out.println("changeBattery");
    }
}

// 추상클래스 - extends / 인터페이스 - implements 키워드 사용
