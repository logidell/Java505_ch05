package study20221007;

import study20221007.Animal;

public class Cat extends Animal {
    public Cat() {
        this.kind="포유류";
    }

    @Override
    public void sound() {
        System.out.println("냐옹");
    }
}
