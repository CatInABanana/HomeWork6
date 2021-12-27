package Main;

public class Main {

    public static void main(String[] args) {

        Animal dog01 = new Dog("Шарик");
        Cat cat01 = new Cat("Снежок");

        dog01.run(400);
        dog01.run(800);
        dog01.swim(5);
        dog01.swim(15);
        cat01.run(100);
        cat01.run(300);
        cat01.swim(0);

        Counter();

    }

    public static void Counter(){
        System.out.printf("Создано %d животных. Из них: \n%d собак и %d кошек.", Animal.animalCount, Dog.dogCount, Cat.catCount);
    }

}
