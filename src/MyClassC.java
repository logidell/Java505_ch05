public class MyClassC implements MyInterface2{
    @Override
    public void method1() {
        System.out.println("mem1" );
    }@Override
    public void method2() { //인터페이스에서 디폴드 메서드로 상속해줬으나 interface2에 추상메섣 오버라이딩 한 메서드
        //myinterface를 구현하는 구현체는 반드시 해당 메서드 구현 필요
        System.out.println("mem2" );}
        @Override
public void method3() {

        System.out.println("03");
    }

}
