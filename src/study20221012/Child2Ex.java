package study20221012;

public class Child2Ex {
    public static void main(String[] args) {
        //자동 타입 변환 발생
        //부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입시 부모 클래스 타입의 멤버만 사용 가능
        //이 알맹쓰는 자식 클래스 타입의 객체
        Parent2 parent2 = new Child2();

        parent2.field1 = "data1";
        parent2.method1();
        parent2.method2();

//        parent2.field2 ="data2"; error 발생
//        parent2.method3(); = error 발생

        System.out.println("==========자식 클래스 타입 변수에 자식 클래스 객체 대입========");
        Child2 child2 = new Child2();
        child2.field1 = "data1";
        child2.field2 = "data2";
        child2.method1();
        child2.method2();
        child2.method3();
        //->instanceof  때문에 나오는 것이기 때문.
        System.out.println("===== 다시 자식타입 클래스로 돌아갈 경우 =====");

        Child2 child21 = new Child2();
        child21.field1 = "Parent2에서 상속받은 멤버 변수 ";
        child21.field2 = "Child2 전용으로 가지고 있는 멤버 변수 ";
        System.out.println("객체 child 21의 field1 출력 " + child21.field1);
        System.out.println("객체 child 21의 field2 출력 " + child21.field2);
        System.out.println("객체 child 21의 method1 실행");
        child21.method1();

        System.out.println("객체 child 21의 method1 실행");
        child21.method2();

        System.out.println("객체 child 21의 method1 실행");
        child21.method3();

        System.out.println("부모 객체로 자동 형변환");
        Parent2 parent21 = child21;
        System.out.println("객체 child 21의 field1 출력 " + parent21.field1);
//        System.out.println("객체 child 21의 field2 출력 " + parent21.field2);
        System.out.println("객체 parent 21의 method1 실행");
        parent21.method1();

        System.out.println("객체 parent 21의 method1 실행");
        parent21.method2();

//        System.out.println("객체 parent 21의 method1 실행");
//        parent23.method3();

        System.out.println("다시 자식 클래스 타입으로 변환");
        // 자식 클래스 타입의 변수에 부모 클래스 타입의 객체를 대입시 오류
        // 원본 객체를 자식 클래스 타입의 변수로 타입 변환시 해당 객체의 모든 멤버 가지고
        // 왔는지 알 수 없기 때문에 강데 타입 변환

        Child2 child22 = (Child2) parent21;
        System.out.println("객체 child22의 field1 출력 : " + child22.field1);
        System.out.println("객체 child22의 field2 출력 : " + child22.field2);
        System.out.println("객체 child22의 method1 실행 ");
        child22.method1();
        System.out.println("객체 child22의 method2 실행 ");
        child22.method2();
        System.out.println("객체 child22의 method3 실행 ");
        child22.method3();







        System.out.println("\n 다시 자식 클래스 타입으로 변환되는 조건 \n");
//        1. 원본이 자식 클래스 타입이어야 해당하는 자식 클래스 타입으로 변환이 가능

//        원본이 부모 클래스 타입
//        study20221012.Parent2 parent23 = new study20221012.Parent2();
//        study20221012.Child2 child23;
//        // 자식 클래스 타입의 변수에 부모 클래스 타입 객체 타입
//        // 문법 상의 오류는 없으나 원본이 자식 클래스의 타입의 객체가 아니니 로직 에러(런타임에러) 발생
//        child23 = (study20221012.Child2) parent23;
//        //자식 클래스 타입의 객체의 멤버 사용
//        child23.method3();

        Parent2 parent24 = new Child2();
        castMethod1(parent24);
        castMethod2(parent24);
        Parent2 parent25 = new Parent2();
        castMethod1(parent25);
        castMethod2(parent25);

    }

    public static void castMethod1(Parent2 parent) {
//        instanceof  연산자 사용시 한꺼번의 객체가 지정 타입인가, 객체인가 확인 가능
        if (parent instanceof Child2) { //강제 형변환시 instanceof 사용할 것
            Child2 child = (Child2) parent;
            System.out.println("castMethod1 - child로 변환 성공");
        } else {
            System.out.println("castMethod1 - child로 변환되지 않음");
        }

    }

    public static void castMethod2(Parent2 parent) {
        //원본객체가 변환하려는 클래스 타입의 객체가 이닐 수 있기에 오류 발생할 수 있따.
        Child2 child = (Child2) parent;
        System.out.println("castMethod2 - child2로 변환 성고 ");
    }


}

