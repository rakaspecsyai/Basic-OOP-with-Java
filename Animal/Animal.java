package Animal;
class Animal{
    void makeSound(){

    };
    void printInfo(){
        
    };
}

class Dog extends Animal{
    String name;
    int age;

    public Dog(String dogName, int dogAge){
        name = dogName;
        age = dogAge;
    }

    public void makeSound() {
        System.out.println("Woof woof!");    
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Cat extends Animal{
    String name;
    int age;
    
    public Cat(String catName, int catAge) {
        name = catName;
        age = catAge;
    }

    public void makeSound() {
        System.out.println("Meow meow!");
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}