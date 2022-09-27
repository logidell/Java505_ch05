public class SportsCar extends Car {
    public final String sound = "Pip-pi!";


    @Override
    public void speedUp() {
        speed += 10;
//        sound = "burung"; - 멤버 변수에 final이 사용되었기 때문에 오버라이드 할 수 없음.
    }


    //부모 클래스의 멤버 메서드인 stop이 final이 사용되었기 때문에 오버라이드 할 수 없음.
//    @Override
//    public void stop() {
//        System.out.println("stop car!");
//        speed = 0;
//    }
}


