public interface MyInterface {
    void method1();

    //헤당 인터페이스를 구현하는 구현체가 여라개 존재할 경우 구현체 수정 없기 기능을 추가해주고자 하는 경우 사용하는 것이 디폴트 
    default void method2(){
        System.out.println("dMyInterface의 method1 ");
    }

}
