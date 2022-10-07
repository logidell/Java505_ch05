public class Car2Ex {
    public static void main(String[] args) {
        Car2 car = new Car2();
        for (int i = 1; i <= 5; i++) {
            int problemLocation = car.run();
            switch (problemLocation) {
                case 1:
                    System.out.println("앞 왼쪽 한국 타이어로 교체 ");
                    car.frontLeftTier = new HankookTire("한국 타이어 앞 왼쪽", 15);
                    break;
                case 2:
                    System.out.println("앞 오른쪽 금호 타이어로 교체 ");
                    car.frontRightTier = new KumhoTier("금호 타이어 앞 오른쪽", 13);
                    break;
                case 3:
                    System.out.println("뒤 왼쪽 한국 타이어로 교체");
                    car.backLeftTier = new HankookTire("한국 타이어 뒤 왼쪽", 14);
                    break;
                case 4:
                    System.out.println("뒤 오른쪽 금호 타이어로 교체");
                    car.backRightTier = new KumhoTier("금호 타이어 뒤 오른쪽", 17);
                    break;
            }
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        }
        Car3 car3 = new Car3();
        for (int i = 1; i <= 5; i++) {
            int problemLocation = car3.run();

            if (problemLocation != 0) {
                System.out.println(car3.tires[problemLocation - 1].location + "한국타이어로 교체");
                car3.tires[problemLocation - 1] =
                        new HankookTire((car3.tires[problemLocation - 1].location), 15);
            }
            System.out.println("-----------------------");
        }
    }
}
//[problemLocation - 1]이 들어가는 이유는 problemLocation의 i의 횟수가 1부터 시작하고, if의 조건은 !=0이기때문에