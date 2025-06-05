package hello;
class Animal{
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }

    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }

    void fetch() {
        System.out.println("Dog is fetching the ball.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }

    void climb() {
        System.out.println("Cat is climbing the tree.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        System.out.println("Dog Actions:");
        myDog.eat();
        myDog.sleep();
        myDog.makeSound();
        myDog.bark();
        myDog.fetch();

        System.out.println("\nCat Actions:");
        myCat.eat();
        myCat.sleep();
        myCat.makeSound();
        myCat.meow();
        myCat.climb();
    }
}
