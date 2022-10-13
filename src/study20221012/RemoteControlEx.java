package study20221012;

public class RemoteControlEx {
    public static void main(String[] args) {
        //인터페이스 타입의 객체를 생성  불가능
        // 인터페이스 타입의 변수는 생성 가능
        //다형성에 의해 인터페이스 타입 변수의 자식 클래스 타입의 객체를 대입하는 것이 가능
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();

        rc.setVolume(3);
        rc.setVolume(15);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(3);
        rc.setMute(true);
        rc.setMute(false);
        rc.setVolume(-5);
        rc.turnOn();


        rc = new RemoteControl() {
            private int volume;

            @Override
            public void turnOn() {
                System.out.println("radio on");
            }

            @Override
            public void turnOff() {
                System.out.println("radio off");
            }

            @Override
            public void setVolume(int volume) {
                if (volume > RemoteControl.MAX_VALUE) {
                    this.volume = RemoteControl.MAX_VALUE;
                } else if (volume < RemoteControl.MIN_VALUE) {
                    this.volume = RemoteControl.MIN_VALUE;
                } else {
                    this.volume = volume;
                }
                System.out.println("");
            }
        };
        rc.turnOn();
        rc.setVolume(50);
        rc.setMute(true);
        rc.turnOff();
        RemoteControl.changeBattery();

        SmartTelevision stv= new SmartTelevision();
        stv.turnOn();
        stv.setVolume(50);
        stv.setMute(true);
        stv.setVolume(-50);
        stv.search("kakao.com");
        stv.turnOff();
    }


}
//추상 클래스 : 클래스라 단일상속만 가능 / 인터페이스 :  클래스가 아니기 때문에 다중상속이 가능
// 추상은 일반멤버 보유/ 인터페이스는 일반멤버 보유 불가능


