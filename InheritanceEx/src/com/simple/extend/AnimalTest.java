package com.simple.extend;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }


    public void eat() {
        System.out.println(name + "이(가) 먹이를 먹는다.");
    }

    public void sleep() {
        System.out.println(name + "이(가) 잠을 잔다.");
    }


    public String getName() {
        return name;
    }


}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(getName() + " : 왈왈!");
    }


}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override // 재정의 : 상위 클래스 메서드를 고쳐서 사용한다.
    public void eat() {
        System.out.println(getName() + "이(가) 생선을 조심스럽게 먹습니다.");
    }

    public void meow(){
        System.out.println(getName() + ": 야옹~");
    }

}


public class AnimalTest {
    static Dog dog = new Dog("강아지");


    public static void main(String[] args) {
        dog.eat();

        Cat cat = new Cat("뚜식");
        cat.eat();
        cat.meow();

        dog.bark();
        dog.sleep();


        // 5.4 + 3.5

    }

}





