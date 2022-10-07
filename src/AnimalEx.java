
public class AnimalEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.breathe();
        dog.sound();

        cat.breathe();
        cat.sound();
        System.out.println("================================");
//      추상 클래스 타입의 변수를 선언하는 것은 문제가 없다. 객체가 만들어지지 않을 뿐
//        Animal animal;
//        animal = new Animal();  -> 오류남. 상속받아서만 사용가능
//  클래스의 형변환이 들어감.
        Animal animal;
        animal = new Dog();
        animal.sound();
        animal= new Cat();
        animal.sound();

        animalSound(new Dog());
    }

    public static void animalSound(Animal animal) {

        animal.sound();
    }
}
