package Animal;

public class App {
    public static void main(String[] args) {
        Dog john = new Dog("John Wick", 15);
        john.makeSound();
        john.printInfo();

        System.out.println();

        Cat bob = new Cat("Bob Swarcheneger", 70);
        bob.makeSound();
        bob.printInfo();

        System.out.println();

        Animal por = new Dog("John Makardi", 0);
        por.makeSound();
        por.printInfo();
        
    
    }
}
