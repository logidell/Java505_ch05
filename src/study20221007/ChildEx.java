package study20221007;

public class ChildEx {
    public static void main(String[] args) {
//
//        study20221007.Child child = new study20221007.Child();
//        study20221007.Parent parent = new study20221007.Parent();
//


        Parent parent = new Parent();
        parent.method1();
        parent.method2();

        System.out.println("==========================");
        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();
        System.out.println("==========================");
        parent = child; // -> 껍데기는 부모이나 알맹이는 아이다.
        parent.method1();
        parent.method2();
//        parent.method3();  -> 실행이 안되는 이유는 부모가 가지고 있는 스킬만 실행하기 때문에 자식이 가지고 있는
//        전용 스킬은 사용할 수 없다고 생각하자.
        // 부모 클래스 타입으 ㅣ변수에 자식 클래스 타입의 객체를 대입했을 경우 자동 형변환이 발생해 자식 클래스 타입의
        // 객체가 전용으로 가지고 있던 멤버를 활용할 수 없음.
        // 부모 클래스 멤버만 사용할 수 있다. 마비노기 그 대입되서 사용되는 스킬같다. 그 메인스트림 깰 때 다른 캐릭터
        //역활을 맡아서 스토리를 진행하는데 내 스킬은 못쓰고 그 캐릭터가 가지고 있는 캐릭터 스킬과 스킬 랭크가지고
        //스토리 깨는거.

        //다형성 : 부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입해 부모 클래스 타입의 객체인 것
        //처럼 사용하는 것, 실 내용물(결과물)은 자식클래스 타입의 객체가 가지고 있는 데이터로 출력이 된다.
        // -> 코드가 위에서 아래로 내려가듯 상속도 부모에서 자식으로 이어진다. 그 결과물은 자식클래스의 데이터로
        //출력이 되는 것.
    }
}
