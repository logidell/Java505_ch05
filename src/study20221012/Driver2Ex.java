package study20221012;

public class Driver2Ex {
    public static void main(String[] args) {
        System.out.println(" = 각각 객체를 생성해 실행 = ");
        Bus2 bus2 = new Bus2();
        Taxi2 taxi2 = new Taxi2();

        bus2.run();
        taxi2.run();

//        study20221012.Vehicle2 vehicle2 = new study20221012.Vehicle2(); // 이건 안된다. 이 vehicle2가 클래스 타입이기 때문에.

        System.out.println("익명 객체 통한 구현 \t");
        Vehicle2 vehicle2 = new Vehicle2() { // 이건 가능;
            @Override
            public void run() {
                System.out.println("탈 것이 달린다. ");
            }

        }; //이럴 때 쓸 땐 세미콜론 잊지 마시길
        vehicle2.run();
        System.out.println("부모 인터페이스 타입의 변수에 자식 객체를 대입.");

        vehicle2 = bus2;
        vehicle2.run();
        vehicle2 = taxi2;
        vehicle2.run();

        System.out.println("====인터페이스 변수를 매개변수로 사용 시 ");
        Driver2 driver2 = new Driver2();
        driver2.drive(bus2);
        driver2.drive(taxi2); // 위에 사용한 것과 여기서 사용한 것 똑같이 출력이 된다. 부모 타입으로 자식객체 사용하는 것 = 다형성

        //클래스 사용한 다형성, 인터페이스 사용한 다형성  사용방법만 조금 다를 뿐 같은원리.

        System.out.println("===== 자동 타입 변환, 강제 타입 변환, instanceof");


        System.out.println("== 자동타입변환");
        Vehicle2 vehicle21 = new Bus2(); // 자동 타입 변환, 부모인 study20221012.Vehicle2 인터페이스 타입 변수에 자식인 study20221012.Bus2 클래스 타입 객체를 대입
        vehicle21.run();

//        study20221012.Bus2 bus21 = vehicle21;// 데이터 타입이 다르기 때문에 강제 타입 변환을 시도해야 한다.
        Bus2 bus21 = (Bus2) vehicle21; // 강제타입 변환의 조건이 원본이 자식클래스 타입의 객체일 때 해당 클래스 타입으로 변환했을 시 가능
        // 원본 클래스 객체 타입이 맞는지 확인을 하기 위해 instanceof 연산자를 사용해야 한다.
        bus21.run();

        Vehicle2 vehicle22 = new Bus2();
        vehicle22.run();

        if (vehicle22 instanceof Taxi2) {
            Taxi2 taxi22 = (Taxi2) vehicle22;
            taxi22.run();
            System.out.println("정상적으로 study20221012.Taxi2 클래스 타입으로 변경완료");

        } else {
            System.out.println("study20221012.Taxi2 클래스 타입으로 변경 불가 ");
        }


    }
}
