package Day15.Polymorphism;

class Animal {

    public void eat() {
        System.out.println("I eat");
    }

    public void eat(String food) {
        System.out.println("I eat " + food);
    }

    public void sleep() {
        System.out.println("I sleep");
    }

    public void makeSound() {
        System.out.println("I make sound");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("I bark");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("I meow");
    }
}

public class Main {

    public static void main(String[] args) {
        // Polymorphism:
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        // method overriding: same method but based on which object created:
        a1.makeSound();
        a2.makeSound();
        // method overloading: same method name but diff parameters
        a1.eat("Chocolate roll");
        a2.eat();
    }
}
