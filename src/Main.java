import package1.B;

public class Main {
    public static void main(String[] args) {
//        객체지향 프로그램
//        자식 클래스(하위, 파생)가 부모(상위) 클래스 멤버를 물려받는것
//        자식이 부모를 선택해 물려받음.
//        - 상속 대상 : 부모의 필드, 메소드
//        상속의 효과
//        부모 클래스 재사용해 자식 클래스 빨리 개발 가능
//        반복된 코드 중복 줄임
//        유지 보수 편리성 제공 - > 문제 발생시 부모 클래스의 문제를 고치면 자식 클래스도 같이 고쳐지니 편리
//        객체 다형성 구현 가능

//         -c++ 이후 나온 언어는 대부분 단일 상속.
//        다중상속의 문제점은 코드가 꼬일 수 있다는 점.
//
//        헷갈릴 때는 매크로에 뜨는 글자를 잘 보자. 굵은 것은 원래 본인 것, 얇은 것은 상속 받은 것
//
//        1. 클래스 sumsub, multidiv 생성후 sumsub에는 멤버 변수 num1,2 멤버 메서드 sum()sub()
//        가지도록, multidiv에는 멤버 변수 result, 멤버 메서드 multi(),div()가지도록 하고 다음으로
//        calcultor 클래스 생성해 두 클래스를 모두 상속받아 모든 기능을 사용할 수 있는 클래스로 작성하고
//        각각 사칙연산을 수행하라.
//            - sumsub > multidiv> calcultor 순으로 상속받기.
//            - calcultor 클래스는 나머지 연산을 위한 멤버 메서드 othor() 를 가지고 있다.

        System.out.println("==========================");
        Point point = new Point();
        point.set(1, 2);
        point.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3, 4);
        cp.setColor("red");
        cp.showColorPoint();


        System.out.println("==========================");
        Calculator cal = new Calculator();
        cal.num1 = 10;
        cal.num2 = 3;

        cal.result = cal.sum();
        System.out.println(" 두 수의 덧셈 " + cal.result);
        cal.result = cal.sub();
        System.out.println(" 두 수의 뺄셈 " + cal.result);
        cal.result = cal.multi();
        System.out.println(" 두 수의 곱셈 " + cal.result);
        cal.result = cal.div();
        System.out.println(" 두 수의 나눗셈 " + cal.result);

        System.out.println("==========================================");
//        super. / super() 부모 생성자 호출

        DmbCellPhone dmbcp = new DmbCellPhone("javaPhone", "black", 10);
        System.out.println("model : " + dmbcp.model);
        System.out.println("color : " + dmbcp.color);
        System.out.println("channel : " + dmbcp.channel);

        dmbcp.powerOn();
        dmbcp.bell();
        dmbcp.sendVoice("hello?");
        dmbcp.recodeVoice("hello! rig-gi-ding-ding");
        dmbcp.sendVoice("ㅇㅇ");
        dmbcp.hangup();


        dmbcp.turnOnDmb();
        dmbcp.changeChannelDmb(12);
        dmbcp.turnOffDmb();


//        Student std = new Student("홍길동", "123456-123455", 1);

        int r = 10;
        Calculator1 calculator1 = new Calculator1();
        System.out.println("원 면적 : " + calculator1.areaCircle(r));
        System.out.println(calculator1.sum());
        System.out.println(calculator1.sub());
        System.out.println();

        Computer com = new Computer();
        System.out.println("원 면적 : "+com.areaCircle(r));
        System.out.println(com.sum());
        System.out.println(com.sub());

        B b = new B();
        b.method();


    }

}
