//Abstract Class - Animal(parent)
abstract class Animal {
    abstract void makeSound();
}
//Sub class - Dog
class Dog extends Animal {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
    @Override//Abstract method implementation
    void makeSound() {
        System.out.println("Dog is barking.....");
    }
}
