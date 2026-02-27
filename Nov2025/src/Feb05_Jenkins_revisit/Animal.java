package Feb05_Jenkins_revisit;



public class Animal {
    String animal;

}

class Dog extends Animal{

}
class Test{
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(dog instanceof Object);
    }
}