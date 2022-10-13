package study20221007;

import study20221007.Animal;

public class Dog extends Animal {
public Dog() {
    this.kind = "포유류";
}

    @Override
    public void sound() {
        System.out.println("멍");
    }
}
