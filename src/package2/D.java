package package2;

import package1.A;

public class D extends A {
    public D(){
//    A 클래스를 상속하여  사용함
//    부모 클래스  A의 생성자 호출
        super();
//        부모 클래스 A가 상속해준 멤버 변수를 사용 , 오류 안남
        this.value = "value";
//        부모 클래스 A가 상속해준 멤버 메서드를 사용
        this.method();
    } // 상속 받아 그 안에서 사용되면 사용이 가능함.



//    다른 패키지이기 때문에 난 오류 .
//    public void method2(){
////        A 클래스를 사용하고 있는 관계로 동작함
//        A a = new A();
//        a.value = "value";
//        a.method();
//
//    }
}