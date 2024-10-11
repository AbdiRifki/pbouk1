public class main {
    public static void main(String[] args){
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("kucing");

        Animal animal;
        animal = dog;
        animal.makeSound();

        animal = cat;
        animal.makeSound();
    }
}
