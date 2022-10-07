public abstract class Animal {
    public String kind;
    public void breathe(){
        System.out.println("Breathe");
    }
    public abstract void sound();

}
// 추상 클래스 : 추상 메서드를 1개 이상 가지고 있는 클래스 클래스 본인을 가지고 객체를 생성할 수 없다
// 추상 클래스는 자체적으로 객체를 생성할 수 없다. (new를 못쓴다는 얘기 )
// 추상 클래스는 자식 클래스를 규격화하기 위해 사용한다.
// 자식 클래스가 추상 클래스를 상속받았을 경우 추상 메서드를 오버라이딩 해야한다.
// 오보라이딩 하지 않을 경우 자식 클래스도 추상 클래스로 선언해야 한다.

