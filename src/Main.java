public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();

    }
}
