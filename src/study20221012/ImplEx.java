package study20221012;

public class ImplEx {
    public static void main(String[] args) {
        System.out.println("구현체 implC의 객체 impl은 모든 메서드 사용이 가능 ");
        ImplC impl = new ImplC();
        impl.methodA();
        impl.methodB();
        impl.methodC();
        System.out.println("\n Interface A 의 변수에 대입 시 ");
        InterfaceA ifA = impl;
        ifA.methodA();

        System.out.println("\n Interface B 의 변수에 대입 시 ");
        InterfaceB ifB = impl;
        ifB.methodB();
        System.out.println("\n Interface C 의 변수에 대입 시 ");
        InterfaceC ifC = impl;
        ifC.methodC();
        ifC.methodA();
        ifC.methodB();
    }
}
