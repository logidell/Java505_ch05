package package1;

import package1.A;

public class B {
//    동일 패키지 내에서는 public, protected, default나 거의 같다.
    public void method() {
        A a = new A();
        a.value = "value";
        a.method();

    }
}
